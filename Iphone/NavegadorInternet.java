// Arquivo NavegadorInternet.java

public interface NavegadorInternet {
    void abrirPaginaWeb(String url);
    void fecharPaginaWeb();
    void buscarNaInternet(String termo);
    void navegarHistorico();
    void favoritarPagina(String url);
}
