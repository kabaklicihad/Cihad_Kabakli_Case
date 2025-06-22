package runner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Careers;
import pages.Home;
import pages.OpenPositions;
import base.BaseWeb;

public class WebTest extends BaseWeb {

    Home home;
    Careers careers;
    OpenPositions openPositions;

    @BeforeTest
    public void beforeTest(){

        home = new Home(driver);
        careers = new Careers(driver);
        openPositions = new OpenPositions(driver);
    }

    @Test
    public void webTest(){
        home.homeInsider();
        careers.checkCareersPage();
        openPositions.checkPositions();
    }
}