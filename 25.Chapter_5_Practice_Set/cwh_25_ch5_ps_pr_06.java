import java.util.*;

public class cwh_25_ch5_ps_pr_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        while (n>0) {
            fact *= n;
            n -= 1;
        }
        System.out.println(fact);
    }
}