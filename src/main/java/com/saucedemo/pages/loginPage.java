package com.saucedemo.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class loginPage extends basePage{
    @FindBy(id="user-name")
    private static WebElement username;
    @FindBy(id="password")
    private static WebElement password;
    @FindBy(id="login-button")
    private static WebElement loginButton;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    private static WebElement itemOne;
    @FindBy(id="add-to-cart-sauce-labs-bike-light")
    private static WebElement itemtwo;
    @FindBy(id="shopping_cart_container")
    private static WebElement chart;
    @FindBy(xpath="//*[@id=\"item_4_title_link\"]/div")
    private static WebElement verifyItemOne;
    @FindBy(xpath="//*[@id=\"item_0_title_link\"]/div")
    private static WebElement verifyItemTwo;
    @FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
    private static WebElement basketItems;
    @FindBy(xpath="//*[@id=\"remove-sauce-labs-backpack\"]")
    private static WebElement basketItem1;
    @FindBy(xpath = "<button class=\"btn btn_secondary btn_small cart_button\" data-test=\"remove-sauce-labs-bike-light\" id=\"remove-sauce-labs-bike-light\" name=\"remove-sauce-labs-bike-light\">Remove</button>")
    private static WebElement basketItem2;
    @FindBy(id="basketItems")
    private static WebElement checkoutButton;
    @FindBy(id="//*[@id=\"first-name\"]")
    private static WebElement firstName;
    @FindBy(id = "lastname")
    private static WebElement lastName;
    @FindBy(xpath="//*[@id=\"postal-code\"]")
    private static WebElement post;
    @FindBy(xpath="//*[@id=\"continue\"]")
    private static WebElement contiueButton;




 //   public loginPage(WebDriver driver);
   // { super(driver);}
    public static void loginUserActions(String usernamevalue)
    {
        username.sendKeys(usernamevalue);

    }
    public static void loginPasswordAction(String passwordValue)
    {
        password.sendKeys(passwordValue);
    }
    public static void loginButtonAction()
    {
        loginButton.click();

    }
    public static void checkLoginVerification()
    {
        Assert.assertNotNull(driver.findElement(By.id("react-burger-menu-btn")));
    }
    public static void addinFirstItemAction()
    {
        itemOne.click();
    }
    public static void addSeconItemAction()
    {
        itemtwo.click();
    }
    public static void selectChartAction()
    {
        chart.click();
    }
    public static void checkItemsInChartAction()
    {
        verifyItemOne.isDisplayed();
        verifyItemTwo.isDisplayed();
    }
    public static void selectBusketAction()
    {
        basketItems.click();
    }
    public static void verifyAllItem()
    {

        basketItem1.isDisplayed();
        basketItem2.isDisplayed();
    }
    public static void setCheckoutButton()
    {
        checkoutButton.click();
    }
    public static void checkOutInforAction(String Name, String Lname, String Pname)
    {
        firstName.sendKeys(Name);
        lastName.sendKeys(Lname);
        post.sendKeys(Pname);
    }

    public static void continueAction()
    {
        contiueButton.click();
    }




}
