import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 39; i++) {
            System.out.print(i + "  ");
        }
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            if ((100 % (i + 1)) == 0) {
                a[i] = 100 * i;
            } else {
                a[i] = 56;
            }
        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();

    }
}
