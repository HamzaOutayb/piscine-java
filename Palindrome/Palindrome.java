public class Palindrome {
    public static boolean isPalindrome(String s) {
        for (int i = s.length() - 1, j = 0; i >= 0 && j < s.length(); i--, j++) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}