package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage {
    @FindBy(css = "#file-upload-item")
    public SelenideElement uploadMenuBtn;
    @FindBy(css = "#file_upload")
    public SelenideElement uploadButton;
    @FindBy(css = ".btn-primary")
    public SelenideElement submitButton;
    @FindBy(css = "#file_upload_response")
    public SelenideElement uploadResonse;

}
