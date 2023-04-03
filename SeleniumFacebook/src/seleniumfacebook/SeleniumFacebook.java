/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniumfacebook;

/**
 *
 * @author Mitrovski
 */
public class SeleniumFacebook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instance
        //MySelenium qaFacebook=new MySelenium ();
        
        //qaFacebook.InputFieldById("email", "jasmina123@yahoo.com");
        //qaFacebook.InputFieldById("pass", "jasmina123");
        //qaFacebook.buttonByNme("login");
        
        SeleniumFacebookTest qaFacebook = new SeleniumFacebookTest();
        
        qaFacebook.TC_login();
        qaFacebook.TC_withoutPassword();
        
        
    
    }
    
}
