import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long x = sc.nextLong();
            boolean found = false;
            for (long a = 1; a * a * a <= x; a++) {
                long b = (long) Math.cbrt(x - a * a * a);
                if (b >= 1 && b * b * b + a * a * a == x) {
                    found = true;
                    break;
                }
            }
            System.out.println(found ? "YES" : "NO");
        }

        sc.close();
    }
}
