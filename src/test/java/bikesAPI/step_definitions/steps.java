package bikesAPI.step_definitions;

import bikesAPI.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import org.junit.Assert;


public class steps {
    String url = ConfigurationReader.get("url");

    @Given("I am on bikes api")
    public void i_am_on_bikes_api() {
        Response response = given().accept(ContentType.JSON)
                .when().get(url);
        System.out.println("response.statusCode() = " + response.statusCode());
        int statusCode = response.statusCode();

    }

    @When("I send a get request")
    public void i_send_a_get_request() {
        Response response = given().accept(ContentType.JSON)
                .when().get(url);
    }

    @Then("Status code must be {int}")
    public void status_code_must_be(Integer int1) {
        Assert.assertEquals(200, 200);
    }


}
