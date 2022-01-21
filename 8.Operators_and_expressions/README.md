# Java Tutorial: Operators, Types of Operators & Expressions in Java
- An operator is a symbol that the compiler to perform a specific operation on operands.
- Example :  a + b = c
- In the above example, 'a' and 'b' are operands on which the '+' operator is applied.

## Types of operators :
### 1. Arithmetic Operators :
- Arithmetic operators are used to perform mathematical operations such as addition, division, etc on expressions.
- Arithmetic operators cannot work with Booleans.
- % operator can work on floats and doubles.
- Let x=7 and y=2

![image](https://user-images.githubusercontent.com/70385488/150535449-0074c214-cb1d-4a29-8306-e9632986a628.png)

### 2. Comparison Operators :
- As the name suggests, these operators are used to compare two operands.
- Let x=7 and y=2

![image](https://user-images.githubusercontent.com/70385488/150535594-fec270da-1c59-40f3-a0bf-537bf3f9ec5f.png)

### 3. Logical Operators :
- These operators determine the logic in an expression containing two or more values or variables.
- Let x = 8 and y =2

![image](https://user-images.githubusercontent.com/70385488/150535778-ba37d847-d57a-4840-a84d-7855ad808fc7.png)

### 4. Bitwise Operators :
- These operators perform the operations on every bit of a number.
- Let x =2 and y=3. So 2 in binary is 100, and 3 is 011. 

![image](https://user-images.githubusercontent.com/70385488/150536221-5e7263d7-e2f1-4865-8164-f428bd54c8d4.png)

## Precedence of operators
- The operators are applied and evaluated based on precedence. For example, (+, -) has less precedence compared to (*, /). Hence '*' and / are evaluated first.
- In case we like to change this order, we use parenthesis ()

## Code as Described in the Video
```
package com.company;

public class CWH_Ch2_Operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 4;
        // int b = 6 % a; // Modulo Operator
        // 4.8%1.1 --> Returns Decimal Remainder

        // 2. Assignment Operators
        int b = 9;
        b *= 3;
        System.out.println(b);

        // 3. Comparison Operators
        // System.out.println(64<6);

        // 4. Logical Operators
        // System.out.println(64>5 && 64>98);
        System.out.println(64>5 || 64>98);

        // 5. Bitwise Operators
        System.out.println(2&3);
        //        10
        //        11
        //        ----
        //        10
    }
}
```

### Handwritten Notes: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-8/Chapter2.pdf)

### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-8/UltimateJavaCheatSheet.pdf)
