//package step_definition;
//
//import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//public class datatableRegsitration {
//    WebDriver driver;
//
//    @Given("^User is already on Registration page$")
//    public void User_is_already_on_Registration_page()
//    {
//        System.setProperty("webdriver.chrome.driver","E:\\Automation\\Drivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://demo.guru99.com/test/newtours/register.php");
//
//    }
//
//    @When("^user enters firstname and lastname$")
//    public void user_enters_firstname_and_lastname(DataTable date1) {
//        List<List<String>> listsData = date1.asLists(String.class);
//        driver.findElement(By.name("firstName")).sendKeys(listsData.get(0).get(0));
//        driver.findElement(By.name("lastName")).sendKeys(listsData.get(0).get(1));
//    }
//
//    @Then("^user enters username password and confirmPassword$")
//    public void user_enters_username_password_and_confirmPassword(DataTable data2) {
//        List<List<String>> listsData2 = data2.asLists(String.class);
//        driver.findElement(By.id("email")).sendKeys(listsData2.get(0).get(0));
//        driver.findElement(By.name("password")).sendKeys(listsData2.get(0).get(1));
//        driver.findElement(By.name("confirmPassword")).sendKeys(listsData2.get(0).get(2));
//
//    }
//
//    @And("user click on submit button")
//    public void user_click_on_submit_button() {
//        driver.findElement(By.name("submit")).click();
//    }
//
//
//    @Then("^close the browser$")
//    public void close_the_browser() {
//        driver.quit();
//    }
//}
