import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        // Verificar se o caractere é uma vogal ou consoante
        if (ehVogal(caractere)) {
            System.out.println(caractere + " é uma vogal.");
        } else {
            System.out.println(caractere + " é uma consoante.");
        }

        scanner.close();
    }

    // Método para verificar se um caractere é uma vogal
    public static boolean ehVogal(char c) {
        c = Character.toLowerCase(c); // Converter para minúscula para facilitar a comparação
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
