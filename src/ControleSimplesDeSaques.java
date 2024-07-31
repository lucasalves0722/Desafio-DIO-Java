package src;
import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        
        double limiteDiario = scanner.nextDouble();

        // Inicialização do loop for para iterar sobre os saques
        for (int i = 0; i <= limiteDiario; i++) {
            
            double valorSaque = scanner.nextDouble();

            // Verificar se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            // Verificar se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
            
            // Se o valor do saque não ultrapassar o limite diário, subtrair o valor do saque do limite diário
            limiteDiario -= valorSaque;

            // Informar que o saque foi realizado e mostrar o limite restante
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }

        // Fechar o Scanner para evitar vazamento de recursos:
        scanner.close(); 
    }
}