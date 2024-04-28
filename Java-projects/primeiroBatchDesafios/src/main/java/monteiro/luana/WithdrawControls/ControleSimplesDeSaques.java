package monteiro.luana.WithdrawControls;

import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        for(;;){
            double valorSaque = scanner.nextDouble();
            if(valorSaque == 0){
                break;
            }else{
                if(limiteDiario < valorSaque){
                    System.out.println("Limite diario de saque atingido.");
                    break;
                }else{
                    limiteDiario -= valorSaque;
                    System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                }
            }
        }
        scanner.close();
        System.out.println("Transacoes encerradas.");
    }}
