package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(css = "#forms")
    public SelenideElement formsTab;
    @FindBy(css = "#login")
    public SelenideElement loginTab;
    @FindBy(css = "#email")
    public SelenideElement emailField;
    @FindBy(css = "#password")
    public SelenideElement passwordField;
    @FindBy(css = "#submitLoginBtn")
    public SelenideElement submitButton;
    @FindBy(css = "#message")
    public SelenideElement message;

}
