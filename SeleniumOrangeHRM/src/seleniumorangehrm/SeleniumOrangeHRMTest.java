/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumorangehrm;



/**
 *
 * @author Mitrovski
 */
public class SeleniumOrangeHRMTest extends MySelenium {
    
      
    //attributes
    //construct
    //methods
    //TC_login
    
        public void TC_loginwithoutUsername(){
            //parent
            super.InputFieldByName("password", "admin123");
            super.buttonByXpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
            
        }
        public void TC_loginwithoutPassword(){
            super.InputFieldByName("username", "Admin");
            super.buttonByXpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
        }
        public void TC_login(){
            super.InputFieldByName("password", "admin123");
            super.InputFieldByName("username", "Admin");
            super.buttonByXpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
            
            
        }
       public void AdminMenu(){
             try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}  
             this.driver.manage().window().maximize();
             super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");
             try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}  
             super.InputFieldByXpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input", "Admin");
             super.buttonByXpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i");
        
             
             
            //this.CreateNewAdmin();
            //this.filterAdmin();
        }
        
       private void CreateNewAdmin(){}
       
       public void Menu(){
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           this.driver.manage().window().maximize();
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span");
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span");
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a/span");
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span");
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span");
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[7]/a/span");
           try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
           super.buttonByXpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a/span");
           this.driver.close();
            }


        


}
    

    

