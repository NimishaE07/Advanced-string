public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "Was it a car or a cat I saw";

        input = input.replace(" ", "").toLowerCase();

        int i = 0, j = input.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}
