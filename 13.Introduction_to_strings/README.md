# Java Tutorial: Introduction to Strings

- A string is a sequence of characters.
- Strings are objects that represent a char array. For example :

```
char[] str = {'H','A','R','R','Y'};
String s = new String(str);
```

is same as :

```
String s = "Harry";
```

- Strings are immutable and cannot be changed.
- java.lang.String class is used to create a String object.
- The string is a class but can be used as a data type.
- Syntax of strings in Java :

```
String <String_name> = "<sequence_of_string>";
```

Example :

```
 String str = "CodeWithHarry";
```

- In the above example, str is a reference, and “CodeWithHarry” is an object.

### Different ways to create a string in Java :
In Java, strings can be created in two ways :
- By using string literal
- By using the new 

### Creating String using String literal :
```
String s1= "String literal"
```

- We use double quotes("") to create string using string literal. Before creating a new string instance, JVM verifies if the same string is already present in the string pool or not. 
- If it is already present, then JVM returns a reference to the pooled instance otherwise, a new string instance is created.

- In the above diagram, notice that string "Harry" is already present in the string pool, which is pointed by the str1. 
- When we try to create the same string object using str2, JVM finds that string object with the value "Harry" is already present in the string pool; therefore, instead of creating a new object, a reference to the same object is returned.

### Creating String using new :
```
String s=new String("Harry");
```

- When we create a string using "new", a new object is always created in the heap memory.

![image](https://user-images.githubusercontent.com/70385488/150810348-c723a98d-104f-4d73-af81-0ef51aa0b357.png)

- In the above diagram, you can see that although the value of both string objects is the same, i.e., "Harry" still two different objects are created, and they are referred by two different reference variables, i.e., str1 and str2.
- See the examples given below to get a better understanding of String literal and String object :

```
String str1 = "CodeWithHarry";
String str2 = "CodeWithHarry"
System.out.println(str1 == str2); 
```

- Output = True

Returns true because str1 and str2 are referencing the same object present in the string constant pool. Now, let's see the case of the String object :

```
String str1 = new String("Keep coding"); 
String str2 = new String("Keep coding""); 
System.out.println(str1 == str2); 
```

- Output = False

Although the value of both the string object is the same, still false is displayed as output because str1 and str2 are two different string objects created in the heap. That's why it is not considered a good practice two compare two strings using the == operator. Always use the equals() method to compare two strings in Java.

### Different ways to print in Java :
We can use the following ways to print in Java:
- System.out.print() // No newline at the end
- System.out.println() // Prints a new line at the end
- System.out.printf()
- System.out.format()

```
System.out.printf("%c",ch)
```

- %d for int
- %f for float
- %c for char
- %s for string

### Code as written in the video

```
package com.company;
import java.util.Scanner;

public class cwh_13_strings {
    public static void main(String[] args) {
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.print(name);
        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        //System.out.format("The value of a is %d and value of b is %f", a, b);
        Scanner sc = new Scanner(System.in);
//        String st = sc.next();
//        String st = sc.nextLine();
//        System.out.println(st);

    }
}
```

### Handwritten Notes: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-13/Ch3Strings.pdf)

### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-13/UltimateJavaCheatSheet.pdf)
