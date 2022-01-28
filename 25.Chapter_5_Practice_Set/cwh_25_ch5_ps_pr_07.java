import java.util.*;

public class cwh_25_ch5_ps_pr_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n,j;
        while(i>0) {
           j=0;
           while(j++<i)
           {
               System.out.print("*");
           }
           System.out.println();
           i--;
        }
    }
}