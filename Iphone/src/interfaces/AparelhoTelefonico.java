package interfaces;

public interface AparelhoTelefonico {
    void ligar(String nome);
    void enviarMensagemTexto(String nome, String mensagem);
    void enviarMensagemVoz(String nome, String mensagem);
    void adicionarContato(String nome, int numero);
    void removerContato(String nome);
    void exibirContatos();
}