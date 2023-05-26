package ExerciceSelenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.time.Duration;
import java.util.List;


public class TestSelenium {
    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ALEGNE\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //1. Se rendre sur https://hightest.nc/
        driver.get("https://hightest.nc/");

        //1.a Cliquer sur le toogle
        WebElement toggleclass = driver.findElement(By.className("navbar-toggler-icon"));
        toggleclass.click();

        //2. Cliquer sur "Toolbox"
        driver.get("https://hightest.nc/toolbox/");

        //3. Cliquer sur le lien vers le quiz ISTQB Fondation en français
        driver.get("https://hightest.nc/ressources/test-istqb.php");

        //Temps d'attente
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //4. Réaliser le test en cliquant sur les bonnes réponses
        WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @name='0' and @value='1']"));
        wait.until(ExpectedConditions.visibilityOf(radioButton));
        radioButton.click();

        WebElement radioButton2 = driver.findElement(By.xpath("//input[@type='radio' and @name='1' and @value='2']"));
        radioButton2.click();

        WebElement radioButton3 = driver.findElement(By.xpath("//input[@type='radio' and @name='2' and @value='1']"));
        //Scroller la page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", radioButton3);
        //cliquez sur le bouton radio
        radioButton3.click();

        WebElement radioButton4 = driver.findElement(By.xpath("//input[@type='radio' and @name='3' and @value='2']"));
        //Scroller la page
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("arguments[0].scrollIntoView(true);", radioButton4);
        //cliquez sur le bouton radio
        radioButton4.click();

        WebElement radioButton5 = driver.findElement(By.xpath("//input[@type='radio' and @name='4' and @value='2']"));
        //Scroller la page
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("arguments[0].scrollIntoView(true);", radioButton5);
        //cliquez sur le bouton radio
        radioButton5.click();

        WebElement radioButton6 = driver.findElement(By.xpath("//input[@type='radio' and @name='5' and @value='3']"));
        //Scroller la page
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("arguments[0].scrollIntoView(true);", radioButton6);
        //cliquez sur le bouton radio
        radioButton6.click();

        WebElement radioButton7 = driver.findElement(By.xpath("//input[@type='radio' and @name='6' and @value='2']"));
        //Scroller la page
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("arguments[0].scrollIntoView(true);", radioButton7);
        //cliquez sur le bouton radio
        radioButton7.click();

        WebElement radioButton8 = driver.findElement(By.xpath("//input[@type='radio' and @name='7' and @value='4']"));
        //Scroller la page
        JavascriptExecutor js5 = (JavascriptExecutor) driver;
        js5.executeScript("arguments[0].scrollIntoView(true);", radioButton8);
        //cliquez sur le bouton radio
        radioButton8.click();

        WebElement radioButton9 = driver.findElement(By.xpath("//input[@type='radio' and @name='8' and @value='1']"));
        //Scroller la page
        JavascriptExecutor js6 = (JavascriptExecutor) driver;
        js6.executeScript("arguments[0].scrollIntoView(true);", radioButton9);
        //cliquez sur le bouton radio
        radioButton9.click();

        WebElement radioButton10 = driver.findElement(By.xpath("//input[@type='radio' and @name='9' and @value='3']"));
        //Scroller la page
        JavascriptExecutor js7 = (JavascriptExecutor) driver;
        js7.executeScript("arguments[0].scrollIntoView(true);", radioButton10);
        //cliquez sur le bouton radio
        radioButton10.click();

        WebElement radioButton11 = driver.findElement(By.xpath("//input[@type='radio' and @name='10' and @value='4']"));
        //Scroller la page
        JavascriptExecutor js8 = (JavascriptExecutor) driver;
        js8.executeScript("arguments[0].scrollIntoView(true);", radioButton11);
        //cliquez sur le bouton radio
        radioButton11.click();

        WebElement radioButton12 = driver.findElement(By.xpath("//input[@type='radio' and @name='11' and @value='2']"));
        //Scroller la page
        JavascriptExecutor js9 = (JavascriptExecutor) driver;
        js9.executeScript("arguments[0].scrollIntoView(true);", radioButton12);
        //cliquez sur le bouton radio
        radioButton12.click();

        WebElement radioButton13 = driver.findElement(By.xpath("//input[@type='radio' and @name='12' and @value='3']"));
        //Scroller la page
        JavascriptExecutor js10 = (JavascriptExecutor) driver;
        js10.executeScript("arguments[0].scrollIntoView(true);", radioButton13);
        //cliquez sur le bouton radio
        radioButton13.click();

        WebElement radioButton14 = driver.findElement(By.xpath("//input[@type='radio' and @name='13' and @value='2']"));
        //Scroller la page
        JavascriptExecutor js11 = (JavascriptExecutor) driver;
        js11.executeScript("arguments[0].scrollIntoView(true);", radioButton14);
        //cliquez sur le bouton radio
        radioButton14.click();

        WebElement radioButton15 = driver.findElement(By.xpath("//input[@type='radio' and @name='14' and @value='4']"));
        //Scroller la page
        JavascriptExecutor js12 = (JavascriptExecutor) driver;
        js12.executeScript("arguments[0].scrollIntoView(true);", radioButton15);
        //cliquez sur le bouton radio
        radioButton15.click();

        WebElement radioButton16 = driver.findElement(By.xpath("//input[@type='radio' and @name='15' and @value='3']"));
        //Scroller la page
        JavascriptExecutor js13 = (JavascriptExecutor) driver;
        js13.executeScript("arguments[0].scrollIntoView(true);", radioButton16);
        //cliquez sur le bouton radio
        radioButton16.click();

        WebElement radioButton17 = driver.findElement(By.xpath("//input[@type='radio' and @name='16' and @value='3']"));
        //Scroller la page
        JavascriptExecutor js14 = (JavascriptExecutor) driver;
        js14.executeScript("arguments[0].scrollIntoView(true);", radioButton17);
        //cliquez sur le bouton radio
        radioButton17.click();

        WebElement radioButton18 = driver.findElement(By.xpath("//input[@type='radio' and @name='17' and @value='1']"));
        //Scroller la page
        JavascriptExecutor js15 = (JavascriptExecutor) driver;
        js15.executeScript("arguments[0].scrollIntoView(true);", radioButton18);
        //cliquez sur le bouton radio
        radioButton18.click();

        WebElement radioButton19 = driver.findElement(By.xpath("//input[@type='radio' and @name='18' and @value='2']"));
        //Scroller la page
        JavascriptExecutor js16 = (JavascriptExecutor) driver;
        js16.executeScript("arguments[0].scrollIntoView(true);", radioButton19);
        //cliquez sur le bouton radio
        radioButton19.click();

        WebElement radioButton20 = driver.findElement(By.xpath("//input[@type='radio' and @name='19' and @value='2']"));
        //Scroller la page
        JavascriptExecutor js17 = (JavascriptExecutor) driver;
        js17.executeScript("arguments[0].scrollIntoView(true);", radioButton20);
        //cliquez sur le bouton radio
        radioButton20.click();

        //5.Valider le test
        WebElement terminer = driver.findElement(By.xpath("//input[@id='submit']"));
        terminer.click();

        //6.entrer adresse mail yopmail.com
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("clarelleelien@yopmail.com");

        //8.Valider le formulaire
        WebElement OK = driver.findElement(By.xpath("//input[@id='submitMail']"));
        OK.click();

        //9.Consulter le mail de l'adresse saisie
        driver.get("https://yopmail.com/fr/");

        //10.Vérifier que le mail reçu indique bien 100% de bonnes réponses
        WebElement login = driver.findElement(By.id("login"));
        login.sendKeys("clarelleelien@yopmail.com");
        //cliquer entrer sur le clavier
        login.sendKeys(Keys.ENTER);
    }
}