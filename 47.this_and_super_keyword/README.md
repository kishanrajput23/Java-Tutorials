# this and super keyword in Java

### this keyword in Java :
- this is a way for us to reference an object of the class which is being created/referenced.
- It is used to call the default constructor of the same class.
- this keyword eliminates the confusion between the parameters and the class attributes with the same name. Take a look at the example given below :

```
class cwh{
    int x;

//    getter of x
    public  int getX(){
        return  x;
    }

    // Constructor with a parameter
    cwh(int x) {
        x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        cwh obj1 = new cwh(65);
        System.out.println(obj1.getX());

    }
}
```

```
Output :
0
```

- In the above example, the expected output is 65 because we've passed x=65 to the constructor of the cwh class. But the compiler fails to differentiate between the parameter 'x' & class attribute 'x.' Therefore, it returns 0.

- Now, let's see how we can handle this situation with the help of this keyword. Take a look at the below code :

```
class cwh1{
    int x;

//    getter of x
    public  int getX(){
        return  x;
    }

    // Constructor with a parameter
    cwh(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        cwh obj1 = new cwh(65);
        System.out.println(obj1.getX());

    }
}
```

```
Output :
65
```

- Now, you can see that we've got the desired output

### Super keyword 
- A reference variable used to refer immediate parent class object.
- It can be used to refer immediate parent class instance variable.
- It can be used to invoke the parent class method.

 
### Code as described in the video:

```
import javax.print.Doc; 
class EkClass{ 
    int a; 
    public int getA() { 
        return a; 
    }
    
    EkClass(int a) { 
        this.a = a;
    } 
    
    public int returnone() {
        return 1; 
    } 
} 

class DoClass extends EkClass { 
    DoClass(int c) { 
        super(c); 
        System.out.println("I am a constructor"); 
    } 
} 
    
public class cwh_47_this_super { 
    public static void main(String[] args) {
        EkClass e = new EkClass(65); 
        DoClass d = new DoClass(5); 
        System.out.println(e.getA()); 
    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-47/JavaChapter10.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-47/UltimateJavaCheatSheet.pdf)**
