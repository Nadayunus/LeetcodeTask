public class Main {
    public static void main(String[] args) {
        String word1 = "abcdrf";
        String word2 = "pqr";
        System.out.println(merge(word1, word2));
    }
    public static String merge(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        int n1 = word1.length();
        int n2 = word2.length();

        while (i < n1 || j < n2) {
            if (i < n1) {
                result.append(word1.charAt(i++));
            }
            if (j < n2) {
                result.append(word2.charAt(j++));
            }

        }
        return result.toString();
    }
}