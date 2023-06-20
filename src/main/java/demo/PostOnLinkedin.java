package demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class PostOnLinkedin {
    ChromeDriver driver;
    public PostOnLinkedin()
    {
        System.out.println("Constructor: PostOnLinkedin");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        driver.close();
        driver.quit();

    }

    
    public  void post() throws InterruptedException{
        System.out.println("Start Test case: PostOnLinkedin");
        // Navigate to URL  https://in.linkedin.com/
        driver.get("https://in.linkedin.com/");

        // Locate Email or phone feild Using Locator "ID" id="session_key"
        WebElement emailFeild = driver.findElement(By.id("session_key"));

        // send keys on Email "anchalsingh2914@gmail.com" Using Locator "ID" 
        emailFeild.sendKeys("anchalsingh2914@gmail.com");

        // Locate password feild Using Locator "ID" id="session_password"
        WebElement passFeild = driver.findElement(By.id("session_password"));

        // send keys on password "anchalsingh1234" Using Locator "ID" 
        passFeild.sendKeys("Noida@1601#");

        // Locate Sign in button Using Locator "XPath" //button[@type="submit"]
        WebElement signInBtn = driver.findElement(By.xpath("//button[@type='submit']"));

        // click sign in button Using Locator "XPath" //button[@type="submit"].click()
        signInBtn.click();
        Thread.sleep(2000);

        // Locate who viewed your profile count Using Locator "XPath" //*[@href='/me/profile-views/']/div/div[2]/span/strong
        WebElement profileViews = driver.findElement(By.xpath("//*[@href='/me/profile-views/']/div/div[2]/span/strong"));
        Thread.sleep(2000);

        // print the count of profile views in console  
        System.out.println("Who's viewed your profile: " + profileViews.getText());

        // Locate Impressions on your post Using Locator "XPath" //*[@href='/in/anchal-singh-1a48b713b/recent-activity/shares/']/div/div[2]/span/strong
        WebElement impressionCount = driver.findElement(By.xpath("//*[@href='/in/anchal-singh-1a48b713b/recent-activity/shares/']/div/div[2]/span/strong"));
        Thread.sleep(2000);

        // Print the count of Impressions in console  
        System.out.println("Impressions of your post: " + impressionCount.getText());

        // Locate start a post feild Using Locator "xpath" xpath="//div[@class="share-box-feed-entry__top-bar"]/button"
        WebElement postFeild = driver.findElement(By.xpath("//div[@class='share-box-feed-entry__top-bar']/button"));
        postFeild.click();
        Thread.sleep(2000);

        WebElement postArea = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));

        // send keys on start a post "Everything has beauty, but not everyone can see." Using Locator "xpath" 
        postArea.sendKeys("Everything has beauty, but not everyone can see.");
        Thread.sleep(2000);

        // Locate whom to share  Using Locator "Classname" classname="share-unified-settings-entry-button"
        WebElement shareWith = driver.findElement(By.className("share-unified-settings-entry-button"));

        // click whom to share Using Locator "Classname" className="share-unified-settings-entry-button".click()
        shareWith.click();
        Thread.sleep(2000);

        // Locate Connection only radio button Using Locator "xpath" xpath="//div[@role="radiogroup"]/div[2]/button"
        WebElement radioBtn = driver.findElement(By.xpath("//div[@role='radiogroup']/div[2]/button"));

        // click Connection only radio button Using Locator "ID" id="CONNECTIONS_ONLY".click()
        radioBtn.click();
        Thread.sleep(2000);

        // Locate Done button Using Locator "xpath" xpath="//div[@class="share-box-footer__main-actions"]/button[2]"
        WebElement doneBtn = driver.findElement(By.xpath("//div[@class='share-box-footer__main-actions']/button[2]"));

        // click Done button Using Locator "xpath" xpath="//div[@class="share-box-footer__main-actions"]/button[2]".click()
        doneBtn.click();
        Thread.sleep(2000);

        // Locate Post button Using Locator "xpath" xpath="//div[@class="share-box_actions"]/button"
        WebElement postBtn = driver.findElement(By.xpath("//div[@class='share-box_actions']/button"));

        // click Post button Using Locator "xpath" xpath="//div[@class="share-box_actions"]/button".click()
        postBtn.click();
        Thread.sleep(2000);

        // Locate profile Using Locator "xpath" xpath="//a[@class="ember-view block"]/div/img"
        WebElement profileEle = driver.findElement(By.xpath("//a[@class='ember-view block']/div/img"));

        // click profile Using Locator "xpath" xpath="//a[@class="ember-view block"]/div/img".click()
        profileEle.click();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);

        // Locate new post  Using Locator "XPath" xpath//span[contains(text(),'Everything has beauty')]
        WebElement newPost = driver.findElement(By.xpath("//span[contains(text(),'Everything has beauty')]"));
        System.out.println("New post located: " + newPost.getText());

        System.out.println("End Test case: PostOnLinkedin");
    }


}
