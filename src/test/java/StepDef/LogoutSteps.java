package StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LogoutSteps {
    WebDriver driver;

    @Given("User in home page")
    public void userInHomePage() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.edge.driver", dir+"/driver/msedgedriver.exe");
        driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com/");
        //Thread.sleep(1000);

        driver.findElement(By.name("login-button")).isDisplayed();

        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        driver.findElement(By.name("login-button")).click();

        driver.findElement(By.id("shopping_cart_container")).isDisplayed();

    }

    @Then("User click hamburger menu")
    public void userClickHamburgerMenu() {
        driver.findElement(By.id("react-burger-menu-btn")).click();
    }

    @When("User click logout button")
    public void userClickLogoutButton() {
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.findElement(By.id("logout_sidebar_link")).click();
    }

    @Then("User directed to login screen")
    public void userDirectedToLoginScreen() {
        //driver.findElement(By.name("login-button")).isDisplayed();

        //driver.close();
        //driver.quit();
    }
}
