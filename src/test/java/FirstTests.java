import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FirstTests {

    WebDriver driver; //utworzenie pustego pola driver, aby bylo dostepne we wszystkich metodach
    WebDriverWait wait;

    public void highlightElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js. executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
    @Before//warunki poczatkowe
    public void setup(){
        System.setProperty("webdriver.chrome.driver","c:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver(); //otworzy nam przegladarke
        System.out.println("wykonuje sie przed test");
        wait = new WebDriverWait(driver, 10);

    }
    @Test //kroki testowe - po prostu test
    public void firstTest(){
        driver.get("https://dev.to"); //przejdź na stronę dev.to
        WebElement sideBarVideo = driver.findElement(By.xpath("/html/body/div[9]/div/div/div[1]/aside/nav[1]/div/a[3]")); //znajdz element week
        highlightElement(sideBarVideo);
        //sideBarVideo.click(); //klikamy w weekBtn
                //weekBtn.click();
    }
    @Test
    public void openFirstVideoPage(){
        driver.get("https://dev.to");
        WebElement sideBarVideo = driver.findElement(By.partialLinkText("Videos"));
        highlightElement(sideBarVideo);
        sideBarVideo.click();

        wait.until(ExpectedConditions.urlToBe("https://dev.to/videos"));

        WebElement firstVideo = driver.findElement(By.className("video-image"));
        highlightElement(firstVideo);
        firstVideo.click();
    }

    @Test
    public void highlightFirstVideo(){
        driver.get("https://dev.to/videos");
        WebElement firstVideo = driver.findElement(By.className("video-image"));
        highlightElement(firstVideo);
        firstVideo.click();
    }
    //wesc na devv.to
    //kliknac podcast
    //wybrac peirwszy podcast - pobrac nazwe
    //sprawdzic czy jesztem na odpowiedniej stronie
    //sprawdzic czy moge kliknac play

    @Test
    public void selectFirstPodcast(){
        driver.get("https://dev.to");
        WebElement podcasts = driver.findElement(By.partialLinkText("Podcasts"));
        podcasts.click();
        wait.until(ExpectedConditions.urlToBe("https://dev.to/pod"));

        WebElement firstPodcast = driver.findElement(By.cssSelector(".content > h3:first-child"));
        String podcastTitleFromList = firstPodcast.getText();

        String firstPodcastFromListLink = driver.findElement(By.cssSelector("#substories > a:first-child")).getAttribute("href");

        firstPodcast.click();
        wait.until(ExpectedConditions.urlToBe(firstPodcastFromListLink));
        WebElement podcastTitle = driver.findElement(By.cssSelector(".title >h1:nth-child(2)"));
        String podcastTitleText = podcastTitle.getText();
        assertTrue(podcastTitleFromList.contains(podcastTitleText));

        WebElement record = driver.findElement(By.className("record"));
        record.click();
        WebElement initializing = driver.findElement(By.className("status-message"));
        wait.until(ExpectedConditions.invisibilityOf(initializing));

        WebElement recordWrapper = driver.findElement(By.className("record-wrapper"));
        String classAttribute = recordWrapper.getAttribute("class");
        Boolean isPodcastPlayed = classAttribute.contains("playing");

        assertTrue(isPodcastPlayed);
        //znajdz record
        //kliknij record
    }
    @Test
    public void wyszukiwanieTesting(){
        driver.get("https://dev.to");
        WebElement wyszukiwarka = driver.findElement(By.name("q"));
        highlightElement(wyszukiwarka);
        wyszukiwarka.click();
        wyszukiwarka.sendKeys("testing" );
        wyszukiwarka.sendKeys(Keys.ENTER);
        //WebElement firstResult = new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));//        Na stronie dev.to:

//        1. Wyszukaj w search barze text : testing
//        2. Naciśnij enter
//        3. Poczekaj na stronę - wait tym razem będzie troche inny niż urlToBe
//        4. Sprawdź czy pierwszy element na stronie zawiera słowo testing w nazwie ;)
    }


//    @Test
//    public void secondTest(){
//        System.out.println("drugi test");
//    }

//    @After//czynnosci zamykajace testy

//    public void tearDown(){
//        driver.quit();
//        System.out.println("po kazdej metodzie testowej");
//
//    }

}
