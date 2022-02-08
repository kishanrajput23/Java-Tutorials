# Inheritance in Java
- You might have heard people saying your nose is similar to your father or mother. Or, more formally, we can say that you've inherited the genes from your parents due to which you look similar to them.
- The same phenomenon of inheritance is also valid in programming.
- In Java, one class can easily inherit the attributes and methods from some other class. This mechanism of acquiring objects and properties from some other class is known as inheritance in Java.
- Inheritance is used to borrow properties & methods from an existing class.
- Inheritance helps us create classes based on existing classes, which increases the code's reusability.
- Examples :

<img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-45/base64.png" alt="">

<img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-45/base64_LPzvgK0.png" alt="">

### Important terminologies used in Inheritance :
- Parent class/superclass: The class from which a class inherits methods and attributes is known as parent class.
- Child class/sub-class: The class that inherits some other class's methods and attributes is known as child class.

<img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-45/base64_2dSyfKW.png" alt="">

### Extends keyword in inheritance :
- The extends keyword is used to inherit a subclass from a superclass. 
- Syntax :

```
class Subclass-name extends Superclass-name  
{  
   //methods and fields  
} 
``` 

- Example :

```
public class dog extends Animal { 
              // code 
             }
```

**Note:** [Java doesn't support multiple inheritances](https://codewithharry.com/videos/java-tutorials-for-beginners-56), i.e., two classes cannot be the superclass for a subclass.

**Quick quiz:** Create a class Animal and Derive another class dog from it.

```
class Animal{
    public void printMe(){
        System.out.println("I am a Animal Class.");
    }
}

class Derived extends Dog{
    public void bark() {
        System.out.println("barking...");
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
    }
}
```

### Code as described in video

```
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-45/Chapter10.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-45/UltimateJavaCheatSheet.pdf)**
