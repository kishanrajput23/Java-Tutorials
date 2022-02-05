class Circle {
    double radius;
    
    public double perimeter() {
        return (2 * radius * Math.PI);
    }
    
    public double area() {
        return (Math.PI * radius * radius);
    }
}

public class cwh_39_ps_pr_06 {
    public static void main(String args[]) {
        Circle cir = new Circle();
        cir.radius = 5.5;
        System.out.println(cir.perimeter());
        System.out.println(cir.area());
    }
}