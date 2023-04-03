/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumvezbi;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Mitrovski
 */
public class Vezbi3 {
    public static void main(String[] args) throws InterruptedException{
     //Open the chrome browser
     System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
    
     //max the chrome browser
     driver.manage().window().maximize();
     
     //navigate to the url
     driver.get("https://www.google.com/");
     
     //By TagName
     List<WebElement> link= driver.findElements(By.tagName("a"));
     System.out.println(link.size());
    
     //name of links
     for (WebElement l: link){
     
         System.out.println(l.getText());
     
     }
    }
}