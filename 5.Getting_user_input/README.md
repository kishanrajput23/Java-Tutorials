# Java Tutorial: Getting User Input in Java

### Reading data from the Keyboard :
- Scanner class of java.util package is used to take input from the user's keyboard.
- The Scanner class has many methods for taking input from the user depending upon the type of input. 
- To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class as shown in the below example :

```
import java.util.Scanner;  // Importing  the Scanner class
Scanner sc = new Scanner(System.in);  //Creating an object named "sc" of the Scanner class.
```

- Taking an integer input from the keyboard :

```
Scanner S = new Scanner(System.in);  //(Read from the keyboard)
int a = S.nextInt();  //(Method to read from the keyboard)
```

### Code as Described in the Video:

```
package com.company;
import java.util.Scanner;

public class CWH_05_TakingInpu {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();

//        int sum = a +b;
//        float sum = a +b;
//        System.out.println("The sum of these numbers is");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);

    }
}
```

### Handwritten Notes: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-5/JavaChapter1.pdf)

### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-5/UltimateJavaCheatSheet.pdf)
