import java.util.*;

public class cwh_25_ch5_ps_pr_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}