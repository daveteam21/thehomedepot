package stepdefination;

import Utils.BrowserHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class AddToCartDefinations {

	@Given("HomeDepot Homepage")
	public void home_depot_homepage() {

	}

	@When("Search for wipe")
	public void search_for_wipe() {
		SearchPage searchpage = new SearchPage();
		searchpage.searchInput.sendKeys("Clorox Wipes");
		searchpage.searchbtn.click();
	}

	@When("Select Clorox wipe")
	public void select_clorox_wipe() {
		SearchPage searchpage = new SearchPage();
		searchpage.clickimageproduct.click();
	}

	@When("Select Store Pickup")
	public void select_store_pickup() {
		SearchPage searchpage = new SearchPage();
		searchpage.clickpickupbtn.click();

	}

	@Then("Add to Cart")
	public void add_to_cart() {
		SearchPage searchpage = new SearchPage();
		searchpage.addtocartbtn.click();
	}

	@Then("click view cart")
	public void click_view_cart() {
		SearchPage searchpage = new SearchPage();
		BrowserHelper.driver.switchTo().frame(searchpage.iframe);
		searchpage.clickveiwcartbtn.click();

	}
}
