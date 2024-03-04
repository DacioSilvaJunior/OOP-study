import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("O primeiro número (" + numero1 + ") é maior que o segundo número (" + numero2 + ").");
        } else if (numero2 > numero1) {
            System.out.println("O segundo número (" + numero2 + ") é maior que o primeiro número (" + numero1 + ").");
        } else {
            System.out.println("Os dois números são iguais.");
        }

        scanner.close();
    }
}
