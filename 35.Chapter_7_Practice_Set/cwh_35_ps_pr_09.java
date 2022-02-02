public class cwh_35_ps_pr_09 {
    static float cel_to_feh(float n) {
        float temp = n * (9/5f) + 32;
        return temp;
    }
    public static void main(String args[]) {
        System.out.println(cel_to_feh(100.5f));
    }
}