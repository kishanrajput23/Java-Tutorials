# Java Tutorial: Methods in Java
- Sometimes our program grows in size, and we want to separate the logic of the main method from the other methods.
- For instance, if we calculate the average of a number pair 5 times, we can use methods to avoid repeating the logic. [DRY – Don’t Repeat Yourself]

### Syntax of a Method
- A method is a function written inside a class. Since Java is an object-oriented language, we need to write the method inside some class.
- Syntax of a method : 
```
returnType nameOfMethod() {
//Method body
}
```
- The following method returns the sum of two numbers
```
int mySum(int a, int b) {
	int c = a+b;
	return c;	//Return value
}
```

- In the above method, int is the return data type of the mySum function.
- mySum takes two parameters: int a and int b.
- The sum of two values integer values(a and b) is stored in another integer value named 'c'.
- mySum returns c.

### Calling a Method : 
- A method can be called by creating an object of the class in which the method exists followed by the method call:
```
Calc obj = new Calc(); //Object Creation

obj.mySum(a , b); //Method call upon an object
```
- The values from the method call (a and b) are copied to the a and b of the function mySum. Thus even if we modify the values a and b inside the method, the values in the main method will not change.

### Void return type : 
- When we don’t want our method to return anything, we use void as the return type.

### Static keyword : 
- The static keyword is used to associate a method of a given class with the class rather than the object.
- You can call a static method without creating an instance of the class.
- In Java, the main() method is static, so that JVM can call the main() method directly without allocating any extra memory for object creation. 
- All the objects share the static method in a class.

### Process of method invocation in Java : 
- Consider the method Sum of the calculate class as given in the below code :

```
class calculate{
     int sum(int a,int b){
        return a+b;
    }
```

- The method is called like this:

```
class calculate{
     int sum(int a,int b){
        return a+b;
    }

public static void main(String[] args) {
         
        calculate obj = new calculate();
        int c = obj.sum(5,4);
        System.out.println(c);
    }
}
```
```
Output : 9
```
- Inside the main() method, we've created an object of the calculate class.
- obj is the name of the calculate class.
- Then, we've invoked the sum method and passed 5 and 4 as arguments.

**Note:** In the case of Arrays, the reference is passed. The same is the case for object passing to methods.

### Code as described in the video:
```
package com.company;

public class cwh_31_methods {

    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x +y) * 5;
        }
        x = 566;
        return z;
    }


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using Object creation
        //cwh_31_methods obj = new cwh_31_methods();
        //c = obj.logic(a, b);
        c = logic(a, b);
        System.out.println(a + " "+ b);
        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-31/Ch7.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-31/UltimateJavaCheatSheet.pdf)**
