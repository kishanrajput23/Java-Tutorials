# Java Tutorial: String Methods in Java

- String Methods operate on Java Strings. They can be used to find the length of the string, convert to lowercase, etc.
- Some of the commonly used String methods are:

```
String name = “Kishan”;
```
- (Indexes of the above string are as follows: 0-K, 1-i, 2-s, 3-h, 4-a, 5-n)

|  **Methods**  |  **Description**  |
|:--------------|:------------------|
|  **1. length()**  |  	Returns the length of String name. (6 in this case)  |
|  **2. toLowerCase()**  |  Converts all the characters of the string to the lower case letters.  |
|  **3. toUpperCase()**  |  Converts all the characters of the string to the upper case letters.  |
|  **4. trim()**  |  Returns a new String after removing all the leading and trailing spaces from the original string.  |
|  **5. substring(int start)**  |  Returns a substring from start to the end. Substring(3) returns “han”. [Note that indexing starts from 0]  |
|  **6. substring(int start, int end)**  |  Returns a substring from the start index to the end index. The start index is included, and the end is excluded.  |
|  **7. replace(‘K’, ‘p’)**  |  Returns a new string after replacing K with p. pishan is returned in this case. (This method takes char as argument)  |
|  **8. startsWith(“Ki”)**  |  Returns true if the name starts with the string “Ki”. (True in this case)  |
|  **9. endsWith(“an”)**  |  Returns true if the name ends with the string “an”. (True in this case)  |
|  **10. charAt(2)**  |  Returns the character at a given index position. (s in this case)  |
|  **11. indexOf(“s”)**  |  Returns the index of the first occurrence of the specified character in the given string.  |
|  **12. lastIndexOf(“h”)**  |  Returns the last index of the specified character from the given string. (3 in this case)  |
|  **13. equals(“Kishan”)**  |  Returns true if the given string is equal to “Kishan” false otherwise [Case sensitive]  |
|  **14.equalsIgnoreCase(“kishan”)**  |  Returns true if two strings are equal, ignoring the case of characters.  |

### Escape Sequence Characters : 
- The sequence of characters after backslash ‘\’ = Escape Sequence Characters
- Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
- Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash), etc.

### Code as described in the video
```
public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "Kishan";
        System.out.println(name);
        
        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Kishan     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(1));
        System.out.println(name.substring(1,5));

        System.out.println(name.replace('K', 'p'));
        System.out.println(name.replace("n", "ier"));

        System.out.println(name.startsWith("Kis"));
        System.out.println(name.endsWith("dd"));

        System.out.println(name.charAt(4));

        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.indexOf("rry", 4));
        System.out.println(modifiedName.lastIndexOf("rry", 7));

        System.out.println(name.equals("Kishan"));
        System.out.println(name.equalsIgnoreCase("KiShAn"));

        System.out.println("I am escape sequence\tdouble quote");
    }
}
```

### Handwritten Notes: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-14/Ch3Strings.pdf)

### Ultimate Java Cheatsheet: [Click To Download](https://api.codewithharry.com/media/videoSeriesFiles/courseFiles/java-tutorials-for-beginners-14/UltimateJavaCheatSheet.pdf)
