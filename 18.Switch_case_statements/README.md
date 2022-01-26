# Java Tutorial: Switch Case Statements in Java

### Switch Case-Control Instruction
- Switch-Case is used when we have to make a choice between the number of alternatives for a given variable.
- Var can be an integer, character, or string in Java.
- Every switch case must contain a default case. The default case is executed when all the other cases are false.
- Never forget to include the break statement after every switch case otherwise the switch case will not terminate.
- Syntax :

```
 Switch(var) {
	Case C1:
		//Code;	
		break;
	Case C2:
		//Code;
		break;	
	Case C3:
		//Code
		break;
	default:
		//Code
```

- A switch can occur within another but in practice, this is rarely done.

### Flow control of switch case in Java :

![image](https://user-images.githubusercontent.com/70385488/151165417-61ea32da-8494-4796-b8eb-cb26f4509d9e.png)

### Code as Described in the Video

```
package com.company;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        String var = "Saurabh";


        switch (var) {
            case "Shubham" -> {
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
                System.out.println("You are going to become an Adult!");
            }
            case "Saurabh" -> System.out.println("You are going to join a Job!");
            case "Vishaka" -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        System.out.println("Thanks for using my Java Code!");


        /*
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        */

    }
}
```

#### Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-18/ch4conditional.pdf)

#### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-18/UltimateJavaCheatSheet.pdf)
