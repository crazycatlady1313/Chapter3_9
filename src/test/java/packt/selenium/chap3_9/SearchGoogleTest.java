package packt.selenium.chap3_9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import packt.selenium.chap3_9.pageobjects.Google;
import packt.selenium.chap3_9.pageobjects.GoogleSearchPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ripon on 11/19/2015.
 */
public class SearchGoogleTest {
    private WebDriver driver;
    public Google googlePage;
    public GoogleSearchPage searchPage;

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(2880,1400));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
    @Test
    public void testGoogleSearch(){
        googlePage = new Google(driver);
        searchPage = googlePage.goToSearchPage();
        searchPage.getNumberOfResults();
    }
}