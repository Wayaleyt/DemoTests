package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class IframesPage {
    @FindBy(css = "#iframes")
    public SelenideElement iframeTab;
    @FindBy(css = "#learn-more")
    public SelenideElement iframeButton;
    @FindBy(css = "#show-text")
    public SelenideElement iframeText;
}
