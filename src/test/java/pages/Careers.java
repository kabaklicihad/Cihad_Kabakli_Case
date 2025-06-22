package pages;
import org.openqa.selenium.WebDriver;
import base.DriverMethods;
import static elements.CareersPage.*;

public class Careers extends DriverMethods {

    public String careersPageUrl = "https://useinsider.com/careers/";
    public String qaCareersPageUrl = "https://useinsider.com/careers/quality-assurance/";

    public Careers(WebDriver driver) {super(driver);}

    public Careers checkCareersPage(){
        checkUrl(careersPageUrl);
        isElementExist(FIND_JOB);
        scrollToElement(FIND_CALLING_TITLE);
        isElementContainText(FIND_CALLING_TITLE,"Find your calling");
        isElementExist(CAREER_CATEGORIES);
        isElementExist(SEE_ALL_TEAMS_BUTTON);
        scrollToElement(OUR_LOCATIONS);
        isElementExist(OUR_LOCATIONS);
        isElementContainText(CATEGORY_TITLE,"Our Locations");
        isElementExist(LOCATION_ITEMS);
        scrollToElement(LIFE_AT_INSIDER);
        isElementExist(LIFE_AT_INSIDER);
        isElementContainText(LIFE_AT_INSIDER,"Life at Insider");
        navigateToUrl(qaCareersPageUrl);
        clickTo(SEE_ALL_QA_JOBS);
        return this;
    }

}