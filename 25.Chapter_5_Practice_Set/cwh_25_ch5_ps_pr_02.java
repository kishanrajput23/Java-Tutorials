import java.util.*;

public class cwh_25_ch5_ps_pr_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i += 1;
        }
        System.out.println(sum);
    }
}