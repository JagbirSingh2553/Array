package Day1;

public class second_largest {
    public static void main(String[] args) {
        int [] arr = {20, 10, 20, 12};
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i = 0 ; i<= arr.length -1 ; i++ ){

            if(arr[i]>max){
                second_max = max;
                max = arr[i];
            }
            else if(arr[i]>second_max && arr[i] != max){
                second_max = arr[i];
            }
        }
        System.out.println(second_max);
        System.out.println(max);
    }
    
}
