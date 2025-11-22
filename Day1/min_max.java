package Day1;

public class min_max {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,7,6,4};
        int max = arr[0];
        int min = arr[0];

        for(int i = 0 ; i<= arr.length -1 ; i++ ){

            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}