package ui;

import base.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DropdownPageTest extends BaseTest {

    @DisplayName("Проверка выпадающего списка")
    @Test
    public void dropdownTest() {
        dropdownPage.dropdownMenuBtn.click();
        dropdownPage.simpleDropdown.click();
        $$x("//option").get(2).click();
        Assertions.assertEquals($("#dropdown-menu").getText(), "Albania");
    }

}
