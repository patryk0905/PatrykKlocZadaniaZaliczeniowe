package ZadaniaZaliczeniowe;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefs {

    private WebDriver driver;

    @Given("user is logged in to his account")
    public void userIsLoggedInToHisAccount() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=address");

        FillingOutTheForm fillingOutTheForm = new FillingOutTheForm(driver);
        fillingOutTheForm.FillForm("alias", "address", "postal_code", "city", "country", "phone");

    }

    @When("user clicks the {string} button")
    public void userClicksTheButton() {
        driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[4]/a")).click();
    }

    @When("user clicks the {string} button to add a new address")
    public void userClicksTheButtonToAddANewAddress(String arg0) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a/span")).click();
    }

    @When("user fills form with data {string}, {string}, {string}, {string}, {string}, {string}")
    public void userClicksTheButton(String alias, String address, String postal_code, String city, String country, String phone) {
        FillingOutTheForm fillingOutTheForm = new FillingOutTheForm(driver);
        fillingOutTheForm.FillForm(alias, address, postal_code, city, country, phone);
    }

    @And("on the same page, the user clicks the {string} button to add a new address")
    public void onTheSamePageTheUserClicksTheButtonToAddANewAddress(String arg0) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).click();
    }

    @Then("the address of the user will be added")
    public void theAddressOfTheUserWillBeAdded() {
        WebElement addedAddress = driver.findElement(By.xpath("//*[@id=\"address-24486\"]/div[1]/address"));
        Assertions.assertTrue(addedAddress.isDisplayed());
    }
}
