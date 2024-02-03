import pygame
import sys
import random

# Initialize Pygame
pygame.init()

# Constants
WIDTH, HEIGHT = 800, 600
CAR_WIDTH, CAR_HEIGHT = 50, 100
ENEMY_CAR_WIDTH, ENEMY_CAR_HEIGHT = 50, 100
FPS = 60

# Colors
WHITE = (255, 255, 255)
BLUE = (0, 0, 255)

# Create the screen
screen = pygame.display.set_mode((WIDTH, HEIGHT))
pygame.display.set_caption("Racing Game")

# Load the player's car image
player_car_img = pygame.image.load("car.png").convert_alpha()
player_car_img = pygame.transform.scale(player_car_img, (CAR_WIDTH, CAR_HEIGHT))
player_car_rect = player_car_img.get_rect(center=(WIDTH // 2, HEIGHT - CAR_HEIGHT // 2))

# Load the road image
road_img = pygame.image.load("road.jpg").convert()

# Create a list to store enemy cars
enemy_cars = []

# Scoring variable
score = 0
font = pygame.font.Font(None, 36)

# Clock to control the frame rate
clock = pygame.time.Clock()

# Function to create a new enemy car
def create_enemy_car():
    x = random.randint(0, WIDTH - ENEMY_CAR_WIDTH)
    y = random.randint(-HEIGHT, 0)
    return pygame.Rect(x, y, ENEMY_CAR_WIDTH, ENEMY_CAR_HEIGHT)

# Main game loop
while True:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            pygame.quit()
            sys.exit()

    # Get the state of all keys
    keys = pygame.key.get_pressed()

    # Move the player's car based on the arrow keys
    if keys[pygame.K_LEFT] and player_car_rect.left > 0:
        player_car_rect.x -= 5
    if keys[pygame.K_RIGHT] and player_car_rect.right < WIDTH:
        player_car_rect.x += 5

    # Move enemy cars and check for collisions
    for enemy_car in enemy_cars:
        enemy_car.y += 5  # Adjust the speed of enemy cars
        if player_car_rect.colliderect(enemy_car):
            pygame.quit()
            sys.exit()

    # Remove off-screen enemy cars
    enemy_cars = [car for car in enemy_cars if car.y < HEIGHT]

    # Create a new enemy car with a random chance
    if random.random() < 0.02:
        enemy_cars.append(create_enemy_car())

    # Update the score
    score += 1

    # Display the score
    score_text = font.render(f"Score: {score}", True, BLUE)

    # Update the screen
    screen.blit(road_img, (0, 0))  # Draw the road background
    screen.blit(player_car_img, player_car_rect)

    # Draw and move enemy cars
    for enemy_car in enemy_cars:
        pygame.draw.rect(screen, BLUE, enemy_car)

    screen.blit(score_text, (10, 10))

    # Refresh the display
    pygame.display.flip()

    # Cap the frame rate
    clock.tick(FPS)
