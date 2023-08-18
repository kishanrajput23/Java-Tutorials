# Basic Structure of a Java Program: Understanding our First Java Hello World Program

## Basic Structure of a Java Program

```
package com.company; // Groups classes
public class Main{	// Entrypoint into the application
	public static void main(String[]args){
		System.out.println(“Hello World”);
	}
}
```

## Working of the "Hello World" program shown above :

### 1. package com.company :
- Packages are used to group the related classes.
- The "Package" keyword is used to create packages in Java.
- Here, com.company is the name of our package.

### 2. public class Main :
- In Java, every program must contain a class.
- The filename and name of the class should be the same.
- Here, we've created a class named "Main".
- It is the entry point to the application.

### 3. public static void main(String[]args){..} :
- This is the main() method of our Java program.
- Every Java program must contain the main() method.

### 4. System.out.println("Hello World"):
- The above code is used to display the output on the screen.
- Anything passed inside the inverted commas is printed on the screen as plain text.

### 5. Naming Conventions
- For classes, we use Pascal Convention. The first and Subsequent characters from a word are capital letters (uppercase).
- Example: Main, MyScanner, MyEmployee, CodeWithHarry
- For functions and variables, we use camelCaseConvention. Here the first character is lowercase, and the subsequent characters are uppercase like myScanner, myMarks, CodeWithHarry

### Handwritten Notes: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-2/IntroToJava.pdf)

### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-2/UltimateJavaCheatSheet.pdf)
