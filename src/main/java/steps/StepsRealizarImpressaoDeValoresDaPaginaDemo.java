package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import paginas.PaginaDiscourseDemo;
import paginas.PaginaDiscourseTelaInicial;
import paginas.PaginaPadrao;

public class StepsRealizarImpressaoDeValoresDaPaginaDemo {
    PaginaPadrao paginas = new PaginaPadrao();
    PaginaDiscourseDemo paginaDemo = new PaginaDiscourseDemo();
    PaginaDiscourseTelaInicial paginaInicial = new PaginaDiscourseTelaInicial();

    @Dado("^que o usuário está acessando a seguinte página \"([^\"]*)\"$")
    public void queOUsuárioEstáAcessandoASeguintePágina(String pagina) throws Throwable {
        paginas.acessarPagina(pagina);
    }

    @E("^o botão demo é pressionado$")
    public void oBotãoDemoÉPressionado() {
        paginaInicial.clicarNoBotaoDemo();
    }

    @Quando("^o usuário pressiona o botão de scroll do mouse até o final da página$")
    public void oUsuárioPressionaOBotãoDeScrollDoMouseAtéOFinalDaPágina() throws InterruptedException {
        paginaDemo.realizarUmScrollNaTela();
    }

    @Então("^a impressão da descrição dos itens bloqueados será apresentada$")
    public void aImpressãoDaDescriçãoDosItensBloqueadosSeráApresentada() {
        paginaDemo.imprimirDescricaoDosItensBloqueados();
    }

    @E("^a impressão dos itens por categoria$")
    public void aImpressãoDosItensPorCategoria() {
        paginaDemo.imprimirItensPorCategoria();
    }

    @E("^o usuário imprime o tópico com maior número de views$")
    public void oUsuárioImprimeOTópicoComMaiorNúmeroDeViews() {
        paginaDemo.imprimirMaiorNumeroDeViews();
    }
}
