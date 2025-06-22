package pages;
import org.openqa.selenium.WebDriver;
import base.DriverMethods;
import static elements.OpenPositionsPage.*;
public class OpenPositions extends DriverMethods {

    public String openPositionsPageUrl = "https://useinsider.com/careers/open-positions/?department=qualityassurance";

    public OpenPositions (WebDriver driver){super(driver);}

    public OpenPositions checkPositions(){
        checkUrl(openPositionsPageUrl);
        isElementVisible(ISTANBUL_LOCATION);
        clickTo(LOCATION_FILTER);
        scrollToElement(ISTANBUL_LOCATION);
        clickTo(ISTANBUL_LOCATION);
        clickTo(DEPARTMENT_FILTER);
        scrollToElement(QUALITY_ASSURANCE);
        clickTo(QUALITY_ASSURANCE);
        isElementVisible(JOBS_LISTS);
        isElementExist(JOBS_LISTS);
        scrollToElement(JOBS_LISTS);
        hoverElement(JOB_SLOT);
        isElementVisible(VIEW_ROLE);
        checkElementsContains(JOB_TITLE,"Quality Assurance");
        checkElementsContains(JOB_DEPARTMENT,"Quality Assurance");
        checkElementsContains(JOB_LOCATION,"Istanbul, Turkiye");
        clickTo(VIEW_ROLE);
        switchTab();
        urlContains("https://jobs.lever.co/useinsider");
        isElementExist(LEVER_APPLY_BUTTON);
        isElementContainText(LEVER_JOB_TITLE, "Quality Assurance");
        return this;
    }
}