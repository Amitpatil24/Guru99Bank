//package step_definition;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//import java.util.concurrent.TimeUnit;
//
//public class Steps_login {
//   WebDriver driver;
//
//    @Given("^User is already on login page$")
//    public void user_already_on_login_page()
//    {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("https://www.demo.guru99.com/V4/");
//
//    }
//    @When("^title of login page is Guru99 Bank Home Page$")
//    public void title_of_login_page_is_guru99_bank_home_page() {
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("Guru99 Bank Home Page",title);
//    }
//
//    @Then("^user enters username and password$")
//    public void user_enters_username_and_password() {
//        driver.findElement(By.name("uid")).sendKeys("mngr480097");
//        driver.findElement(By.name("password")).sendKeys("tapasYs");
//    }
//
//    @Then("^user clicks on login page$")
//    public void user_clicks_on_login_page() {
//        driver.findElement(By.name("btnLogin")).click();
//    }
//
//    @Then("^user is on Home Page$")
//    public void user_is_on_home_page() {
//        String title = driver.getTitle();
//        System.out.println(title);
//        Assert.assertEquals("Guru99 Bank Manager HomePage",title);
//    }
//
//    @Then("^close the browser$")
//    public void close_the_browser() {
//        driver.quit();
//    }
//
//}
//
//
//
////// mngr480097
////// tapasYs
