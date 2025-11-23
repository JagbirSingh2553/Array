package Day2;

public class Remove_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};
        int a = 0, b =arr.length-1;
        for(int i = 0; i<=b;i++){
            if(arr[i] != arr[a]){
                a++;
                arr[a] = arr[i];
            }    
        }
        for (int i = 0; i <= a; i++) {
            System.out.println(arr[i]);
        }
        
    }
}

