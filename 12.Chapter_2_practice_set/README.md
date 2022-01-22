# Java Tutorial: Chapter 2 - Practice Set (Java Practice Questions)

1. What will be the result of the following expression:

        float a = 7/4 * 9/2

2. Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
3. Use comparison operators to find out whether a given number is greater than the user entered number or not.
4. Write the following expression in a java program:
    
        (v^2-u^2)/2as

5. Find the value of 'a' in expression given below :

        int x = 7
        int a = 7*49/7 + 35/7
        
# Code Solution

```
public class cwh_12_ps2_pr01 {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
    }
}
```


```
public class cwh_12_ps2_pr02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
```

```
import java.util.Scanner;

public class cwh_12_ps2_pr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);
    }
}

```

```
import java.util.Scanner;

public class cwh_12_ps2_pr_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter v : ");
        int v = sc.nextInt();
        
        System.out.print("Enter u : ");
        int u = sc.nextInt();
        
        System.out.print("Enter s : ");
        int s = sc.nextInt();
        
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        
        double result = (v*v - u*u) / (2*a*s);
        System.out.print("Result is : " + result);
    }
}
```

```
import java.util.Scanner;

public class cwh_12_ps2_pr_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(7*49/7+35/7);
    }
}
```
