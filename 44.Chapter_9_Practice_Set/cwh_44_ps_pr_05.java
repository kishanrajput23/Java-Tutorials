class Sphere {
    private double radius;
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double volume() {
        return (4 * Math.PI * radius * radius * radius) / 3;
    }
}

public class cwh_44_ps_pr_05 {
    public static void main(String args[]) {
        Sphere rad = new Sphere();
      
        rad.setRadius(2.5);
        
        System.out.println(rad.getRadius());
        System.out.println(rad.volume());
    }
}