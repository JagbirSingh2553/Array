package Day1;

public class revserse {
    public static void main(String[] args) {
        int[] arr = {3,5,1,2,7,6,4};
        int temp = 0;
        for(int left=0, right = arr.length-1; left<right; left++, right--){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
