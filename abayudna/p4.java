import java.util.*;


public class bee1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine().toLowerCase();
            int[] frequency = new int[26];

            for (char c : input.toCharArray()) {
                if (Character.isLetter(c)) {
                    frequency[c - 'a']++;
                }
            }

            int maxFrequency = 0;
            for (int count : frequency) {
                if (count > maxFrequency) {
                    maxFrequency = count;
                }
            }

            StringBuilder result = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                if (frequency[j] == maxFrequency) {
                    result.append((char) (j + 'a'));
                }
            }

            System.out.println(result.toString());
        }

        scanner.close();
    }
}