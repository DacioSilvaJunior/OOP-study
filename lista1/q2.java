import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite a idade da pessoa:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        scanner.close();
    }
}
