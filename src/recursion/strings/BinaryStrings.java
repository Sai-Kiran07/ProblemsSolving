package recursion.strings;

public class BinaryStrings {

    public static void main(String[] args) {
        int n = 3;
        generate(n, 0, "", '0');
    }

    static void generate(int n, int index, String curr, char last) {

        // Base case
        if (index == n) {
            System.out.println(curr);
            return;
        }

        // Always allowed to place '0'
        generate(n, index + 1, curr + "0", '0');

        // Place '1' only if last is not '1'
        if (last != '1') {
            generate(n, index + 1, curr + "1", '1');
        }
    }
}

