import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("O número " + numero + " é divisível por 3 e por 5 ao mesmo tempo.");
        } else {
            System.out.println("O número " + numero + " não é divisível por 3 e por 5 ao mesmo tempo.");
        }

        scanner.close();
    }
}
