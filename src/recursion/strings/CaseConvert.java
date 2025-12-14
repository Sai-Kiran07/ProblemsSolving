package recursion.strings;

public class CaseConvert {

	    public static void main(String[] args) {
	        String s = "IIT Bbsr";
	        System.out.println(convertCase(s, 0));
	    }
	    static String convertCase(String s, int index) {
	        if (index == s.length()) {
	            return "";
	        }
	
	        char ch = s.charAt(index);
	
	        if (ch >= 'a' && ch <= 'z') {
	            ch = (char)(ch - 32);   
	        } 
	        else if (ch >= 'A' && ch <= 'Z') {
	            ch = (char)(ch + 32);   
	        }
	        return ch + convertCase(s, index + 1);
	}
}

