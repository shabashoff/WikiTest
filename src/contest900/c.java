package contest900;

import java.io.IOException;
import java.util.Scanner;


public class c {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] resultArr;
        int n;
        n = in.nextInt();
        resultArr = new int[n];

        for (int i = 0; i < n; i++) {
            resultArr[i] = in.nextInt();
        }

        int[] helpArr = new int[n];
        int[] result = new int[n + 1];
        for (int i = 0; i < n; i++) {
            helpArr[i] = -1;
            result[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (resultArr[i] < resultArr[j]) {
                    if (helpArr[i] == -1) {
                        helpArr[i] = resultArr[j];
                    } else {
                        helpArr[i] = 0;
                        break;
                    }
                }
            }
        }
        int minZero = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (helpArr[i] > 0) {
                result[helpArr[i]]++;
            } else {
                if (helpArr[i] == 0) {
                    minZero = Integer.min(minZero, resultArr[i]);
                }
            }
        }
        int nMax = 1;
        for (int i = 1; i < n + 1; i++) {
            if (result[nMax] < result[i]) {
                nMax = i;
            }
        }
        if (result[nMax] == 0 && minZero != Integer.MAX_VALUE) {
            nMax = minZero;
        } else {
            if (result[nMax] == 1 && nMax > minZero) {
                nMax = minZero;
            }
        }
        //System.out.println(Arrays.toString(helpArr));
        //System.out.println(Arrays.toString(result));
        System.out.println(nMax);


    }

}
