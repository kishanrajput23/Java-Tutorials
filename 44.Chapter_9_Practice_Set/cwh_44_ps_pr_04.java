class Rectangle {
    private int length;
    private int breadth;
    
    public Rectangle() {
        length = 5;
        breadth = 5;
    }
    
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int getLength() {
        return length;
    }
    
    public int getBreadth() {
        return breadth;
    }
}

public class cwh_44_ps_pr_04 {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle(80, 40);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
    }
}