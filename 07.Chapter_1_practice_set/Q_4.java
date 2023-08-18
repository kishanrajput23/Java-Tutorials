import java.util.Scanner;

public class Q_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double kilometers;
        System.out.println("Please enter kilometers:");
        kilometers = sc.nextDouble();

        double miles = kilometers / 1.6;

        System.out.println(miles + " Miles");
    }
}