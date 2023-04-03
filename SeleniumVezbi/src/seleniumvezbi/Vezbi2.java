/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumvezbi;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Mitrovski
 */
public class Vezbi2 {
    public static void main(String[] args) throws InterruptedException{
     //Open the chrome browser
     System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
    
     //max the chrome browser
     driver.manage().window().maximize();
     
     //navigate to the url
     driver.get("https://magento.softwaretestingboard.com/");
     
     //by id
     driver.findElement(By.id("search")).sendKeys("Tops");
     
     //pause
     Thread.sleep(5000);
     
     //by linktext
     driver.findElement(By.linkText("Argus All-Weather Tank")).click();
     
     
    
    }
    
}
