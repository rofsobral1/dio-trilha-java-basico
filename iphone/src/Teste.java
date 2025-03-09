public class Teste {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testando o Reprodutor Musical
        iphone.selecionarMusica("Música 1");
        iphone.tocar();
        iphone.pausar();

        // Testando o Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando o Navegador Internet
        iphone.exibirPagina("www.exemplo.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
