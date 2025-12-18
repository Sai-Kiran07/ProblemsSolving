package recursion.strings;
/*
 * Problem:

Move all lowercase letters to the end of the string (recursively)

Statement:

Given a string S consisting of uppercase letters, lowercase letters, and symbols, rearrange the string such that:

All uppercase letters appear first

All lowercase letters appear at the end

Relative order within each group must be preserved

Use recursion only (no loops, no extra data structures)

Input
S = "aB#cD@eF"

Output
B#D@Fa c e
→ "B#D@Face"


(Uppercase & symbols stay in front, lowercase move to end)

More Examples
Input:  IITmAdRaS
Output: IITARSmd
*/

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
