import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A média do aluno é: " + media);
        
        if (media >= 7) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno está reprovado!");
        }
        
        scanner.close();
    }
}
