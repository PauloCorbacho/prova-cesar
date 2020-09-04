package paginas;

import elementos.ElementosDiscourseTelaDemo;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;
import utils.Utils;

public class PaginaDiscourseDemo extends ElementosDiscourseTelaDemo {
    Utils utils = new Utils();

    public PaginaDiscourseDemo() {
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }

    public void realizarUmScrollNaTela() throws InterruptedException {
        utils.fecharAba(0);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
    }

    public void imprimirDescricaoDosItensBloqueados() {
        for (int i = 0; i < topicosBloqueados.size(); i++) {
            System.out.println(topicosBloqueados.get(i).getText() + "\n");
        }
    }

    public void imprimirItensPorCategoria() {
        System.out.println("Número de itens da categoria discourse é " + discourseCategoryItems.size());
        System.out.println("Número de itens da categoria movies é " + moviesCategoryItems.size());
        System.out.println("Número de itens da categoria general é " + generalCategoryItems.size());
        System.out.println("Número de itens da categoria videos é " + videosCategoryItems.size());
        System.out.println("Número de itens da categoria tech é " + techCategoryItems.size());
        System.out.println("Número de itens da categoria gaming é " + gamingCategoryItems.size());
        System.out.println("Número de itens da categoria sports é " + sportsCategoryItems.size());
        System.out.println("Número de itens da categoria school é " + schoolCategoryItems.size());
        System.out.println("Número de itens da sem categoria é " + (uncategorizedItems.size() - 1));
    }

    public void imprimirMaiorNumeroDeViews() {
        int maior = Integer.MIN_VALUE;
        String nomeDoTopico = "";
        for (int i = 0; i < todasViews.size(); i++) {
            String todosCaracteres = todasViews.get(i).getAttribute("title");
            int totalViews = Integer.parseInt(todosCaracteres.replaceAll("[^0-9.]", ""));
            if (totalViews > maior) {
                maior = totalViews;
                nomeDoTopico = todasDescricoes.get(i).getText();
            }
        }
        System.out.println("\n" + "Com " + maior + " o tópico com maior número de views é: " + nomeDoTopico);
    }
}
