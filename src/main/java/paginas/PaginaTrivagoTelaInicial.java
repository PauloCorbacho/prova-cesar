package paginas;

import elementos.ElementosTrivagorTelaInicial;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;

public class PaginaTrivagoTelaInicial extends ElementosTrivagorTelaInicial {

    public PaginaTrivagoTelaInicial() {
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }

    public static final int DEFAULT_WAIT_4_ELEMENT = 10;

    public void pesquisarValor(String destino) throws InterruptedException {
        campoPesquisar.sendKeys(destino);
        isElementDisplayedList(driver, listaDeDestinos, 0, DEFAULT_WAIT_4_ELEMENT);
        listaDeDestinos.get(0).click();
    }

    public void clicarNoBotaoPesquisar() {
        try {
            botaoFecharData.click();
        } catch (Exception e) {
            System.out.println("Botão não encontrado!");
        }
        botaoPesquisar.click();
    }

    public void selecionarQuantidadeDeQuartos(int quantidadeDeAdultos) {
        quantidadeDeQuartosButton.click();
        diminuirQuantidadeDeAdultos.get(quantidadeDeAdultos).click();
        confirmarQuantidadeQuartos.click();
    }

    public void pegarInformacoesNomeDoHotel(int indice) throws InterruptedException {
        Thread.sleep(3000);
        for (int i = 0; i < nomeHoteis.size(); i++) {
            System.out.println(nomeHoteis.get(indice).getText());
            break;
        }
    }

    public void pegarInformacoesDasAvaliacoes(int indice) throws InterruptedException {
        System.out.println(avaliacoesHotel.get(indice).getText() + "\n");
    }

    public void pegarInformacoesDoSiteDeOfertas(int indice) {
        for (int i = 0; i < siteParceiro.size(); i++) {
            String siteDeOfertas = siteParceiro.get(indice).getText();
            System.out.println(siteDeOfertas);
            break;
        }
    }

    public void pegarInformacoesDoValorDoQuarto(int indice) {
        for (int i = 0; i < valorDoQuarto.size(); i++) {
            String valorQuarto = valorDoQuarto.get(indice).getText();
            System.out.println(valorQuarto);
            break;
        }
    }

    public void clicarNaLocalizacao(int indice) {
        for (int i = 0; i < localizacaoHotel.size(); i++) {
            localizacaoHotel.get(indice).click();
            break;
        }
    }

    public void clicarEmVisualizarTodasComididades(int indice) {
        for (int i = 0; i < comididadesHotel.size(); i++) {
            comididadesHotel.get(indice).click();
            break;
        }
    }

    public void imprimirTodasComodidades() {
        for (int i = 0; i < todasComodidadesHotel.size(); i++) {
            System.out.println(todasComodidadesHotel.get(i).getText());
            break;
        }
    }
}
