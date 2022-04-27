package ZadaniaZaliczeniowe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadanie2Zaliczenie {


    public static void main(String[] args) {
        String title = "M";



        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        // otwiera przeglądarkę Chrome
        WebDriver driver = new ChromeDriver();
        // maxymalizuje okno przeglądarki
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
        // szukanie przycisku my store przekierowującego na stronę główną
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        // wybranie do zakupu Hummingbird Printed Sweater
        WebElement HummingbirdPrintedSweaterButton = driver.findElement(By.xpath("//*[@id=\"content\"]/section/div/article[2]/div/a/img"));
        HummingbirdPrintedSweaterButton.click();
        // rozwijanie listy rozmiarów
        WebElement SizeButton = driver.findElement(By.id("group_1"));
        SizeButton.click();
        // wybranie rozmiaru M
        if (title == "M")
            driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]")).click();
        // czyszczenie pola Quantity
        WebElement QuantityButton = driver.findElement(By.id("quantity_wanted"));
        QuantityButton.clear();
        // wybieranie 5 sztuk produktu
        WebElement QuantityInput = driver.findElement(By.id("quantity_wanted"));
        QuantityInput.sendKeys("5");
        // dodawanie do koszyka 5 sztuk
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement Add5pcs = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]"));
        Add5pcs.click();
        // Kliknięcie Proceed
        WebElement Proceed = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Proceed.click();
        // Potwierdzenie po dodaniu do koszyka
        WebElement Proceed2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        Proceed2.click();
        // Kliknięcie w pole address
        WebElement ClickAddress = driver.findElement(By.name("address1"));
        ClickAddress.click();
        // Wpisanie adresu
        WebElement WriteAddress = driver.findElement(By.name("address1"));
        WriteAddress.sendKeys("adres1234");
        // Wpisanie kodu pocztowego
        WebElement PostalCode = driver.findElement(By.name("postcode"));
        PostalCode.sendKeys("01-2345");
        // Wpisanie nazwy miasta
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement CityInput = driver.findElement(By.name("city"));;
        CityInput.sendKeys("Nysa");
        // Kliknięcie w listę rozwijana krajów
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement Country = driver.findElement(By.name("id_country"));
        Country.click();
        // Kliknięcie w United Kingdom po rozwinięciu listy
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement UnitedKingdom = driver.findElement(By.name("id_country"));
        UnitedKingdom.sendKeys("United Kingdom");
        UnitedKingdom.click();
        // Kliknięcie Continue po uzupełnieniu wszystkich pól adresu
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement ConfirmAddress = driver.findElement(By.name("confirm-addresses"));
        ConfirmAddress.click();
        // Kliknięcie w przycisk wybierajacy pick up free
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        WebElement PickUp = driver.findElement(By.id("delivery_option_1"));
        PickUp.click();

        // Kliknięcie CONTINUE po wybraniu shipping method
        WebElement CONTINUE2 = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        CONTINUE2.click();
//        // Wybranie opcji Pay by check
//        WebElement PayByCheck = driver.findElement(By.xpath("payment-option-1"));
//        PayByCheck.click();
//        // Zaznaczenie fajeczką "I agree..."
//        WebElement Agree = driver.findElement(By.id("conditions_to_approve[terms-and-conditions]"));
//        Agree.click();
//        // Kliknięcie ORDER WITH AN
//        WebElement OrderWithAn = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
//        OrderWithAn.click();

    }
}