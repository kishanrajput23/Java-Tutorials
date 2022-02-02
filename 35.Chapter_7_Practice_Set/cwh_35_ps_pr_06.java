public class cwh_35_ps_pr_06 {
    static int avg(int ...arr) {
        int len = arr.length;
        int sum = 0;
        for (int element:arr) {
            sum += element;
        }
        int average = sum / len;
        return average;
    }
    public static void main(String args[]) {
        System.out.println(avg(1,2,3,4,5,34,564,234));
    }
}