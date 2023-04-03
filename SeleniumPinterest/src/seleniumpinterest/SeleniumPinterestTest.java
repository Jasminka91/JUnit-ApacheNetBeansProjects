/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumpinterest;

/**
 *
 * @author Mitrovski
 */
public class SeleniumPinterestTest extends MySelenium {
    //class attributes
    //construct
    //TC_login
    
    public void TC_login(){
          super.InputFieldById("email", "tanevskajasmina@yahoo.com");
          super.InputFieldById("password", "jasmina123");
          super.buttonByXpath("//button[@type='submit']//div[@class='zI7 iyn Hsu'][normalize-space()='Log in']");
          }
   
    public void TC_withoutPassword(){
          super.InputFieldById("email", "tanevskajasmina@yahoo.com");
          super.buttonByXpath("//button[@type='submit']//div[@class='zI7 iyn Hsu'][normalize-space()='Log in']");
    }
    
    public void TC_withoutUsername(){
          super.InputFieldById("password", "jasmina123");
          super.buttonByXpath("//button[@type='submit']//div[@class='zI7 iyn Hsu'][normalize-space()='Log in']");
    
    
    }
    
    
    
    
}
