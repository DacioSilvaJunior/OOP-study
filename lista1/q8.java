import java.util.Scanner;

public class OrdenacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();
        
        // Ordenação dos números
        double temp;
        if(numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        if(numero2 > numero3) {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;
        }
        if(numero1 > numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }
        
        // Imprimindo em ordem crescente
        System.out.println("Os números em ordem crescente são: " + numero1 + ", " + numero2 + ", " + numero3);
        
        scanner.close();
    }
}
