package elements;
import org.openqa.selenium.By;

public class CareersPage {

    public static final By FIND_JOB = By.xpath("//section[@id='page-head']//div[contains(@class,'button-group')]//a[text()='Find your dream job']");
    public static final By FIND_CALLING_TITLE = By.xpath("//section[@id='career-find-our-calling']//h3[@class='category-title-media']");
    public static final By SEE_ALL_TEAMS_BUTTON = By.xpath("//section[@id='career-find-our-calling']//a[text()='See all teams']");
    public static final By OUR_LOCATIONS = By.id("career-our-location");
    public static final By CATEGORY_TITLE = By.xpath("//section[@id='career-our-location']//h3[contains(@class,'category-title')]");
    public static final By LOCATION_ITEMS = By.id("location-slider");
    public static final By LIFE_AT_INSIDER = By.xpath("//h2[text()='Life at Insider']");
    public static final By CAREER_CATEGORIES = By.id("career-find-our-calling");
    public static final By SEE_ALL_QA_JOBS = By.xpath("//section[@id='page-head']//a[text()='See all QA jobs']");

}