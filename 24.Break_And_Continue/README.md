# Java Tutorial: break and continue in Java

### Break statement :
- The break statement is used to exit the loop irrespective of whether the condition is true or false.
- Whenever a ‘break’ is encountered inside the loop, the control is sent outside the loop.
- Syntax : 

```
break;
```
- Example to demonstrate the use of break inside a for loop :
```
public class CWH_break {  
public static void main(String[] args) {  
    //using for loop  
    for(int i=10;i>0;i--){  
        if(i==7){  
            break;   //break the loop
        }  
        System.out.println(i);  
    }  
}  
}  
```
- Output
```
10
9
8
```

### Flow control of break statement : 

![image](https://user-images.githubusercontent.com/70385488/151574136-1ab97039-3cf9-44c6-b08b-e684a4e2fd6a.png)

### Continue statement : 
- The continue statement is used to immediately move to the next iteration of the loop.
- The control is taken to the next iteration thus skipping everything below ‘continue’ inside the loop for that iteration.
- Syntax :
```
continue;
```

Example to demonstrate the use of continue statement inside a for loop :
```
public class CWH_continue {  
public static void main(String[] args) {  
 
    for(int i=7;i>0;i--){  
        if(i==3){  
            continue;//continue skips the rest statement
        }  
        System.out.println(i);  
    }  
}  
}  
```
- Output
```
7
6
5
4
2
1
```

### Flow control of continue statement : 

![image](https://user-images.githubusercontent.com/70385488/151574682-9a133237-a80c-4f69-b65c-7169291ce573.png)

### In a Nut Shell.…
- break statement completely exits the loop
- continue statement skips the particular iteration of the loop.

### Code as Described in the Video

```
package com.company;

public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        // Break and continue using loops!
//        for (int i=0;i<50;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop ends here");


//            for(int i=0;i<50;i++){
//            if(i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//                System.out.println(i);
//                System.out.println("Java is great");
//        }
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-24/Chapter_5.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-24/UltimateJavaCheatSheet.pdf)**
