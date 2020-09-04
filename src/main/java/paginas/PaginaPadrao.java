package paginas;

import elementos.ElementosDiscourseTelaInicial;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;

public class PaginaPadrao extends ElementosDiscourseTelaInicial {

    public PaginaPadrao() {
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }

    public void acessarPagina(String pagina) {
        driver.get(pagina);
    }
}

