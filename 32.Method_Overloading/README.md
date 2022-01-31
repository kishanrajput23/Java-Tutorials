# Java Tutorial: Method Overloading in Java
- In Java, it is possible for a class to contain two or more methods with the same name but with different parameters. Such methods are called Overloaded methods.
- Method overloading is used to increase the readability of the program.
```
void foo()
void foo(int a)	//Overloaded function foo
int foo(int a, int b)
```

### Ways to perform method overloading : 
- In Java, method overloading can be performed by two ways listed below :
1.By changing the return type of the different methods
2. By changing the number of arguments accepted by the method

- Now, let's have an example to understand the above ways of method overloading :

### 1. By changing the return type :
- In the below example, we've created a class named calculate.
- In the calculate class, we've two methods with the same name i.e. multiply
- These two methods are overloaded because they have the same name but their return is different.
- The return type of 1st method is int while the return type of the other method is double.

```
class calculate{
     int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
         return  a*b;
    }

public static void main(String[] args) {

        calculate obj = new calculate();
        int c = obj.multiply(5,4);
        double d = obj.multiply(5.1,4.2);
        System.out.println("Mutiply method : returns integer : " + c);
        System.out.println("Mutiply method : returns double : " +  d);

}
}
```

```
Output : 
Mutiply method : returns integer : 20
Mutiply method : returns double : 21.419999999999998
 ```

### 2. By changing the number of arguments passed :
- Again, we've created two methods with the same name i.e., multiply
- The return type of both the methods is int.
- But, the first method 2 arguments and the other method accepts 3 arguments.
- Example :

```
class calculate{
     int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
         return  a*b*c;
    }

public static void main(String[] args) {

        calculate obj = new calculate();
        int c = obj.multiply(5,4);
        int d = obj.multiply(5,4,3);
        System.out.println(c);
        System.out.println(d);

}
}
```

```
Output :
20
60
```

**Note:** Method overloading cannot be performed by changing the return type of methods.

### Code as described in the video:
```
public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }

    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!"); 
    }

    static void change(int a){
        a = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void tellJoke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        // tellJoke();

        // Case 1: Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);


        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!


    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-32/Ch7.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-32/UltimateJavaCheatSheet.pdf)**
