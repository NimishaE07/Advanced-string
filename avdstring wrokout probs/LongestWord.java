public class LongestWord {
    public static void main(String[] args) {
        String sentence = "Java is extremely powerful";
        String[] words = sentence.split(" ");

        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }

        System.out.println(longest);
        System.out.println("Length: " + longest.length());
    }
}
