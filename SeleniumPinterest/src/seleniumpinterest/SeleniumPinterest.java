/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniumpinterest;

/**
 *
 * @author Mitrovski
 */
public class SeleniumPinterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instance
        //MySelenium qaPinterest = new MySelenium();
        //Login form
        try{Thread.sleep(7000);}catch(InterruptedException e){System.out.println(e);}    
        
        
        //qaPinterest.InputFieldById("email", "tanevskajasmina@yahoo.com");
        //qaPinterest.InputFieldById("password", "jasmina123");
        //qaPinterest.buttonByXpath("//button[@type='submit']//div[@class='zI7 iyn Hsu'][normalize-space()='Log in']");
        
        
        SeleniumPinterestTest qaPinterest = new SeleniumPinterestTest();
        
        //qaPinterest.TC_login();
        qaPinterest.TC_withoutPassword();
        //qaPinterest.TC_withoutUsername();
       
    }
    
}
