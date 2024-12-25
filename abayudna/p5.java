/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
import java.util.Scanner;

public class bee1257 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int L = scanner.nextInt();
            scanner.nextLine();
            int totalHash = 0;

            for (int i = 0; i < L; i++) {
                String current = scanner.nextLine();

                for (int l = 0; l < current.length(); l++) {
                    int alphabetPosition = current.charAt(l) - 'A';
                    int value = alphabetPosition + i + l;
                    totalHash += value;
                }
            }
            System.out.println(totalHash);
        }

        scanner.close();
    }
}