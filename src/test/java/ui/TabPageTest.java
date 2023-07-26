package ui;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class TabPageTest extends BaseTest {

    @DisplayName("Открытие новой вкладки")
    @Test
    public void newTabTest() {
        $(byText("New Tab / Window")).click();
        tabPage.newBrowserTab.click();
        tabPage.newTabButton.click();
        Selenide.switchTo().window(1);
        webdriver().shouldHave(url("https://qa-practice.netlify.app/web-table.html"));
        $("#peopleTable").shouldBe(Condition.visible);
    }

    @DisplayName("Открытие нескольких вкладок")
    @Test
    public void multipleTabTest() {
    $(byText("New Tab / Window")).click();
        tabPage.newBrowserTab.click();
        tabPage.newTabButton.click();
        Selenide.switchTo().window(1);
        $("#peopleTable").shouldBe(Condition.visible);
        Selenide.switchTo().window(0);
        tabPage.newTabButton.click();
        Selenide.switchTo().window(2);
        $("#peopleTable").shouldBe(Condition.visible);
}
}
