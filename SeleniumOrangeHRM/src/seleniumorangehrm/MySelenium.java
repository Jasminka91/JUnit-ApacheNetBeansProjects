/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumorangehrm;

import java.nio.channels.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Mitrovski
 */
public class MySelenium {
    //attributes
    private String website_URL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    private String driver_location = "C:\\Python27\\Scripts\\chromedriver.exe";
    private String driver_type = "webdriver.chrome.driver";
    WebDriver driver;
    //construct
    public MySelenium(){
    System.setProperty(this.driver_type, this.driver_location); 
    this.driver=new ChromeDriver();
    // Launch website  
    driver.navigate().to(this.website_URL);  
    //Pause
    try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}    
        
    }
    //methods
    
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
    
    
    public void buttonByName(String selector){
      this.driver.findElement(By.name(selector)).click();
	}

    public void InputFieldByName (String Selector, String str){
    this.driver.findElement(By.name(Selector)).sendKeys(str);    
      }


    public void buttonclickbylink(String str){
       this.driver.findElement(By.linkText (str)).click();
    
    }  
    
    
    
    
    public void selectDropDownByIndex( String selector, int index){
       WebElement testDropDown = this.driver.findElement(By.xpath("selector"));  
       Select dropdown = new Select(testDropDown);  
       dropdown.selectByIndex (index);
    }
    
    public void selectDropDownByValue( String selector, String value){
       WebElement testDropDown = this.driver.findElement(By.xpath("selector"));  
       Select dropdown = new Select(testDropDown);  
       dropdown.selectByValue(value);
    
    }

    public void selectDropDownByVisibleText( String selector, String str){
       WebElement testDropDown = this.driver.findElement(By.xpath("selector"));  
       Select dropdown = new Select(testDropDown);  
       dropdown.selectByVisibleText(str);
    
    }

    public void ClassName (String str){
    this.driver.findElement(By.className(str)).click();
    
    
    }

    public void Tagname (String str){
    this.driver.findElement(By.tagName(str)).click();
    
    
    }

    public void CloseBrowser (){
    this.driver.close();
    }   

    public void MaxzimizeBrowser (){
    this.driver.manage().window().maximize();
    
 }

 

}   
    
    
    
    
    
    




