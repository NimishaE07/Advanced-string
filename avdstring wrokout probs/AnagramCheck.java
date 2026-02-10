public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "Dormitory".replace(" ", "").toLowerCase();
        String s2 = "Dirty room".replace(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] count = new int[256];

        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) count[c]--;

        for (int i : count) {
            if (i != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
