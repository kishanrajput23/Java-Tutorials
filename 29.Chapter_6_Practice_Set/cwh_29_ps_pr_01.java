public class cwh_29_ps_pr_01 {
    public static void main(String[] args) {
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 10.3f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);
    }
}