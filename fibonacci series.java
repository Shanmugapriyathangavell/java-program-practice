import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fir = 1;
        int sec = 1;
        for (int i = 1; i <= n; i++) {
            int next = fir + sec;
            System.out.println(fir + " ");
            fir = sec;
            sec = next;
        }
    }
}