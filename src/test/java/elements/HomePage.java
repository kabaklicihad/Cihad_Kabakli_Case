package elements;
import org.openqa.selenium.By;

public class HomePage {

    public static final By ACCEPT_COOKIES = By.id("wt-cli-accept-all-btn");
    public static final By EXPLORE_INSIDER = By.id("highlight-en");
    public static final By GET_DEMO = By.xpath("//li[@class='nav-item']//a[text()='Get a Demo']");
    public static final By LOGIN_BUTTON = By.xpath("//li[@class='nav-item']//a[text()='Login']");
    public static final By COMPANY_DROPDOWN = By.xpath("//a[@id='navbarDropdownMenuLink' and contains(text(), 'Company')]");
    public static final By CAREERS_MENU = By.xpath("//a[contains(text(), 'Careers')]");

}