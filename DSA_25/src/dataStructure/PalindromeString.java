package dataStructure;

class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        char[] c = s.toCharArray();
        int f = 0;
        for (int i = 0, j = c.length - 1; i < j; i++, j--) {
            if (c[i] != c[j]) {
                f = 1;
                break;
            }
        }
        if (f == 0)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

