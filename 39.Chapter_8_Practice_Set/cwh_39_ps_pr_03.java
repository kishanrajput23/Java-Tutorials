class Square {
    int side;
    
    public int perimeter() {
        return (4 * side);
    }
    
    public int area() {
        return side * side;
    }
}

public class cwh_39_ps_pr_03 {
    public static void main(String args[]) {
        Square sq = new Square();
        sq.side = 5;
        System.out.println(sq.perimeter());
        System.out.println(sq.area());
    }
}