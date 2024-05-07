public class App {
    public static void main(String[] args) throws Exception {
        Iphone meuIPhone = new Iphone();
        meuIPhone.playMusica("Parabéns Para Você");
        meuIPhone.aumentarVolume();
        meuIPhone.diminuirVolume();
        meuIPhone.diminuirVolume();
        meuIPhone.diminuirVolume();
        meuIPhone.aumentarVolume();
        meuIPhone.playVideo("Comendo Abacaxi");

        meuIPhone.adicionarContato("Maria", 123);
        meuIPhone.adicionarContato("Pedro", 667);
        meuIPhone.adicionarContato("João", 345);
        meuIPhone.exibirContatos();
        meuIPhone.removerContato("Pedro");
        meuIPhone.exibirContatos();
        meuIPhone.enviarMensagemTexto("Jurema", "Vamos ao Cinema?");
        meuIPhone.enviarMensagemVoz("Cláudio", "Vamos viajar hoje?");
        meuIPhone.ligar("Cláudio");

        meuIPhone.pesquisar("Motores");
        meuIPhone.procurarNoMaps("Cafeteria");
        meuIPhone.verficarClima();
    }
}
