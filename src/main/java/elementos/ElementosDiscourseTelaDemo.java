package elementos;

import utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementosDiscourseTelaDemo extends Utils {

    @FindBy(xpath = "//*[@class='title raw-link raw-topic-link']")
    protected List<WebElement> todasDescricoes;

    @FindBy(css = "tr.closed span.link-top-line a")
    protected List<WebElement> topicosBloqueados;

    @FindBy(css = "td.num.views span.number")
    protected List<WebElement> todasViews;

    @FindBy(css = "tr.category-discourse")
    protected List<WebElement> discourseCategoryItems;

    @FindBy(css = "tr.category-movies")
    protected List<WebElement> moviesCategoryItems;

    @FindBy(css = "tr.category-general")
    protected List<WebElement> generalCategoryItems;

    @FindBy(css = "tr.category-videos")
    protected List<WebElement> videosCategoryItems;

    @FindBy(css = "tr.category-tech")
    protected List<WebElement> techCategoryItems;

    @FindBy(css = "tr.category-gaming")
    protected List<WebElement> gamingCategoryItems;

    @FindBy(css = "tr.category-sports")
    protected List<WebElement> sportsCategoryItems;

    @FindBy(css = "tr.category-school")
    protected List<WebElement> schoolCategoryItems;

    @FindBy(css = "tr.category-uncategorized")
    protected List<WebElement> uncategorizedItems;
}
