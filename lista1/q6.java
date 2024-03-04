import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o nome da primeira pessoa
        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();
        
        // Solicita o nome da segunda pessoa
        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.nextLine();
        
        // Verifica qual nome tem mais caracteres
        int tamanhoNome1 = nome1.length();
        int tamanhoNome2 = nome2.length();
        
        if (tamanhoNome1 > tamanhoNome2) {
            System.out.println("A primeira pessoa, " + nome1 + ", possui mais caracteres em seu nome.");
        } else if (tamanhoNome2 > tamanhoNome1) {
            System.out.println("A segunda pessoa, " + nome2 + ", possui mais caracteres em seu nome.");
        } else {
            System.out.println("Ambos os nomes têm o mesmo número de caracteres.");
        }
        
        scanner.close();
    }
}
