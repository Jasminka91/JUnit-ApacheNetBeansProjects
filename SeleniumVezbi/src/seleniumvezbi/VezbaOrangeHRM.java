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
public class VezbaOrangeHRM {
    public static void main(String[] args) throws InterruptedException{
     //Open the chrome browser
     System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
    
     //max the chrome browser
     driver.manage().window().maximize();
     
     //navigate to the url
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
     //Pause
     Thread.sleep(5000);
     
     driver.findElement(By.name("username")).sendKeys("Admin");
     driver.findElement(By.name("password")).sendKeys("admin123");
     driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
     
     
     //verify the URL
     //getCurrentURL
     String act_Url=driver.getCurrentUrl();
     System.out.println(act_Url);
     
     //verify
     String desired_URL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
     if (act_Url.equals(desired_URL))
     {
         System.out.println("pass");
     }
     else {
         System.out.println("fail");
     }
     
     
     //verify title
     //get title()
     String act_title=driver.getTitle();
     System.out.println("act_title");
     String desired_title="OrangeHRM";
     if (act_title.equals(desired_title)){
         System.out.println("pass");
     } else {
         System.out.println("fail");
     }
     
     //close
     driver.close();
     
}
}