package action_item;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class AI4_ChromeOptions {
    public static void main(String[] args) throws InterruptedException {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //set chrome options arguments
        ChromeOptions options = new ChromeOptions();
        //set the condition to incognito mode
        options.addArguments("incognito");
        //set the condition to maximize/fullscreen your driver
        options.addArguments("start-maximized");
        //setting your driver as headless (running on background)
        //options.addArguments ("headless") ;
        //for mac use full screen
        options.addArguments("start-fullscreen");
        //define the webdriver I am going to use
        WebDriver driver = new ChromeDriver(options);

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("77062");
        zipCode.add("77099");
        zipCode.add("77089");



        for(int i = 0; i < zipCode.size(); i++) {

            //navigate to weight watchers
            driver.navigate().to("https://www.weightwatchers.com");
            Thread.sleep(3000);


            //click on attend
            //we are clicking on index 0 because there are two xpath
            driver.findElements(By.xpath("//*[text(),Attend')]")).get(0).click();
            Thread.sleep(1000);

            //click on Unlimited Workshops
            driver.findElements(By.xpath("//*[text(),Virtual or In-person Workshops')]")).get(0).click();
            Thread.sleep(1000);

            //click on Studio
            driver.findElements(By.xpath("//*[text(),Studio')]")).get(0).click();
            Thread.sleep(1000);

            


//handle exception for Attend dropdown
            try {
                WebElement dropDown = driver.findElement(By.xpath("//*[@id='li.listItem-2dwol']"));
                dropDown.clear();
                dropDown.sendKeys("450000");
            } catch (Exception e) {
                //print out the exception
                System.out.println("Click on the Attend drop down " + e);
            }//end of attend dropdown

//handle exception for click on unlimited workshop
            try {
                driver.findElement(By.xpath("//*[text()='Unlimited Workshops']")).click();
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Show Advance Options button " + e);
            }//end of Show advanced options exception

//handle exception for start month drop down
            try {
                WebElement startMonth = driver.findElement(By.xpath("//*[@name='sm']"));
                Select dropdown = new Select(startMonth);
                dropdown.selectByVisibleText(zipCode.get(i));
            } catch (Exception e) {
                //print out the exception
                System.out.println("Unable to locate Start Month dropdown " + e);
            }//end of start month exception



        }//end of the loop
        //quit the driver

    }//end of main method
}//end of java class

