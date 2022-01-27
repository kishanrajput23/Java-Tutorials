# Java Tutorial: While Loops in Java
- In programming languages, loops are used to execute a particular statement/set of instructions again and again.
- The execution of the loop starts when some conditions become true.
- For example, print 1 to 1000, print multiplication table of 7, etc.
- Loops make it easy for us to tell the computer that a given set of instructions need to be executed repeatedly.

### Types of Loops :
- Primarily, there are three types of loops in Java:
- While loop
- do-while loop
- for loop
- Let's look into these, one by one.

### While loops :
- The while loop in Java is used when we need to execute a block of code again and again based on a given boolean condition.
- Use a while loop if the exact number of iterations is not known.
- If the condition never becomes false, the while loop keeps getting executed. Such a loop is known as an infinite loop.
```
/*
while (Boolean condition)

{

            // Statements    -> This keeps executing as long as the condition is true.

}
*/
```
- Example
```
int i=10;  
while(i>0){  
System.out.println(i);  
i--;  
}  
```

### Flow control of while loop :

![image](https://user-images.githubusercontent.com/70385488/151346565-307ba28b-49a1-4f2a-8ae1-3fc1241722ee.png)

**Quick Quiz:** Write a program to print natural numbers from 100 to 200.

### Code as described in the video :

```
public class cwh_21_ch5_loops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println("Using Loops:");
        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");

//        while(true){
//            System.out.println("I am an infinite while loop!");
//        }
    }
}
```

- This is all for this tutorial, and we will discuss the do-while loop in the next tutorial.

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-21/Chapter_5.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-21/UltimateJavaCheatSheet.pdf)**
