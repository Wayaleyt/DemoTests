package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoaderPage {
    @FindBy(css = "#loader")
    public SelenideElement loaderMenuBtn;
    @FindBy(css = "#myDiv")
    public SelenideElement loader;
}
