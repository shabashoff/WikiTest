package contest903;

import java.util.*;

public class c {

    private static boolean canOrNot(int x){
        if (x<0) return false;
        if (x==0) return true;
        if (canOrNot(x-7) || canOrNot(x-3)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr, (o1, o2) -> Integer.compare(o2, o1));
        int pred = arr[0];
        int len = 0;
        int currLen = 1;
        for (int i = 1; i < n; i++) {
            if (pred!=arr[i]){
                pred = arr[i];
                len = Integer.max(len,currLen);
                currLen=1;
            }else {
                currLen++;
            }
        }
        len = Integer.max(len,currLen);
        System.out.println(len);
    }
}