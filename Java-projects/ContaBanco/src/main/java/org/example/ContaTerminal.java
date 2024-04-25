package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //importando a classe scanner
        Scanner leitor = new Scanner(System.in);

        //obtendo valores digitados pelo usuário no terminal
        System.out.println("Digite o nome do cliente: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o número da conta: ");
        int nroConta = leitor.nextInt();

        System.out.println("Digite o número da agencia: ");
        String nroAgencia = leitor.next();

        System.out.println("Digite o Saldo disponivel: ");
        double saldo = leitor.nextDouble();

        //imprimir mensagem p/ cliente
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é " + nroAgencia +", conta " + nroConta + " e seu saldo " + saldo +
                " já está disponível para saque");
    }
}
