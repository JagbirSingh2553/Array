package Day2;

public class Reverse {
    public void reverse(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }        
    }
    public static void main(String[] args) {
        String a = "hello how are you?";
        char [] s = a.toCharArray();
        Reverse obj = new Reverse();
        obj.reverse(s);
        for (char c : s) {
            System.out.print(c);
        }
    }
}
