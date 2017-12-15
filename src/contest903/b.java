package contest903;
import java.util.*;

public class b {

    private static boolean canOrNot(int x){
        if (x<0) return false;
        if (x==0) return true;
        if (canOrNot(x-7) || canOrNot(x-3)) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int a1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int a2 = scanner.nextInt();
        ArrayList<String> queue = new ArrayList<String>(100);
        while(h2>0){
            if (h2-a1<=0){
                queue.add("STRIKE");
                h2-=a1;
            }else{
                if (a2>=h1){
                    queue.add("HEAL");
                    h1+=c1;
                }else{
                    queue.add("STRIKE");
                    h2-=a1;
                }
                h1-=a2;
            }
        }
        System.out.println(queue.size());
        for (String s : queue) {
            System.out.println(s);
        }
    }
}