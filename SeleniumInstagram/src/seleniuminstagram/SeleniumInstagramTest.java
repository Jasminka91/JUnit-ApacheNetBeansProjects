/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniuminstagram;

/**
 *
 * @author Mitrovski
 */
public class SeleniumInstagramTest extends MySelenium {
    //class attributes
    //construct
    //TC_login
    
    public void TC_login(){
         super.InputFieldByName("username", "jasminatanevska@yahoo.com");
         super.InputFieldByName("password", "jasmina123");
         super.buttonByXpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button/div");
    }
    public void TC_withoutUsername(){
         super.InputFieldByName("password", "jasmina123");
         super.buttonByXpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button/div");
    
    }
    
    public void TC_withoutPassword(){
         super.InputFieldByName("username", "jasminatanevska@yahoo.com");
         super.buttonByXpath("/html/body/div[2]/div/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[3]/button/div");
    
    }
    
    }
    

