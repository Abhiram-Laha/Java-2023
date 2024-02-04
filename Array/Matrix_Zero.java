public class Matrix_Zero {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        int[][] new_arr = new int[3][];

        print(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == 0){
                    System.out.println(i+" -- "+j);
                    new_arr = Make(arr, i, j);
                    break;
                }
            }
            
        }

        System.out.println("\nAfter Change : ");
        print(new_arr);
        print(arr);

        
    }

    public static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] Make(int[][] arr,int i,int j){
        //row zero

        for (int j2 = 0; j2 < arr[i].length; j2++) {
            arr[i][j2] = 0;
        }

        // col zero

        for (int i2 = 0; i2 < arr.length; i2++) {
            arr[i2][j] = 0;
        }

        return arr;
    }
}
