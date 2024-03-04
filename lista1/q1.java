import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        // Verifica se o número é positivo, negativo ou zero e imprime a mensagem correspondente
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é igual a zero.");
        }

        // Fecha o scanner
        scanner.close();
    }
}