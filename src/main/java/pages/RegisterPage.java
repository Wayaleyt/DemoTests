package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    @FindBy(css = "#forms")
    public SelenideElement formsTab;
    @FindBy(css = "#register")
    public SelenideElement registerTab;
    @FindBy(css = "#firstName")
    public SelenideElement firstNameField;
    @FindBy(css = "#lastName")
    public SelenideElement lastNameField;
    @FindBy(css = "#phone")
    public SelenideElement phoneField;
    @FindBy(css = "#countries_dropdown_menu")
    public SelenideElement countryDropdown;
    @FindBy(css = "#emailAddress")
    public SelenideElement emailField;
    @FindBy(css = "#password")
    public SelenideElement passwordField;
    @FindBy(css = "#exampleCheck1")
    public SelenideElement checkBox;
    @FindBy(css = "#registerBtn")
    public SelenideElement registerButton;
    @FindBy(css = "#message")
    public SelenideElement message;


}
