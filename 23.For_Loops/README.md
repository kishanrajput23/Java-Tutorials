# Java Tutorial: The for Loop in Java

### For loop:
- For loop in java is used to iterate a block of code multiple times.
- Use for loop only when the exact number of iterations needed is already known to you. 
- Syntax :
```
/* for (initialize; check_bool_expression; update){
            //code;
} */
```
- Initializer: Initializes the value of a variable. This part is executed only once.
- check_bool_expression: The code inside the for loop is executed only when this condition returns true.
- update: Updates the value of the initial variable.
- Example :
```
for (i=7; i!=0; i--){
    System.out.println(i);
}
```
- The above for loop initializes the value of i=7 and keeps printing as well as decrementing the value of i till i do not get equals to 0.

### Flow control of for loop : 

![image](https://user-images.githubusercontent.com/70385488/151354811-2f095c94-83f7-4579-9f65-0898531cdbc5.png)

**Quick Quiz 1:** Write a program to print first n odd numbers using a for loop.

**Quick Quiz 2:** Write a program to print first n natural numbers in reverse order.

### Code as described in the video :

```
public class cwh_23_for_loop {
    public static void main(String[] args) {
//        for (int i=1; i<=10; i++){
//            System.out.println(i);
//        }
        // 2i = Even Numbers = 0, 2, 4, 6, 8
        // 2i+1 = Odd Numbers = 1, 3, 5, 7, 9
        //int n = 3;
        //for (int i =0; i<n; i++){
        //    System.out.println(2*i+1);
        //}

        for(int i=5; i!=0; i--){
            System.out.println(i);
        }
    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-23/Chapter_5.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-23/UltimateJavaCheatSheet.pdf)**
