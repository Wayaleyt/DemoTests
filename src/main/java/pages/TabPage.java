package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class TabPage {
    @FindBy(css = "#browser-tab")
    public SelenideElement newBrowserTab;
    @FindBy(css = "#newTabBtn")
    public SelenideElement newTabButton;
}
