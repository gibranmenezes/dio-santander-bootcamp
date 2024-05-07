import java.util.ArrayList;
import java.util.List;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorWeb;
import interfaces.ReprodutorMidia;

public class Iphone  implements AparelhoTelefonico,NavegadorWeb,ReprodutorMidia{

    private int volume = 100;
    List<Contato> listaContatos;

    public Iphone() {
        listaContatos = new ArrayList<>();
    }

    @Override
    public void playMusica(String musica) {
        System.out.println("A música " + musica + " começou a tocar.");
    }

    @Override
    public void playVideo(String video) {
        System.out.println("O video " + video + " começou a passar.");
    }

    @Override
    public void aumentarVolume() {
        if(volume < 100){
            volume += 1;
            System.out.println("+ Volume : " + volume);
        }else{
            System.out.println("O volume já está no máximo");
        }

    }

    @Override
    public void diminuirVolume() {
        if(volume > 0){
            volume -= 1;
            System.out.println("- Volume : " + volume);
        }else{
            System.out.println("O volume já está no mínimo");
        }
    }

    @Override
    public void pesquisar(String pesquisa) {
        System.out.println("Procurando por " + pesquisa + "... ");
        System.out.println("Pesquisa realizada.");
    }

    @Override
    public void procurarNoMaps(String pesquisa) {
        System.out.println("Procurando no mapa por " + pesquisa + "...");
        System.out.println("Local encontrado.");
    }

    @Override
    public void verficarClima() {
        System.out.println("Verificando o clima atual.");
        System.out.println("A Temperatura atual é de 32°C sem previsão de chuva para o dia.");
    }

    @Override
    public void ligar(String nome) {
        System.out.println("Ligando para " + nome + ".");
    }

    @Override
    public void enviarMensagemTexto(String nome, String mensagem) {
        System.out.println("Enviando uma mensagem de texto para " + nome + " : " + mensagem);
    }

    @Override
    public void enviarMensagemVoz(String nome, String mensagem) {
        System.out.println("Enviando uma mensagem de voz para " + nome + " : " + mensagem);
    }

    @Override
    public void adicionarContato(String nome, int numero) {
        listaContatos.add(new Contato(nome, numero));
        System.out.println("O contato : " + nome + ", número : " + numero + " foi adicionado à sua lista de contatos.");
    }

    @Override
    public void removerContato(String nome) {
        if(!listaContatos.isEmpty()){
            for(Contato c : listaContatos){
                if(nome == c.getNome()){
                    listaContatos.remove(c);
                    System.out.println("O contato " + c.getNome() + " foi removido.");
                    return;
                }
            }
            System.out.println("Contato não encontrado.");
        }else{
            System.out.println("A lista de contatos já está vazia.");
        }
    }

    @Override
    public void exibirContatos() {
        System.out.println("Lista de Contatos : " + listaContatos);
    }

    @Override
    public String toString() {
        return "iPhone [listaContatos=" + listaContatos + "]";
    }
    
}