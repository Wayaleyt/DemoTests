package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage {
    @FindBy(css = "#dropdown-menu")
    public SelenideElement simpleDropdown;
    @FindBy(css = "#dropdowns")
    public SelenideElement dropdownMenuBtn;
}
