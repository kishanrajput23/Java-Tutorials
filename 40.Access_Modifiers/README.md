# Java Tutorial: Access modifiers, getters & setters in Java

### Access Modifiers
- Access Modifiers specify where a property/method is accessible. There are four types of access modifiers in java :
1. private
2. default
3. protected
4. public

|  **Access Modifier**  |	 **within class**  |	 **within package**  |	 **outside package by subclass only**  |	 **outside package**  |
|:---------------------:|:------------------:|:---------------------:|:---------------------------------------:|:----------------------:|
|  **public**  |	 Y  |	 Y  |	 Y  |	 Y  |
|**protected**	 |	 Y  |	 Y  |	 Y  |	 N  |
|**Default**	 |	 Y  |	 Y  |	 N  |	 N  |
|**private**	 |	 Y  |	 N  |	 N  |	 N  |

- From the above table, notice that the private access modifier can only be accessed within the class. So, let's try to access private modifiers outside the class :

```
class Employee {

    private int id;
    private  String name;

}

public  class CWH {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 3;
        emp1.name = "Shubham";

    }
}
```
```
Output :
java: id has private access in Employee
```

- You can see that the above code produces an error that we're trying to access a private variable outside the class. So, is there any way by which we can access the private access modifiers outside the class? The answer is Yes! We can access the private access modifiers outside the class with the help of getters and setters.

### Getters and Setters :
- Getter ➼   Returns the value  [accessors]
- setter ➼    Sets / updates the value  [mutators]
- In the below code, we've created total 4 methods:
1. setName(): The argument passed to this method is assigned to the private variable name.
2. getName(): The method returns the value set by the setName() method.
3. setId(): The integer argument passed to this method is assigned to the private variable id.
4. getId): This method returns the value set by the setId() method.

```
class Employee {

    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class CWH1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setName("Shubham");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());

    }
}
```
```
Output :
Shubham
1
```

- As you can see that we've got our expected output. So, that's how we use the getters and setters method to get and set the values of private access modifiers outside the class.

### Code as described in the video:

```
class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(234);
        System.out.println(harry.getId());
    }
}
```

**Quick Quiz:** use the getters and setters from the main method 

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-40/Chapter9.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-40/UltimateJavaCheatSheet.pdf)**
