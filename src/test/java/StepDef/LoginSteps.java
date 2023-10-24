package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("User in login page screen")
    public void userInLoginPageScreen() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.edge.driver", dir+"/driver/msedgedriver.exe");
        driver = new EdgeDriver();

        driver.get("https://www.saucedemo.com/");
        //Thread.sleep(1000);

        driver.findElement(By.name("login-button")).isDisplayed();
    }

    @Then("User submit username")
    public void userSubmitUsername() {
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
    }

    @And("User submit password")
    public void userSubmitPassword() {
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
    }

    @When("Click Login button")
    public void clickLoginButton() {
        driver.findElement(By.name("login-button")).click();
    }

    @Then("User directed to home page")
    public void userDirectedToHomePage() {
        driver.findElement(By.id("shopping_cart_container")).isDisplayed();

        driver.close();
        driver.quit();
    }


}
