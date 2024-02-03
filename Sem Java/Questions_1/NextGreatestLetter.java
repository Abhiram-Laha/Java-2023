package Questions_1;

public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';

        System.out.println(nextGreatestLetter(letters, target));
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int end = letters.length - 1;
        int start = 0;

        if(target>=letters[end]){
            return letters[start];
        }
        while (start <= end) 
        {
                int mid = start + (end - start) / 2;
                if (target < letters[mid]) 
                {
                    end = mid - 1;
                } 
                else 
                {
                    start= mid + 1;
                }
        }
    return letters[start%letters.length];  
    }
}
