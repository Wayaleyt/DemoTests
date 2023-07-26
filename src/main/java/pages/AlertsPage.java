package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage {
    @FindBy(css = "#alerts")
    public SelenideElement alertMenuBtn;
    @FindBy(css = "#alert-btn")
    public SelenideElement alertButton;
    @FindBy(css = "#confirm-btn")
    public SelenideElement confirmButton;
}
