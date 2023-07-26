package ui;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegisterPageTest extends BaseTest {


    @DisplayName("Создание аккаунта со всеми полями")
    @Test
    public void createAccountTest(){
        registerPage.formsTab.click();
        registerPage.registerTab.click();
        registerPage.firstNameField.sendKeys("test");
        registerPage.lastNameField.sendKeys("test");
        registerPage.phoneField.sendKeys("79997779977");
        registerPage.countryDropdown.selectOption("Russia");
        registerPage.emailField.sendKeys("test@test.ru");
        registerPage.passwordField.sendKeys("admin123");
        registerPage.checkBox.click();
        registerPage.registerButton.click();
        registerPage.message
                .shouldHave(Condition.text("The account has been successfully created"));
    }

    @DisplayName("Создание аккаунта только с обязательными полями")
    @Test
    public void onlyRequiredFieldsTest(){
        registerPage.formsTab.click();
        registerPage.registerTab.click();
        registerPage.emailField.sendKeys("test@test.ru");
        registerPage.passwordField.sendKeys("admin123");
        registerPage.registerButton.click();
        registerPage.message
                .shouldHave(Condition.text("The account has been successfully created"));
    }

    @Disabled // BUG Отсутствует проверка формата почты
    @DisplayName("Создание аккаунта с неверным форматом email")
    @Test
    public void wrongEmailFormatTest(){
        registerPage.formsTab.click();
        registerPage.registerTab.click();
        registerPage.emailField.sendKeys("erferfgerg");
        registerPage.passwordField.sendKeys("admin123");
        registerPage.checkBox.click();
        registerPage.registerButton.click();
        registerPage.message
                .shouldHave(Condition.text("The account has been successfully created"));
    }

    @DisplayName("Создание аккаунта с паролем в виде пробела")
    @Test
    public void spacePasswordTest(){
        registerPage.formsTab.click();
        registerPage.registerTab.click();
        registerPage.emailField.sendKeys("test@test.ru");
        registerPage.passwordField.sendKeys(" ");
        registerPage.checkBox.click();
        registerPage.registerButton.click();
        registerPage.message
                .shouldHave(Condition.text("The account has been successfully created"));
    }

    @DisplayName("Создание аккаунта без принятия условий")
    @Test
    public void noTermsTest(){
        registerPage.formsTab.click();
        registerPage.registerTab.click();
        registerPage.firstNameField.sendKeys("test");
        registerPage.lastNameField.sendKeys("test");
        registerPage.phoneField.sendKeys("79997779977");
        registerPage.countryDropdown.selectOption("Russia");
        registerPage.emailField.sendKeys("test@test.ru");
        registerPage.passwordField.sendKeys("admin123");
        registerPage.checkBox.click();
        registerPage.registerButton.click();
        registerPage.message
                .shouldHave(Condition.text("The account has been successfully created"));
    }

}
