package Questions_1;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr ={1,5,6,12,25,34,44,58,96,100,200,300};
        int target = 97;

        System.out.println("Ceiling of "+target+" is : "+Ceil(arr, target));


    }


    static int Ceil(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start<=end){
            mid = (start + end)/2;

            if(target>arr[mid]){
                start = mid + 1;
            }
            else if(target<arr[mid]){
                end = mid - 1;
            } 
            else if(target==arr[mid]){
                return arr[mid];
            }
        }

        return arr[start];

    }
}
