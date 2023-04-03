/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumfacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Mitrovski
 */
public class MySelenium {
    //attributes
    private String website_URL="https://www.facebook.com";
    private String driver_location = "C:\\Python27\\Scripts\\chromedriver.exe";
    private String driver_type = "webdriver.chrome.driver";
    WebDriver driver;
    //construct
    public MySelenium(){
    System.setProperty(this.driver_type, this.driver_location); 
    this.driver=new ChromeDriver();  
      
    // Launch website  
    this.driver.navigate().to(this.website_URL);  
    //Pause
    try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}    
        
    }
    //methods
    public void InputFieldByName (String Selector, String str){
      this.driver.findElement(By.name(Selector)).sendKeys(str);    
      }
    
    public void InputFieldById (String Selector, String str){
      this.driver.findElement(By.id(Selector)).sendKeys(str);    
      }

    public void InputFieldByXpath (String Selector, String str){
      this.driver.findElement(By.xpath(Selector)).sendKeys(str);    
      }
   
    public void buttonByXpath(String selector){
      this.driver.findElement(By.xpath(selector)).click();
	}
    
    public void buttonById(String selector){
      this.driver.findElement(By.id(selector)).click();
	}
    
    
    public void buttonByNme(String selector){
      this.driver.findElement(By.name(selector)).click();
	}



  





}
    

