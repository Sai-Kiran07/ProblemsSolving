package recursion.strings;

/*Problem Statement:

Given a string S, remove all duplicate characters such that only the first occurrence of each character is kept.

Order of first occurrences must be preserved

Use recursion only

No loops

No built-in duplicate removal utilities

Input
S = "programming"

Output
progamin

More Examples
Input:  IITMadras
Output: ITMadrs

Input:  aabbcc
Output: abc
*/
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
