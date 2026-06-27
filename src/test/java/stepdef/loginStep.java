package stepdef;

import com.saucedemo.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BaseTest;



public class loginStep {

    @Given("the user has open the browser and capture the test url")
    public void the_user_has_open_the_browser_and_capture_the_test_url() {
        BaseTest.StartBrowser();

    }

    @When("user capture {string}")
    public void user_capture(String string) {
        loginPage.loginUserActions(string);
        loginPage.loginPasswordAction(string);
    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        loginPage.loginButtonAction();

    }
    @Then("the user login successfully")
    public void the_user_login_successfully() {
        loginPage.checkLoginVerification();

    }

    @Given("user has login successfully with the correct credentials")
    public void user_has_login_successfully_with_the_correct_credentials() {
        loginPage.checkLoginVerification();


    }
    @Given("user select first item to add in the Cart")
    public void user_select_first_item_to_add_in_the_cart() {
        loginPage.addinFirstItemAction();

    }
    @Given("user select second item to add in the Card")
    public void user_select_second_item_to_add_in_the_card() {
        loginPage.addSeconItemAction();

    }
    @When("the user select the Cart")
    public void the_user_select_the_cart() {
        loginPage.selectChartAction();

    }
    @Then("two item are in the Cart")
    public void two_item_are_in_the_cart() {
        loginPage.checkItemsInChartAction();

    }

    @Given("the user is has added two item on Cart")
    public void the_user_is_has_added_two_item_on_cart() {
        loginPage.checkItemsInChartAction();

    }
    @When("user select the basket")
    public void user_select_the_basket() {
        loginPage.selectBusketAction();

    }
    @Then("user verify the two item in the Cart")
    public void user_verify_the_two_item_in_the_cart() {
        loginPage.verifyAllItem();

    }

    @Given("user has proccess all the check out details")
    public void user_has_proccess_all_the_check_out_details() {
        loginPage.setCheckoutButton();

    }

    @Given("user try to proccess the Check out")
    public void user_try_to_proccess_the_check_out() {

    }
    @When("Add checkout information name {string} , Surname {string} and PostalCode {string}")
    public void add_checkout_information_name_surname_and_postal_code(String string, String string2, String string3) {
       loginPage.checkOutInforAction(string,string2,string3);
    }
    @Then("check proccess is successfully")
    public void check_proccess_is_successfully() {
        loginPage.continueAction();

    }



    @When("user click on Finish")
    public void user_click_on_finish() {

    }
    @Then("user place the order successfully and verify it")
    public void user_place_the_order_successfully_and_verify_it() {

    }

    @Given("user is done with the check out")
    public void user_is_done_with_the_check_out() {

    }
    @When("user click logout button")
    public void user_click_logout_button() {

    }
    @Then("user is abler to logout successfully")
    public void user_is_abler_to_logout_successfully() {

    }

    @Given("the user has added items on the cart")
    public void the_user_has_added_items_on_the_cart() {

    }


}
