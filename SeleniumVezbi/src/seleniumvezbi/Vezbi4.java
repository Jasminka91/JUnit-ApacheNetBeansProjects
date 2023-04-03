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
public class Vezbi4 {
    public static void main(String args[]){
    System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
     //max the chrome browser
     driver.manage().window().maximize();
     
     driver.get("https://www.ebay.com/");
     
     driver.manage().window().maximize();
     
     //absolute xpath
     //driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[1]/div[1]/div/input[1]")).sendKeys("T-Shirts");
     //driver.findElement(By.xpath("/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[3]/input")).click();
    
     //relative xpath
     driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("T-Shirts");
     driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
     
     
     //text
     //driver.findElement(By.xpath("//a[tex[text()=' Sell']")).click();
    }
}
