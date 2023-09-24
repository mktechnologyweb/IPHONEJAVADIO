public class TesteiPhone {
    public static void main(String[] args) {
        // Crie uma instância do iPhone2017
        IPhone2007 meuIPhone = new IPhone2007("iPhone 1", "123456");

        // Teste as funcionalidades do iPhone
        meuIPhone.play();
        meuIPhone.fazerLigacao("+1234567890");
        meuIPhone.abrirPaginaWeb("https://www.example.com");
    }
}
