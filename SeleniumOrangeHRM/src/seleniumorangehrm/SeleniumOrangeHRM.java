/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniumorangehrm;

/**
 *
 * @author Mitrovski
 */
public class SeleniumOrangeHRM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instance MySelenium
        //MySelenium qaHRM = new MySelenium ();
        //Login From
        //qaHRM.InputFieldByName("username","Admin" );
        //qaHRM.InputFieldByName("password", "admin123");
        
 
        // declaration and instantiation of objects/variables  
    //System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe"); 
        //WebDriver driver=new ChromeDriver();  
      
        // Launch website  
    //driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
        //Pause
    //try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}    
        // Click on the search text box and send value  
    //driver.findElement(By.name("username")).sendKeys("Admin");  
    //driver.findElement (By.name("password")).sendKeys("admin123");     
        // Click on the search button  
    //driver.findElement(By.xpath("html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();  
    //

    SeleniumOrangeHRMTest qaOrangeHRM=new SeleniumOrangeHRMTest();
        //Login form
        //qaOrangeHRM.TC_loginwithoutUsername();
        //qaOrangeHRM.TC_loginwithoutPassword();
        qaOrangeHRM.TC_login();
        qaOrangeHRM.AdminMenu();
        //qaOrangeHRM.Menu();
        
        
        
        
    }
    
}
