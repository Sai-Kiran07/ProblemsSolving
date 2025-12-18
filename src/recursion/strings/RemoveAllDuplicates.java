package recursion.strings;

public class RemoveAllDuplicates {

    public static void main(String[] args) {
        String s = "programming";
        System.out.println(removeDuplicates(s));
    }

    static String removeDuplicates(String s) {

  
        if (s.length() == 0) {
            return "";
        }

        char ch = s.charAt(0);

    
        String rest = removeDuplicates(s.substring(1));

   
        if (rest.indexOf(ch) != -1) {
            return rest;
        }

    
        return ch + rest;
    }
}
