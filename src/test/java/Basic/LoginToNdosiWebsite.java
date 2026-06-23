package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginToNdosiWebsite {

    WebDriver driver;

    @BeforeTest
    public void launchbrowser() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
    }

    @Test
    public void clickloginTests() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }
     @Test(priority = 4)
    public void fillformTest() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("Priscilla Dlamini");
        driver.findElement(By.id("email")).sendKeys("scilla@test.com");
        driver.findElement(By.id("age")).click();
        driver.findElement(By.id("age")).sendKeys("25");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
        driver.findElement(By.name("country"));
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[5]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"experience\"]/option[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("skill-javascript")).click();
        driver.findElement(By.id("skill-selenium")).click();
        driver.findElement(By.id("comments")).sendKeys("Test Automation Practice");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("validate-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("submissions-toggle-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("view-submission-0")).click();
    }
    @Test(priority = 1)
    public void enterusernameAndPasswordTest() {
        driver.findElement(By.id("login-email")).sendKeys("dlamini@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("@12345678");
    }
        @Test(priority = 2)
    public void clicksubmitTest() throws InterruptedException {
        driver.findElement(By.name("loginSubmit")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void navigateToFormTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id =\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
    }
    @AfterTest
    public void closebrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}