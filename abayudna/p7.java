import java.io.IOException;
import java.util.Scanner;

public class bee1332 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            String cur = scanner.nextLine();

            if (cur.length() == 3) {
                int oneMatches = 0;
                if (cur.charAt(0) == 'o') oneMatches++;
                if (cur.charAt(1) == 'n') oneMatches++;
                if (cur.charAt(2) == 'e') oneMatches++;

                int twoMatches = 0;
                if (cur.charAt(0) == 't') twoMatches++;
                if (cur.charAt(1) == 'w') twoMatches++;
                if (cur.charAt(2) == 'o') twoMatches++;

                if (oneMatches >= 2) {
                    System.out.println(1);
                } else if (twoMatches >= 2) {
                    System.out.println(2);
                }
            } else if (cur.length() == 5) {
                System.out.println(3);
            }
        }
        scanner.close();
    }
}
