import java.util.Scanner;

public class cwh_12_ps2_pr_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter v : ");
        int v = sc.nextInt();
        
        System.out.print("Enter u : ");
        int u = sc.nextInt();
        
        System.out.print("Enter s : ");
        int s = sc.nextInt();
        
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        
        double result = (v*v - u*u) / (2*a*s);
        System.out.print("Result is : " + result);
    }
}