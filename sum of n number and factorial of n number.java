import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int factorial = 1;
        int even_sum = 0;
        int odd_sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            factorial *= i;
            if (i % 2 == 0)
                even_sum += i;
            if (i % 2 != 0)
                odd_sum += i;
        }
        System.out.println(sum);
        System.out.println(odd_sum);
        System.out.println(even_sum);
        System.out.println(factorial);
    }
}
