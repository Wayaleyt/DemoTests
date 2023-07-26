package ui;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LoaderPageTest extends BaseTest {
    @DisplayName("Ожидание загрузки")
    @Test
    public void loaderTest(){
        loaderPage.loaderMenuBtn.click();
        loaderPage.loader.shouldHave(Condition.partialText("Some text in my newly loaded page.."));
    }
}
