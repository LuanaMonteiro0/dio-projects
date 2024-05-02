package monteiro.luana;

import monteiro.luana.Models.Iphone;

public class Main {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        System.out.println("Testando as funções de telefone");
        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.desligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\nTestando as funções de navegador");
        meuIphone.exibirPagina();
        meuIphone.adicionarNovaAba();
        meuIphone.adicionarNovaAba();
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina();
        meuIphone.atualizarPagina();

        System.out.println("\nTestando as funções de reprodutor musical");
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Oh Klahoma - Jack Stauber");
        meuIphone.tocar();
        meuIphone.pausar();


    }
}