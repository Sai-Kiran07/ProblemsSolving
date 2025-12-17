package recursion.strings;
public class MoveLowercaseToEnd {

    public static void main(String[] args) {
        String s = "aB#cD@eF";
        System.out.println(moveLowercase(s, 0));
    }

    static String moveLowercase(String s, int index) {

        if (index == s.length()) {
            return "";
        }

        char ch = s.charAt(index);

        String rest = moveLowercase(s, index + 1);

        if (ch >= 'a' && ch <= 'z') {
            return rest + ch;
        }

        return ch + rest;
    }
}
