package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import java.time.Duration;
import java.util.Map;

public class BaseWeb {

    protected static WebDriver driver;

    @BeforeTest
    @Parameters({"desiredBrowser"})
    public void setUp(@Optional("chrome") String desiredBrowser) {

        if ("chrome".equalsIgnoreCase((desiredBrowser))) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("disable-translate");
            options.addArguments("test-type");
            options.setExperimentalOption("prefs", Map.of("profile.default_content_setting_values.notifications", 2));
            driver = new ChromeDriver(options);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.navigate().to("https://useinsider.com/");

        } else if ("firefox".equalsIgnoreCase(desiredBrowser)) {
            WebDriverManager.firefoxdriver().setup();
            FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("permissions.default.desktop-notification", 2);
            FirefoxOptions options = new FirefoxOptions();
            options.setProfile(profile);
            options.addArguments("start-maximized");
            options.addArguments("--disable-popup-blocking");
            options.addArguments("disable-translate");
            options.addArguments("test-type");
            driver = new FirefoxDriver(options);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.navigate().to("https://useinsider.com/");

        } else {System.out.println("Check your browser selection !");}

    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}