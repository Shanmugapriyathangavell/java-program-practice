import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                System.out.println("Perfect Square");
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println(" Not a Perfect Square");
        }
    }
}
