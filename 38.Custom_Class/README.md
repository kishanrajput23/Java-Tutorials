# Java Tutorial: Creating Our Own Java Class
### Writing a Custom Class : 
- Syntax of a custom class :

```
class <class_name>{  
    field;  
    method;  
}  
```

- Example :

```
public class Employee {
	int id;			// Attribute 1
	String name;		// Attribute 2
}
```

**Note:** The first letter of a class should always be capital.

- Any real-world object        = Properties + Behavior
- Object in OOPs               = Attributes + Methods

### A Class with Methods : 
- We can add methods to our class Employee as follows:

```
/*
public class Employee {
	public int id;
	public String name;

	public int getSalary(){
		//code
		}
	public void getDetails(){
		//code
		}
	};
*/
```
 
### Code as Described in the Video

```
class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee(); // Instantiating a new Employee Object
        Employee john = new Employee(); // Instantiating a new Employee Object

        // Setting Attributes for Harry
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        // Setting Attributes for John
        john.id = 17;
        john.salary = 12;
        john.name = "John Khandelwal";

        // Printing the Attributes
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-38/Ch8.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-38/UltimateJavaCheatSheet.pdf)**
