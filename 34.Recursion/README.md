# Java Tutorial: Recursion in Java

**One does not simply understand RECURSION without understanding RECURSION.**

- In programming, recursion is a technique through which a function calls itself.
- With the help of recursion, we can break down complex problems into simple problems.
- Example: Factorial of a number
```
//factorial(n) = n*factorial(n-1)                 [n >= 1]
```

- Now, let's see an example to see the beauty of recursion in programming. First, we will print numbers from 1 to n and then n to 1 using recursion.

### Program for printing 1 to n : 

```
class recursion {
    static void fun2(int n){
        if(n>0){
            fun2(n-1);
            System.out.println(n);
        }
}

public static void main(String[] args){
        int n = 3;
        fun2(n);
}
}
```

- Output :
```
1
2
3
```

- In the above code, the print statement is getting executed at returning time. Watch the video given below to get the proper understanding of the recursive tree for the above program :

### Program for printing n to 1 : 
```
class recursion {
    static void fun1(int n){
        if(n>0){
            System.out.println(n);
            fun1(n-1);
        }
}
public static void main(String[] args){
        int n = 3;
        fun1(n);
}
}
```

- Output :
```
3
2
1
```
- In the above recursive code, the print statement is getting executed at the calling time. Before the recursive function is called, printing was done. Watch the video given below to get the proper understanding of the recursive tree for the above program :

- Notice that by just changing the order of the print statement, the output of the code is completely reversed. This is the beauty of recursion. The same trick can be used to reverse a linked list.

**Quick Quiz:** Write a program to calculate (recursion must be used) factorial of a number in Java?

```
public class cwh_34_recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int x = 0;
        System.out.println("The value of factorial x is: " + factorial(x));
        System.out.println("The value of factorial x is: " + factorial_iterative(x));
    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-34/Ch7.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-34/UltimateJavaCheatSheet.pdf)**
