# Java Practice Questions on Strings: Practice Set on Java Strings (Must Solve!)

- Today we will solve some of the best problems in Java related to strings! Here is the Chapter 3 – Practice Set

1. Write a Java program to convert a string to lowercase.
2. Write a Java program to replace spaces with underscores.
3. Write a Java program to fill in a letter template which looks like below:

```
// letter = “Dear <|name|>, Thanks a lot”

// Replace <|name|> with a string (some name)
```

4. Write a Java program to detect double and triple spaces in a string.
5. Write a program to format the following letter using escape sequence characters.
       
       Letter = “Dear Harry, This Java Course is nice. Thanks”

## Code Solution:

```
public class cwh_15_ps3_pr01 {
    public static void main(String[] args) {
        String name = "Peter Parker";
        System.out.println(name);
        
        name = name.toLowerCase();
        System.out.println(name);
    }
}
```

```
public class cwh_15_ps3_pr02 {
    public static void main(String[] args) {
        String name = "My name is            Kishan       ";
        System.out.println(name);
        
        name = name.replace(" ", "_");
        System.out.println(name);
    }
}
```

```
import java.util.*;

public class cwh_15_ps3_pr03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String letter = "Dear <|name|>, Thanks a lot";
        
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);
    }
}
```

```
public class cwh_15_ps3_pr04 {
    public static void main(String[] args) {
        String name = "My name  is   Kishan";
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));
    }
}
```

```
import java.util.*;

public class cwh_15_ps3_pr05 {
    public static void main(String[] args) {
        String Letter = ("Dear Harry,\n\t This Java Course is nice.\n\t Thanks");
        System.out.println(Letter);
    }
}
```

### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-15/UltimateJavaCheatSheet.pdf)
