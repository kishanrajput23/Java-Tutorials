# Java Tutorial: Relational and Logical Operators in Java

### Relational Operators in Java : 
- Relational operators are used to evaluate conditions (true or false) inside the if statements. Some examples of relational operators are:
- == (equals)
- '>=' (greater than or equals to)
- '>' (greater than)
- < (less than)
- <= (less than or equals to)
- != (not equals)

**Note:** ‘=’ is used for an assignment whereas ‘==’ is used for equality check. The condition can be either true or false.

### Logical Operators : 
- Logical operators are used to provide logic to our Java programs.
- There are three types of logical operators in Java :
- && - AND
- || - OR
- ! – NOT

**1. AND Operator :** 
- Evaluates to true if both the conditions are true.

- Y && Y = Y                
- Y && N = N
- N && Y = N
- N && N = N
- Convention: # Y – True and N - False

**2. OR Operator :**
- Evaluates to true when at least one of the conditions is true.

- Y || Y = Y                   
- Y || N = Y
- N || Y = Y
- N || N = N
- Convention: # Y – True and N - False

**3. NOT Operator :**
- Negates the given logic (true becomes false and vice-versa)

- !Y = N                         
- !N = Y

### Code as Described in the Video

```
public class cwh_17_logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
//        if (a && b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical OR...");

//        if (a || b){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.println("For Logical NOT");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
    }
}
```

#### Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-17/ch4conditional.pdf)

#### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-17/UltimateJavaCheatSheet.pdf)
