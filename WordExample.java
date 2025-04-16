public class WordExample {
    private String strdata;

    // Parameterized Constructor
    public WordExample(String str) {
        str = str.trim();
        if (str.endsWith(".") || str.endsWith("?") || str.endsWith("!")) {
            this.strdata = str;
        } else {
            this.strdata = str + "."; // Add default termination if not provided
        }
    }

    // Method to count words that begin and end with a vowel
    public void countWord() {
        String sentence = strdata.substring(0, strdata.length() - 1); // Remove punctuation
        String[] words = sentence.trim().split("\\s+"); // Split on one or more spaces
        int count = 0;

        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }

        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

    // Method to place vowel-start-end words first
    public void placeWord() {
        String sentence = strdata.substring(0, strdata.length() - 1); // Remove punctuation
        String[] words = sentence.trim().split("\\s+");
        StringBuilder vowelWords = new StringBuilder();
        StringBuilder otherWords = new StringBuilder();

        for (String word : words) {
            if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vowelWords.append(word).append(" ");
            } else {
                otherWords.append(word).append(" ");
            }
        }

        String result = (vowelWords.toString() + otherWords.toString()).trim();
        System.out.println("Rearranged sentence: " + result);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        return "AEIOU".indexOf(c) != -1;
    }

    // Main method for demonstration
    public static void main(String[] args) {
        WordExample we = new WordExample("APPLE EAGLE ICE OVEN UMBRELLA CAT DOG.");
        we.countWord();
        we.placeWord();
    }
}
