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
