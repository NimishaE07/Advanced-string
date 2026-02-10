public class ReverseWords {
    public static void main(String[] args) {
        String input = "Java   is   very powerful";

        String[] words = input.trim().split("\\s+");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println(result.trim());
    }
}
