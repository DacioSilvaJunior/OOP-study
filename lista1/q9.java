import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o peso e a altura
        System.out.println("Digite o peso (em quilogramas):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC
        System.out.printf("Seu IMC é %.2f\n", imc);

        // Determina a categoria de peso
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Você está com peso normal.");
        } else if (imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else if (imc < 35) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Você está muito obeso.");
        }

        scanner.close();
    }
}
