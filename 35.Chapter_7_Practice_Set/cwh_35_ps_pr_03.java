public class cwh_35_ps_pr_03 {
    static int recursive_sum(int n) {
        if (n==1) {
            return 1;
        }
        else {
            return n + recursive_sum(n-1);
        }
        
    }
    public static void main(String args[]) {
        System.out.println(recursive_sum(5));
    }
}