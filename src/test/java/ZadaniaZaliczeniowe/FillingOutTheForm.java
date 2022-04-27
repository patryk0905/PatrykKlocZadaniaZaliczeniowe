package ZadaniaZaliczeniowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillingOutTheForm {

    private WebDriver driver;

    @FindBy(name = "alias")
    private WebElement AliasInput;

    @FindBy(name = "address1")
    private WebElement Address1Input;

    @FindBy(name = "city")
    private WebElement CityInput;

    @FindBy(name = "postcode")
    private WebElement PostCodeInput;

    @FindBy(id = "id_country")
    private WebElement countryChooseInput;

    @FindBy(name = "phone")
    private WebElement PhoneInput;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement SaveButton;

    public FillingOutTheForm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void FillForm(String alias, String address, String postal_code, String city, String country, String phone) {
        AliasInput.sendKeys(alias);
        Address1Input.sendKeys(address);
        PostCodeInput.sendKeys(postal_code);
        CityInput.sendKeys(city);
        countryChooseInput.sendKeys(country);
        PhoneInput.sendKeys(phone);

    }



}
