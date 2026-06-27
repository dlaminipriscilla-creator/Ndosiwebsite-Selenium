package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    WebDriver driver;

    By contactUs_xpath = By.xpath("//button[@class='nav-item ']/span[contains(text(),'Contact Us')]");
    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickContactUs() {
        driver.findElement(contactUs_xpath).click();
    }
}


