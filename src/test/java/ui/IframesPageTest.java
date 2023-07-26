package ui;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IframesPageTest extends BaseTest {
    @DisplayName("Проверка iframe")
    @Test
    public void iframeTest(){
        iframesPage.iframeTab.click();
        Selenide.switchTo().innerFrame("iframe-checkboxes");
        iframesPage.iframeButton.click();
        iframesPage.iframeText.shouldHave(Condition.exactText("This text appears when you click the \"Learn more\" button"));
    }

}
