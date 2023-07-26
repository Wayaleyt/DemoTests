package base;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import pages.*;

import static com.codeborne.selenide.Selenide.page;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {
    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected AlertsPage alertsPage;
    protected TabPage tabPage;
    protected UploadPage uploadPage;
    protected IframesPage iframesPage;
    protected LoaderPage loaderPage;
    protected DropdownPage dropdownPage;

    @BeforeAll
    public void beforeAll() {
        loginPage = page(LoginPage.class);
        registerPage = page(RegisterPage.class);
        alertsPage = page(AlertsPage.class);
        tabPage = page(TabPage.class);
        uploadPage = page(UploadPage.class);
        iframesPage = page(IframesPage.class);
        loaderPage = page(LoaderPage.class);
        dropdownPage = page(DropdownPage.class);
    }

    @BeforeEach
    public void open() {
        Selenide.open("https://qa-practice.netlify.app");
    }

}
