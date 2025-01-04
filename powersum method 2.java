import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int power = 1;
        for(int i = 1; i <= m; i++)
        {
            power *= n;
        }
        System.out.println(power);

    }

}