import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = scanner.nextInt();
        
        String nomeMes = obterNomeMes(numeroMes);
        
        System.out.println("O mês correspondente é: " + nomeMes);
        
        scanner.close();
    }
    
    public static String obterNomeMes(int numeroMes) {
        switch(numeroMes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inválido";
        }
    }
}
