# Java Conditionals: If-else Statement in Java
- Sometimes we want to drink coffee when we feel sleepy. Sometimes, we order junk food if it is our friend’s birthday. 
- You might want to buy an umbrella if it’s raining. All these decisions depend on a certain condition being met. 
- Similar to real life, we can execute some instructions only when a condition is met in programming also. 
- If-else block is used to check conditions and execute a particular section of code for a specific condition.

### Flow control of if-else in Java :

<img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-16/IfElse_flowchart.png" alt="">

### Decision-making instructions in Java
- If-Else Statement
- Switch Statement

### If-Else Statement
- Syntax of If-else statement in Java :

```
/* if (condition-to-be-checked) {
	statements-if-condition-true;
}
else {
	statements-if-condition-false;
} */
```
- Example:
```
int a = 29;
if (a>18) {
	System.out.println(“You can drive”);
}
else{
       System.out.println(“You are underage!");
}
```

- Output : You can drive

### If-else ladder : 
- Instead of using multiple if statements, we can also use else if along with if thus forming an if-else-if-else ladder.
- Using such kind of logic reduces indents.
- Last else is executed only if all the conditions fail.

```
/* if (condition1) {
            //Statements;
}

else if {
            // Statements;
}

else {
            //Statements
} */
```

- Note that the else block is optional.

#### Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-16/ch4conditional.pdf)

#### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-16/UltimateJavaCheatSheet.pdf)
