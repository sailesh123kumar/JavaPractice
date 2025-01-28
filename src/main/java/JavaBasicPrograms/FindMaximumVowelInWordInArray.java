package JavaBasicPrograms;

public class FindMaximumVowelInWordInArray {
    public static void main(String[] args) {
        String[] arr = {"Orange", "Red", "Blue", "White", "Yellow", "Magentagreen"};
        
        // Initialize variables to keep track of the word with the maximum vowels
        String maxVowelWord = "";
        int maxVowelCount = 0;

        for (String word : arr) {
            // Count vowels in the current word
            int vowelCount = countVowels(word);

            // Update the maximum if the current word has more vowels
            if (vowelCount > maxVowelCount) {
                maxVowelCount = vowelCount;
                maxVowelWord = word;
            }
        }

        // Display the word with the maximum vowels and the count
        System.out.println("Word with maximum vowels: " + maxVowelWord);
        System.out.println("Number of vowels: " + maxVowelCount);
    }

    // Method to count vowels in a word
    private static int countVowels(String word) {
        int count = 0;
        word = word.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        for (char ch : word.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
