package ZadaniaZaliczeniowe;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Zadanie1ZaliczenieCz1 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        // otwiera przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        // maxymalizuje okno przeglądarki
        driver.manage().window().maximize();
        // przechodzi do strony o podanym adresie
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        // szukanie przycisku Sign In i kliknięcie
        WebElement SignInInput = driver.findElement(By.className("user-info"));
        SignInInput.click();
        //szukanie pola email
        WebElement emailInput = driver.findElement(By.name("email"));
        //uzupełnianie pola email
        emailInput.sendKeys("patryk0905@op.pl");
        //szukanie pola password
        WebElement passwordInput = driver.findElement(By.name("password"));
        //uzupełnianie pola password
        passwordInput.sendKeys("test1234");
        // logowanie po wpisaniu prawidłowych danych użytkownika
        WebElement SignInButton = driver.findElement(By.id("submit-login"));
        SignInButton.click();
        //szukanie przycisku Addresses i kliknięcie
        WebElement AddressesButton = driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[4]/a"));
        AddressesButton.click();
        //szukanie przycisku Create New Address i kliknięcie
        WebElement CreateNewAddressButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a/span"));
        CreateNewAddressButton.click();
    }
}

