package contest903;

import java.util.Scanner;

public class a {

    private static boolean canOrNot(int x){
        if (x<0) return false;
        if (x==0) return true;
        if (canOrNot(x-7) || canOrNot(x-3)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a ;
        for (int i = 0; i < n; i++) {
            a = scanner.nextInt();
            System.out.println(canOrNot(a) ? "YES" : "NO");
        }
    }
}