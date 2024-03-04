import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana (por extenso):");
        String diaSemana = scanner.nextLine().toLowerCase(); // Converte para minúsculas para facilitar a comparação

        // Verifica se é um dia útil ou um fim de semana
        if (diaSemana.equals("segunda-feira") || diaSemana.equals("terça-feira") ||
            diaSemana.equals("quarta-feira") || diaSemana.equals("quinta-feira") ||
            diaSemana.equals("sexta-feira")) {
            System.out.println("É um dia útil.");
        } else if (diaSemana.equals("sábado") || diaSemana.equals("domingo")) {
            System.out.println("É um fim de semana.");
        } else {
            System.out.println("Dia inválido.");
        }

        scanner.close();
    }
}
