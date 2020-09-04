package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utils.Utils;

import java.util.List;

public class ElementosTrivagorTelaInicial extends Utils {

    @FindBy(css = "#querytext")
    protected WebElement campoPesquisar;


    @FindBy(xpath = "//*[@class='ssg-suggestion__info']")
    protected List<WebElement> listaDeDestinos;

    @FindBy(xpath = "//*[@class='btn btn--primary btn--regular search-button js-search-button']")
    protected WebElement botaoPesquisar;

    @FindBy(xpath = "//*[@class='dealform-button dealform-button--guests js-dealform-button-guests']")
    protected WebElement quantidadeDeQuartosButton;

    @FindBy(xpath = "//*[@class='circle-btn circle-btn--minus']")
    protected List<WebElement> diminuirQuantidadeDeAdultos;

    @FindBy(xpath = "//*[@class='btn btn--primary btn--small btn--apply-config']")
    protected WebElement confirmarQuantidadeQuartos;

    @FindBy(xpath = "//*[@class='df_overlay_close_wrap overlay__close']")
    protected WebElement botaoFecharData;

    public void ordenarPesquisarPor(String ordenarPor) {
        Select dropdown = new Select(driver.findElement(By.id("mf-select-sortby")));
        dropdown.selectByVisibleText(ordenarPor);
    }

    @FindBy(xpath = "//*[@itemprop='name']")
    protected List<WebElement> nomeHoteis;

    @FindBy(xpath = "//*[@itemprop='starRating']")
    protected List<WebElement> avaliacoesHotel;

    @FindBy(xpath = "//*[@data-qa='recommended-price-partner']")
    protected List<WebElement> siteParceiro;

    @FindBy(xpath = "//*[@data-qa='recommended-price']")
    protected List<WebElement> valorDoQuarto;

    @FindBy(xpath = "//*[@class='details-paragraph details-paragraph--location location-details']")
    protected List<WebElement> localizacaoHotel;

    @FindBy(xpath = "//*[@class='expand-amenities']")
    protected List<WebElement> comididadesHotel;

    @FindBy(xpath = "//*[@class='unordered-list__item']")
    protected List<WebElement> todasComodidadesHotel;
}
