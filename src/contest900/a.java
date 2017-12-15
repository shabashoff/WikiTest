package contest900;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr;
        int x,n;
        arr = in.readLine().split(" ");
        n = Integer.valueOf(arr[0]);

        int sum1=0;
        int sum2=0;
        for (int i = 0; i < n; i++) {
            arr = in.readLine().split(" ");
            x = Integer.valueOf(arr[0]);
            if (x>0){
                sum1++;
            }else{
                sum2++;
            }
        }

        if (sum1<=1 || sum2<=1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }

}