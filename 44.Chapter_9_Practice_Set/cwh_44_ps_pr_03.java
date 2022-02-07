class Cylinder {
    private double height;
    private double radius;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    public double surfaceArea() {
        return (2* Math.PI * radius * radius) + (2*Math.PI * radius * height);
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

public class cwh_44_ps_pr_03 {
    public static void main(String args[]) {
        Cylinder mycylinder = new Cylinder(5, 9.8);
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}