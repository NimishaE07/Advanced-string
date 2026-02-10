public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "banana";
        boolean[] visited = new boolean[256];
        String result = "";

        for (char c : input.toCharArray()) {
            if (!visited[c]) {
                visited[c] = true;
                result += c;
            }
        }

        System.out.println(result);
    }
}
