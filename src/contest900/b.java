package contest900;

import java.io.IOException;
import java.util.Scanner;


public class b {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a, b, c, k, n, p;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        p = 0;
        while (true) {
            if (a < b) {
                a *= 10;
                if (c == 0 && a < b) {
                    System.out.println(p + 1);
                    return;
                }
                p++;
            } else {
                k = a % b;
                n = (int) Math.floor(a / b);
                a = k;
                if (n == c) {
                    System.out.println(p);
                    return;
                }
                if (k == 0) {
                    if (c == 0) {
                        System.out.println(p + 1);
                    } else {
                        System.out.println(-1);
                    }
                    return;
                }
                if (p > 1000000) {
                    System.out.println(-1);
                    return;
                }
            }
        }

    }

}