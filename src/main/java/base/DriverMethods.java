package base;
import log.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class DriverMethods extends BaseWeb{

        public DriverMethods(WebDriver driver) {
        DriverMethods.driver = BaseWeb.driver;
    }

    public WebElement findElement(By by) {

        WebDriverWait webDriverWait = new WebDriverWait(BaseWeb.driver, Duration.ofSeconds(30));
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void checkUrl(String url) {
        String currentUrl = BaseWeb.driver.getCurrentUrl();
        if (currentUrl != null && currentUrl.equals(url)) {
            log("Current URL is same with '" + url + "'");
        } else {
            Assert.fail("Current URL is different from '" + url + "'");
        }
    }

    public void urlContains(String url) {
        String currentUrl = BaseWeb.driver.getCurrentUrl();
        Assert.assertTrue(currentUrl,currentUrl.contains(url));
        log("Current URL contains '" + url + "'");
    }

    public void isElementContainText(By by,String text){
        String text2 = findElement(by).getText();
        if (text2.contains(text)) {
            log("Element contains '" + text + "' text.");
        } else {
            Assert.fail("Element does not contain '" + text + "' text.");
        }
    }

    public void checkElementsContains(By by, String expectedText){
        List<WebElement> elements = BaseWeb.driver.findElements(by);
        for (int i = 0; i < elements.size(); i++) {
        String elementText = elements.get(i).getText();
        if (elementText.contains(expectedText)) {
            log("Element contains '" + expectedText + "'. Value : " + elementText);
        } else {
            Assert.fail("Element does not contain '" + expectedText + "'. Value : " + elementText);
        }
    }
    }
    
    public void isElementExist(By by){
        try {findElement(by);
            log("Element '" + by + "' is found.");

        } catch (NoSuchElementException e) {
            Assert.fail("Element '" + by + "' is not found.");
        }
    }

    public void clickTo(By by) {
        findElement(by).click();
        log("Click to '" + by + "' element.");
     
    }

    public void delaySec(int sec) {

        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (Exception e) {
            log(e.getMessage());
        }
        log("Waited for " + sec);
    }

    public boolean isElementVisible(By by) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            log("Element '" + by + "' is visible.");
            return true;
        } catch (TimeoutException e) {
            return false;
        }
    }

    public void scrollToElement(By by) {
        WebElement element = findElement(by);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
        log("Scroll to '" + by + "' element.");
    
    }
    public void jScriptClick(By by){
        WebElement element = findElement(by);
        WebDriverWait webDriverWait = new WebDriverWait(BaseWeb.driver, Duration.ofSeconds(30));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(by));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", element);
    }

    public void hoverElement(By by) {
        Actions actions = new Actions(BaseWeb.driver);
        actions.moveToElement(findElement(by)).build().perform();
        log("Hover to '" + by + "' element.");
    }

    public void switchTab() {
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String childWindow : allWindows) {
            if (!parent.equalsIgnoreCase((childWindow))) {
                driver.switchTo().window(childWindow);
                log("Tab is switched");
            }
        }
    }

    public void navigateToUrl(String url) {
        try {
            driver.navigate().to(url);
            log("Navigated to '" + url + "'");
        } catch (Exception e) {
            log("Unable to navigate to '" + url + "'");
            e.printStackTrace();
        }
    }

    public void log(String text) {
        Log logger = new Log();
        logger.log(text);
    }
}