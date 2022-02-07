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
    
    public double surfaceArea() {
        return (2* Math.PI * radius * radius) + (2*Math.PI * radius * height);
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

public class cwh_44_ps_pr_02 {
    public static void main(String args[]) {
        Cylinder mycylinder = new Cylinder();
      
        mycylinder.setRadius(2.5);
        mycylinder.setHeight(5);
        
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.getHeight());
        
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}