// Arquivo iPhone2007.java

public class IPhone2007 implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroSerie;

    public IPhone2007(String modelo, String numeroSerie) {
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public void play() {
        System.out.println("Reproduzindo música.");
    }

    public void pause() {
        System.out.println("Música em pausa.");
    }

    public void stop() {
        System.out.println("Música parada.");
    }

    public void nextTrack() {
        System.out.println("Próxima faixa de música.");
    }

    public void previousTrack() {
        System.out.println("Faixa anterior de música.");
    }

    public void fazerLigacao(String numero) {
        System.out.println("Ligou para " + numero);
    }

    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligação de " + numero);
    }

    public void encerrarLigacao() {
        System.out.println("Ligação encerrada.");
    }

    public void enviarMensagem(String texto, String numero) {
        System.out.println("Enviou mensagem para " + numero + ": " + texto);
    }

    public void receberMensagem(String texto, String numero) {
        System.out.println("Recebeu mensagem de " + numero + ": " + texto);
    }

    public void abrirPaginaWeb(String url) {
        System.out.println("Abrindo página web: " + url);
    }

    public void fecharPaginaWeb() {
        System.out.println("Fechando página web.");
    }

    public void buscarNaInternet(String termo) {
        System.out.println("Pesquisando na internet: " + termo);
    }

    public void navegarHistorico() {
        System.out.println("Navegando no histórico.");
    }

    public void favoritarPagina(String url) {
        System.out.println("Página favoritada: " + url);
    }

    public String getDetalhes() {
        return "Modelo: " + modelo + ", Número de Série: " + numeroSerie;
    }
}
