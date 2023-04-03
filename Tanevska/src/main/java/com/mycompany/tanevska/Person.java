/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanevska;

/**
 *
 * @author Mitrovski
 */
public class Person {
    //class attributes
    public int age = 18;
    private String first_name    ="llll";
    public String last_name     ="pppp";
    

    //construct
    
    //Setter
    public void setFirst_name (String first_name){
        this.first_name=first_name;
    }
    //Getter
    public String getFirst_name(){
    return this.first_name;
    }
    
    //methods
    public void isAdult(int age) {
        System.out.println("polnoletstvo");
   
  }
   
  
     public void voGradinka (int age){
         if (age < 7) {
             System.out.println ("Cestito upis vo gradinka!");
         } else {
             System.out.println ("Ne ste za vo gradinka");
         }
}     
     
        public void voOsnovno (int age){
         if (age > 6 && age < 14){
             System.out.println("Cestito upis vo osnovno!");
         } else { 
              System.out.println ("Ne ste za vo osnovno");
                     }
         }
                 

         public void voSredno (int age) {
             if (age >14 && age< 18) {
                 System.out.println ("Cestito upis vo sredno");
             } else {
                 System.out.println ("Ne ste za vo sredno");
             }
         }


         public void naFakultet (int age) {
             if (age >18 && age < 62) {
                 System.out.println ("Cestito upis na fakultet");
             } else {
                 System.out.println ("Ne ste za na fakultet");
             }
         }


}
     
         

  

      

