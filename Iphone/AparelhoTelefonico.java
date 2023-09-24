// Arquivo AparelhoTelefonico.java

public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);
    void encerrarLigacao();
    void enviarMensagem(String texto, String numero);
    void receberMensagem(String texto, String numero);
}
