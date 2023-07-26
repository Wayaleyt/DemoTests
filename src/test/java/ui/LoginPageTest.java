package ui;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class LoginPageTest extends BaseTest {

    @DisplayName("Успешный логин")
    @Test
    public void successLoginTest() {
    loginPage.formsTab.click();
    loginPage.loginTab.click();
    loginPage.emailField.sendKeys("admin@admin.com");
    loginPage.passwordField.sendKeys("admin123");
    loginPage.submitButton.click();
    loginPage.message
                .shouldHave(Condition.text("admin@admin.com, you have successfully logged in!"));
    }

    @DisplayName("Неуспешный логин")
    @ParameterizedTest
    @MethodSource("creds")
    public void unsuccessfulLoginTest(String login, String password) {
        loginPage.formsTab.click();
        loginPage.loginTab.click();
        loginPage.emailField.setValue(login);
        loginPage.passwordField.setValue(password);
        loginPage.submitButton.click();
        loginPage.message
                .shouldHave(Condition.text("Bad credentials! Please try again! Make sure that you've registered."));
    }

    private static Stream<Arguments> creds() {
        return Stream.of(
                Arguments.of("admin@admin.com", "admin1234"),
                Arguments.of("admin@neadmin.com", "admin123"),
                Arguments.of("I{p4$oTk@mail.ru", "admin1234"),
                Arguments.of(" ", " "),
                Arguments.of("I{p4$oTk@mail.ru", "I{p4$oTk@mail.ru"),
                Arguments.of("admin@", "."),
                Arguments.of(".", "."),
                Arguments.of("@@@@@", "@@@@@"),
                Arguments.of("admin@admin.com", ""));
    }

}
