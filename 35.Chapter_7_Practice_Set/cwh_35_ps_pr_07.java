public class cwh_35_ps_pr_07 {
    static void pattern_rec(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
            pattern_rec(n - 1);
        }
        
    }
    public static void main(String args[]) {
        pattern_rec(5);
    }
}