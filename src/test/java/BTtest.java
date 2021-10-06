import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BTtest {

    public static WebDriver driver;

@Before
    public void setupClass(){

    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();

}

@Test
    public void myTest(){

    driver.get("https://voleer.com");
    WebElement button = driver.findElement(By.xpath("//*[text()='Get started with Voleer']"));
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",button);
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    WebElement button2 = driver.findElement(By.xpath("//*[@id='migration-discovery-solution-button']"));
    js.executeScript("arguments[0].click();",button2);
    driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Sabri");
    driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Sabri");
    driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("sabrisabri@hotmail.com");
    WebElement dropdown = driver.findElement(By.xpath("//*[@id='Country']"));
    Select myDropDown = new Select(dropdown);
    myDropDown.selectByVisibleText("United States");
    WebElement dropdown2 = driver.findElement(By.xpath("//*[@id='State']"));
    Select myDropDown2 = new Select(dropdown2);
    myDropDown2.selectByVisibleText("Virginia");
    driver.findElement(By.xpath("//*[@id='Phone']")).sendKeys("1234561516");
    driver.findElement(By.xpath("//*[@id='Title']")).sendKeys("Customer");
    //driver.findElement(By.xpath("//*[@class='mktoButton']")).click();
    // I did not complete the task till the end because did not want to send an inquiry with invalid data to your sales team.
    // So submit button is disabled. Assume that I send the inquiry. After that I would validate the success message
    // By using Junit assertion. After that task will be completed.













}




}

