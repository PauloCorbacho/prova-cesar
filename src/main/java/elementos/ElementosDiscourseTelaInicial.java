package elementos;

import utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementosDiscourseTelaInicial extends Utils {

    @FindBy(linkText = "Demo")
    protected WebElement botaoDemo;
}
