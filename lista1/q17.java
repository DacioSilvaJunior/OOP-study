import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu estado civil (solteiro/casado/divorciado/viúvo):");
        String estadoCivil = scanner.nextLine().toLowerCase(); // Converte para minúsculas para evitar problemas de comparação
        
        switch (estadoCivil) {
            case "solteiro":
                System.out.println("Você é solteiro.");
                break;
            case "casado":
                System.out.println("Você é casado.");
                break;
            case "divorciado":
                System.out.println("Você é divorciado.");
                break;
            case "viúvo":
                System.out.println("Você é viúvo.");
                break;
            default:
                System.out.println("Estado civil inválido.");
        }
        
        scanner.close();
    }
}
