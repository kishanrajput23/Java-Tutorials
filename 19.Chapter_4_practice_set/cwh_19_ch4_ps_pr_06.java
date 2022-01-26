import java.util.*;

public class cwh_19_ch4_ps_pr_06 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("This is an organizational website");
        }
        else if (website.endsWith(".com")) {
            System.out.println("This is a Commercial website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");
        }
        else {
            System.out.println("Error 404");
        }
    }
}
