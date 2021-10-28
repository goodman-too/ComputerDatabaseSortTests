import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class BaseTest {
    @BeforeMethod
    public void setUp() {
        Configuration.startMaximized = true;
//        WebDriverManager.chromedriver().driverVersion("94.0.4606.61").setup();
    }

    @AfterMethod
    public void tearDown() {
        closeWebDriver();
    }
}
