package ui;

import base.BaseTest;
import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;

public class UploadPageTest extends BaseTest {

    @DisplayName("Загрузка файла")
    @Test
    public void fileUploadTest() {
        uploadPage.uploadMenuBtn.click();
        uploadPage.uploadButton.uploadFile(new File("src/main/resources/file.pdf"));
        uploadPage.submitButton.click();
        uploadPage.uploadResonse.shouldHave(Condition.exactText("You have successfully uploaded \"file.pdf\""));
    }

    @Disabled //BUG Нет ошибки при нажатии кнопки Submit без загрузки файла
    @DisplayName("Нажатие кнопки загрузки без файла")
    @Test()
    public void emptyUploadTest() {
        uploadPage.uploadMenuBtn.click();
        uploadPage.submitButton.click();
    }
}
