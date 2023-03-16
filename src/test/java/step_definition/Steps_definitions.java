//package step_definition;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.util.concurrent.TimeUnit;
//
//public class Steps_definitions {
//    WebDriver driver;
//
//    @Given("^User is already on login page$")
//    public void user_already_on_login_page  ()
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
//    @Then("^user enters \"(.*)\" and \"(.*)\"$")
//    public void user_enters_username_and_password(String username, String password) {
//        driver.findElement(By.name("uid")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(password);
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
//   @And("^user click on Log Out$")
//    public void user_click_on_sign_off()
//    {
//        driver.findElement(By.xpath("//a[text()='Log out']")).click();
//        driver.switchTo().alert().dismiss();
//    }
//
//    @Then("^user click on New Tours page$")
//    public void user_click_on_New_Tours_page() {
//        driver.findElement(By.linkText("New Tours")).click();
//
//    }
//
//    @And("^user click on Register button$")
//    public void user_click_on_Register_button()
//    {
//        driver.findElement(By.xpath("//a[@href='register.php']")).click();
//    }
//
//    @Then("^user enters registration details \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//    public void user_enters_registration_details(String name, String lastname, String num, String city, String username, String pwd,String cpwd) {
//        driver.findElement(By.name("firstName")).sendKeys(name);
//        driver.findElement(By.name("lastName")).sendKeys(lastname);
//        driver.findElement(By.name("phone")).sendKeys(num);
//        driver.findElement(By.name("city")).sendKeys(city);
//        driver.findElement(By.id("email")).sendKeys(username);
//        driver.findElement(By.name("password")).sendKeys(pwd);
//        driver.findElement(By.name("confirmPassword")).sendKeys(cpwd);
//        driver.findElement(By.name("submit")).click();
//
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
//// mngr480097
//// tapasYs
