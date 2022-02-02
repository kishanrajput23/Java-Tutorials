public class cwh_35_ps_pr_10 {
    static int sum(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println(sum(5));
    }
}