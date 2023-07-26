package ui;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AlertsPageTest extends BaseTest {

    @DisplayName("Работоспособность кнопки Alert")
    @Test
    public void alertBtnTest() {
        alertsPage.alertMenuBtn.click();
        alertsPage.alertButton.click();
        Assertions.assertEquals(Selenide.switchTo().alert().getText(), "Hello! I am an alert box!!");
    }

    @DisplayName("Работоспособность кнопки Confirm")
    @Test
    public void confirmBtnTest() {
        alertsPage.alertMenuBtn.click();
        alertsPage.confirmButton.click();
        Assertions.assertEquals(Selenide.switchTo().alert().getText(), "Press a button!\nEither OK or Cancel.");
    }

    @DisplayName("Возможность закрыть Alert")
    @Test
    public void alertDisappearanceTest() {
        alertsPage.alertMenuBtn.click();
        alertsPage.alertButton.click();
        Selenide.switchTo().alert().accept();
    }

    @DisplayName("Возможность закрыть Confirm")
    @Test
    public void confirmDisappearanceTest() {
        alertsPage.alertMenuBtn.click();
        alertsPage.confirmButton.click();
        Selenide.switchTo().alert().accept();
    }

    @DisplayName("Отклонение Confirm")
    @Test
    public void confirmBtnDismissTest() {
        alertsPage.confirmButton.click();
        Selenide.switchTo().alert().dismiss();
    }
}
