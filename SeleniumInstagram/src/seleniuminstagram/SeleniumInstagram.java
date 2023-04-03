/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniuminstagram;

/**
 *
 * @author Mitrovski
 */
public class SeleniumInstagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instance
        //MySelenium qaInstagram = new MySelenium();
        //Login Form
        
        try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}    
        
        
        
        
        //qaInstagram.InputFieldByName("username", "jasminatanevska@yahoo.com");
        //qaInstagram.InputFieldByName("password", "jasmina123");
        //qaInstagram.buttonByXpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button/div");
        
        SeleniumInstagramTest qaInstagram = new SeleniumInstagramTest();
        
        qaInstagram.TC_login();
        qaInstagram.TC_withoutPassword();
        qaInstagram.TC_withoutUsername();
        
        
    } 
}  
        
        


   

