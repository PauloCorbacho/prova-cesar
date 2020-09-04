package paginas;

import elementos.ElementosDiscourseTelaInicial;
import org.openqa.selenium.support.PageFactory;
import setup.BaseTestes;

public class PaginaDiscourseTelaInicial extends ElementosDiscourseTelaInicial {

    public PaginaDiscourseTelaInicial() {
        driver = BaseTestes.obterDriver();
        PageFactory.initElements(BaseTestes.obterDriver(), this);
    }

    public void clicarNoBotaoDemo() {
        botaoDemo.click();
    }
}