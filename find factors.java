import java.util.*;
public class Main {
    public static void main (String[] args)

    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                count++;
                {
                    System.out.println(count);

                }

            }
        }