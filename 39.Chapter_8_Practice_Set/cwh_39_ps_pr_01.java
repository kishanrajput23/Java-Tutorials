class Employee {
    int salary;
    String name;
    
    public int getSalary() {
        return salary;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
}

public class cwh_39_ps_pr_01 {
    public static void main(String args[]) {
        Employee kishan = new Employee();
        kishan.setName("Let's Code Together");
        kishan.salary = 50000;
      
      //kishan.name = "Kishan";
      
        System.out.println(kishan.getSalary());
        System.out.println(kishan.getName());
    }
}