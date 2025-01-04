import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        if (st %2 == 0) {
            st = st + 1;
        }
        for (int i = st; i <= end; i=i+2) {
            if (count == n) {
                break;
            }
            System.out.println(i);
            count++;
        }


    }
}










