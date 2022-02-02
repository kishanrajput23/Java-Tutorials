public class cwh_35_ps_pr_05 {
    static int fibonacci(int n) {
        if ( n==1 || n == 2) {
            return (n-1);
        }
        else {
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }
    public static void main(String args[]) {
        System.out.println(fibonacci(5));
    }
}