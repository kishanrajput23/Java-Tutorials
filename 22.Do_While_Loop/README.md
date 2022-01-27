# Java Tutorial: The do-while loop in Java

### Do-while loop:
- Do- while loop is similar to a while loop except for the fact that it is guaranteed to execute at least once.
- Use a do-while loop when the exact number of iterations is unknown, but you need to execute a code block at least once.
- After executing a part of a program for once, the rest of the code gets executed on the basis of a given boolean condition.
- Syntax :
```
/* do {

            //code

} while (condition);            //Note this semicolon */
```
- Example
```
int i=1;  
do{  
System.out.println(i);  
i++;  
}while(i<=10); 
```

### Difference Between while loop and do-while loop :
- while – checks the condition & executes the code.
- do-while – executes the code at least once and then checks the condition. Because of this reason, the code in the do-while loop executes at least once, even if the condition fails.

### Flow control of do-while loop :

![image](https://user-images.githubusercontent.com/70385488/151350896-9263940f-4225-4c6b-a7b6-180d2b286919.png)

**Quick Quiz:** Write a program to print first n natural numbers using a do-while loop.

### Code as described in the video :

```
public class cwh_22_ch4_do_while {
    public static void main(String[] args) {
//        int a = 0;
//        while(a<5){
//            System.out.println(a);
//            a++;
//        }
        int b = 10;
        do {
            System.out.println(b);
            b++;
        }while(b<5);

        int c = 1;
        do{
            System.out.println(c);
            c++;
        }while(c<=45);

    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-22/Chapter_5.pdf)

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-22/UltimateJavaCheatSheet.pdf)
