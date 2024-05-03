

public class Poo implements IPod, Phone, InternetBrowser {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    // Método principal para demonstrar o uso
    public static void main(String[] args) {
        Poo meuIPhone = new Poo();
        meuIPhone.ligar();
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba("https://www.google.com");
        meuIPhone.atualizarPagina();
        meuIPhone.pausar();
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
    }
}
