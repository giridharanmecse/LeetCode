import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(s.isPalindrome(num));
        sc.close();

    }
}
