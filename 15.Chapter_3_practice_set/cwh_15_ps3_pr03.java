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