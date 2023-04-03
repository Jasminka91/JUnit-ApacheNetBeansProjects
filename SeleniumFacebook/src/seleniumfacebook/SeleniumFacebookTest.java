/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumfacebook;

/**
 *
 * @author Mitrovski
 */
public class SeleniumFacebookTest extends MySelenium {
    //class attributes
    //construct
    //TC_Login
    
    public void TC_login(){
        super.InputFieldByName("email", "jasminatanevska@yahoo.com");
        super.InputFieldByName("pas", "jasmina123");
        super.buttonByNme("login");
    }
    
    
    public void TC_withoutPassword(){
        super.InputFieldByName("email", "jasminatanevska@yahoo.com");
        super.buttonByNme("login");
    
    }
}
