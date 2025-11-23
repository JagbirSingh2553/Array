package Day2;

public class Remove_zeros {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 0, 0, 4, 5, 0, 0, 0};
        int a = 0, b = arr.length - 1;
        for (int i = 0; i <= b; i++) {
            if (arr[i] != 0) {
                arr[a] = arr[i];
                a++;
            }
        }
        for (int i = 0; i <= a; i++) {
            System.out.println(arr[i]);
        }
    }
}
