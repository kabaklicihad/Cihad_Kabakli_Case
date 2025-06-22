package elements;
import org.openqa.selenium.By;

public class OpenPositionsPage {

    public static final By LOCATION_FILTER = By.id("select2-filter-by-location-container");
    public static final By ISTANBUL_LOCATION = By.xpath("//ul[@id='select2-filter-by-location-results']//li[contains(text(),'Istanbul, Turkiye')]");
    public static final By DEPARTMENT_FILTER = By.id("select2-filter-by-department-container");
    public static final By QUALITY_ASSURANCE = By.xpath("//ul[@id='select2-filter-by-department-results']//li[contains(text(),'Quality Assurance')]");
    public static final By JOBS_LISTS = By.id("jobs-list");
    public static final By JOB_TITLE = By.xpath("//p[contains(@class,'position-title')]");
    public static final By JOB_DEPARTMENT = By.xpath("//span[contains(@class,'position-department')]");
    public static final By JOB_LOCATION = By.xpath("//div[contains(@class,'position-location')]");
    public static final By JOB_SLOT = By.xpath("//div[@id='jobs-list']//div[contains(@class,'position-list-item-wrapper')]");
    public static final By VIEW_ROLE = By.xpath("//a[text()='View Role']");
    public static final By LEVER_APPLY_BUTTON = By.xpath("//*[text()='Apply for this job']");
    public static final By LEVER_JOB_TITLE = By.cssSelector("[class='posting-headline'] > h2");

}