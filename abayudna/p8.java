import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class bee1551 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int testCaseCount = input.nextInt();
        input.nextLine();

        for (int i = 0; i < testCaseCount; i++) {
            String line = input.nextLine();
            HashSet<Character> uniqueChars = new HashSet<>();
            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    uniqueChars.add(c);
                }
            }

            int letterCount = uniqueChars.size();
            if (letterCount == 26) {
                System.out.println("frase completa");
            } else if (letterCount >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }

        input.close();
    }
}
