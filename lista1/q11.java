import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        
        double aumento;
        if (salario > 1500) {
            aumento = salario * 0.10; // 10% de aumento
        } else {
            aumento = salario * 0.15; // 15% de aumento
        }
        
        double salarioFinal = salario + aumento;
        
        System.out.println("O valor do aumento é: R$ " + aumento);
        System.out.println("O novo salário é: R$ " + salarioFinal);
        
        scanner.close();
    }
}
