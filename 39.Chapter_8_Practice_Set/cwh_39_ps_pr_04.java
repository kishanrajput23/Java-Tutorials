class Rectangle {
    int length;
    int breadth;
    
    public int perimeter() {
        return (2 * length * breadth);
    }
    
    public int area() {
        return length * breadth;
    }
}

public class cwh_39_ps_pr_04 {
    public static void main(String args[]) {
        Rectangle rec = new Rectangle();
        rec.length = 5;
        rec.breadth = 4;
        System.out.println(rec.perimeter());
        System.out.println(rec.area());
    }
}