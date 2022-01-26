public class cwh_19_ch4_ps_pr_01 {
    public static void main(String args[]) {
        int a = 10;
        if (a = 11) {
            system.out.println("I am 11");
        }
        else {
            system.out.println("I am not 11");
        }
        // This program will through an error beacuse in if conditon
        // a=11 is an assignment operator and we can't put assignment operator in if condition
        // if we use a == 11 then will properly run the program
    }
}