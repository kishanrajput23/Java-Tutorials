class Cylinder {
    private double height;
    private double radius;
    
    public void setRadius(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }
    
    public void setHeight(double h) {
        this.height = h;
    }
    public double getHeight() {
        return height;
    }
}

public class cwh_44_ps_pr_01 {
    public static void main(String args[]) {
        Cylinder rad = new Cylinder();
        Cylinder hgt = new Cylinder();
      
        rad.setRadius(2.5);
        hgt.setHeight(5);
        
        System.out.println(rad.getRadius());
        System.out.println(hgt.getHeight());
    }
}