package steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import paginas.PaginaTrivagoTelaInicial;

public class StepsRealizarImpressaoDeValoresDaPaginaTrivago {
    PaginaTrivagoTelaInicial paginaInicialTrivago = new PaginaTrivagoTelaInicial();

    @E("^o usuário preenche o valor \"([^\"]*)\" no campo de pesquisa$")
    public void oUsuárioPreencheOValorNoCampoDePesquisa(String destino) throws Throwable {
        paginaInicialTrivago.pesquisarValor(destino);
    }

    @E("^o usuário pressiona o botao de pesquisar$")
    public void oUsuárioPressionaOBotaoDePesquisar() {
        paginaInicialTrivago.clicarNoBotaoPesquisar();
    }

    @E("^o usuário diminui a quantidade de quartos \"([^\"]*)\"$")
    public void oUsuárioDiminuiAQuantidadeDeQuartos(int quantidadeDeQuartos) throws Throwable {
        paginaInicialTrivago.selecionarQuantidadeDeQuartos(quantidadeDeQuartos);
    }

    @E("^o usuário ordena a pesquisa por \"([^\"]*)\"$")
    public void oUsuárioOrdenaAPesquisaPor(String ordenarPor) throws Throwable {
        paginaInicialTrivago.ordenarPesquisarPor(ordenarPor);
    }

    @E("^o usuário imprime o nome do hotel \"([^\"]*)\"$")
    public void oUsuárioImprimeONomeDoHotel(int indice) throws Throwable {
        paginaInicialTrivago.pegarInformacoesNomeDoHotel(indice);
    }

    @E("^o usuário imprime a quantidade de estrelas da avaliação \"([^\"]*)\"$")
    public void oUsuárioImprimeAQuantidadeDeEstrelasDaAvaliação(int indice) throws Throwable {
        paginaInicialTrivago.pegarInformacoesDasAvaliacoes(indice);
    }

    @E("^o usuário imprime o site da oferta \"([^\"]*)\"$")
    public void oUsuárioImprimeOSiteDaOferta(int indice) throws Throwable {
        paginaInicialTrivago.pegarInformacoesDoSiteDeOfertas(indice);
    }

    @E("^o usuário imprime o valor do quarto \"([^\"]*)\"$")
    public void oUsuárioImprimeOValorDoQuarto(int indice) throws Throwable {
        paginaInicialTrivago.pegarInformacoesDoValorDoQuarto(indice);
    }

    @E("^o usuário pressiona na localização \"([^\"]*)\"$")
    public void oUsuárioPressionaNaLocalização(int indice) throws Throwable {
        paginaInicialTrivago.clicarNaLocalizacao(indice);
    }

    @Quando("^o usuário pressiona o botão visualizar todas as comodidades \"([^\"]*)\"$")
    public void oUsuárioPressionaOBotãoVisualizarTodasAsComodidades(int indice) throws Throwable {
        paginaInicialTrivago.clicarEmVisualizarTodasComididades(indice);
    }

    @Entao("^todas as informações sobre comodidades serão apresentadas$")
    public void todasAsInformaçõesSobreComodidadesSerãoApresentadas() {
        paginaInicialTrivago.imprimirTodasComodidades();
    }
}
