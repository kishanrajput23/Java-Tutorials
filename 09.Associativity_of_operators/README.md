# Java Tutorial: Associativity of Operators in Java
## Associativity
- Associativity tells the direction of the execution of operators. It can either be left to right or vice versa.
- / * -> L to R
- + - -> L to R
- ++, = -> R to L
- Here is the precedence and associativity table which makes it easy for you to understand these topics better:

<img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-9/Type_Conversion_Precedence_and_Associativity__8oLmD9g.gif" alt="">

**Quick Quiz:** How will you write the following expression in Java?

<img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-9/base64.png" alt="">

## Code as Described in the Video
```
package com.company;

public class cwh_09_ch2_op_pre {
    public static void main(String[] args) {
        // Precedence & Associativity

        //int a = 6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis
        of left to right associativity
            =30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
            = 12-34*2
            =12-68
            =-56
         */

        //System.out.println(a);
        //System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        //  int k = x * y/2;

        int b = 0;
        int c = 0;
        int a = 10;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);

    }
}
```

## Handwritten Notes: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-9/Chapter2.pdf)

## Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-9/UltimateJavaCheatSheet.pdf)
