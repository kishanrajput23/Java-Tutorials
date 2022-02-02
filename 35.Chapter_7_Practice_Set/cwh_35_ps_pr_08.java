public class cwh_35_ps_pr_08 {
    static void pattern_rec(int n) {
        if (n > 0) {
            pattern_rec(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        pattern_rec(5);
    }
}