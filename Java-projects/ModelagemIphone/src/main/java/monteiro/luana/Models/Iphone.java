package monteiro.luana.Models;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    private String musica = "";
    private boolean emChamada ;
    private int [] navegador = new int[55];

    private int count = 1;

    @Override
    public void atender() {
        if(!emChamada){
            emChamada = true;
            System.out.println("O iphone atendeu uma chamada");
        }else{
            System.out.println("O iphone não pode atender essa chamada");
        }
    }

    @Override
    public void ligar() {
        if(!emChamada){
            emChamada = true;
            System.out.println("O iphone fez uma ligação");
        }else{
            System.out.println("O iphone não pode fazer essa ligação");
        }

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("O iphone recebeu um correio de voz");
    }

    public void desligar(){
        emChamada = false;
        System.out.println("O iphone desligou a chamada");
    }

    @Override
    public void exibirPagina() {
        if(count != 1){
            System.out.println("O iphone exibiu a pagina " + navegador[count-1] + " da internet");
        }else{
            System.out.println("Não a paginas a serem exibidas");
        }
    }

    @Override
    public void adicionarNovaAba() {
        navegador[count] = count++;
        System.out.println("Uma Nova aba foi adicionada ao navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("As paginas foram atualizadas");
    }

    @Override
    public void selecionarMusica(String M) {
        musica = M;
        System.out.println("A musica " + musica +  " foi selecionada");
    }

    @Override
    public void tocar() {
        if(musica.isEmpty()){
            System.out.println("Não ha musica selecionada para tocar");
        }else{
            System.out.println("A musica " + musica +  " esta tocando");
        }
    }

    @Override
    public void pausar() {
        if(musica.isEmpty()){
            System.out.println("Não ha musica selecionada para pausar");
        }else{
            System.out.println("A musica " + musica +  " foi pausada");
        }
    }
}
