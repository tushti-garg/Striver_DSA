import java.util.*;
public class For_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();  // starting number
        int n = sc.nextInt();  // ending number

        int count = n - i + 1; // number of terms
        int sum = (count * (i + n)) / 2; // AP sum formula

        System.out.println("Sum : " + sum);
    }
}
