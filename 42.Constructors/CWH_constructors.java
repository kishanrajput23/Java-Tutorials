class Employee {
// First constructor
    Employee(String s, int i){
        System.out.println("The name of the first employee is : " + s);
        System.out.println("The id of the first employee is : " + i);
    }
//    Constructor overloaded
    Employee(String s, int i, int salary){
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The id of the second employee is : " + i);
        System.out.println("The salary of second employee is : " + salary);
    }

}
public class CWH_constructors {
    public static void main(String[] args) {
        Employee shubham = new Employee("Shubham",1);
        Employee harry = new Employee("Harry",2,70000);

    }
}