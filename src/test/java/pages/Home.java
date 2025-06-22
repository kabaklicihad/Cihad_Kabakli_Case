package pages;
import org.openqa.selenium.WebDriver;
import base.DriverMethods;
import static elements.HomePage.*;

public class Home extends DriverMethods {

    public String baseURL = "https://useinsider.com/";

    public Home (WebDriver driver) {super(driver);}

    public Home homeInsider(){

        clickTo(ACCEPT_COOKIES);
        checkUrl(baseURL);
        isElementExist(EXPLORE_INSIDER);
        isElementExist(LOGIN_BUTTON);
        isElementExist(GET_DEMO);
        hoverElement(COMPANY_DROPDOWN);
        clickTo(CAREERS_MENU);
        return this;
    }
}