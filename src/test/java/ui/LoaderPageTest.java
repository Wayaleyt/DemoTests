package ui;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

public class LoaderPageTest extends BaseTest {
    @Test
    public void loaderTest(){
        loaderPage.loaderMenuBtn.click();
        loaderPage.loader.shouldHave(Condition.partialText("Some text in my newly loaded page.."));
    }
}
