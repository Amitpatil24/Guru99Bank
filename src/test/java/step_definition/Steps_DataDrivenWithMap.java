package step_definition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Steps_DataDrivenWithMap {
    WebDriver driver;

    @Given("^User is already on Registration page$")
    public void User_is_already_on_Registration_page()
    {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }

    @Then("^user enters users details for Registration$")
    public void user_enters_users_details_for_Registration(DataTable data2) {

        for(Map<String,String> mapData2 : data2.asMaps(String.class,String.class)){        // use for each map

        driver.findElement(By.name("firstName")).sendKeys(mapData2.get("Firstname"));
        driver.findElement(By.name("lastName")).sendKeys(mapData2.get("Lastname"));
        driver.findElement(By.id("email")).sendKeys(mapData2.get("User Name"));
        driver.findElement(By.name("password")).sendKeys(mapData2.get("Password"));
        driver.findElement(By.name("confirmPassword")).sendKeys(mapData2.get("Confirm Password"));
        driver.findElement(By.name("submit")).click();
        driver.findElement(By.linkText("REGISTER")).click();
    }
    }

    @Then("^close the browser$")
    public void close_the_browser() {
        driver.quit();
    }
}
