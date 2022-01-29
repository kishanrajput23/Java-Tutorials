# Java Tutorial: Multidimensional Arrays in Java
- Multidimensional Arrays are an Array of Arrays. Each elements of an M-D array is an array itself. Marks in the previous example was a 1-D array.

### Multidimensional 2-D Array
- A 2-D array can be created as follows:

      int [][] flats = new int[2][3]          //A 2-D array of 2 rows + 3 columns
      
- We can add elements to this array as follows

      flats[0][0] = 100
      flats[0][1] = 101
      flats[0][2] = 102
      // … & so on!
      
- This 2-D array can be visualized as follows:

<img src="https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-28/base64.png" alt="">

- Similarly, a 3-D array can be created as follows:

      String[][][] arr = new String [2][3][4]
      
### Code as Described in the Video

```
package com.company;

public class cwh_28_multi_dim_arrays {
    public static void main(String[] args) {
        int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
```

**Handwritten Notes: [Click to Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-28/Chapter_6_Arrays.pdf)**

**Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-28/UltimateJavaCheatSheet.pdf)**
