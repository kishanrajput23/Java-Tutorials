import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e;
        float result, percentage;
        System.out.println("Enter your marks respectively");
        
        System.out.println("Enter your marks in Hindi Subject");
        a = sc.nextInt();
        
        System.out.println("Enter your marks in English Subject");
        b = sc.nextInt();
        
        System.out.println("Enter your marks in Math Subject");
        c = sc.nextInt();
        
        System.out.println("Enter your marks in Physics Subject");
        d = sc.nextInt();
        
        System.out.println("Enter your marks in Chemistry Subject");
        e = sc.nextInt();
        
        result = a + b + c + d + e;
        percentage = (result/500) * 100;
        
      System.out.println("Your percentage is " + percentage);
    }
}
