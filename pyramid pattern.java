import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int sp = 1; sp <= n - row; sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st < row * 2 - 1; st++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}