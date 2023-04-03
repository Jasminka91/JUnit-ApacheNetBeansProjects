/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Mitrovski
 */
public class Fizika {
         //class attributes
         public double con=273.15;
         //construct
         public Fizika(){}
         //methods
    public void convertCToF (double C){
            double F;
            F =(C * 1.8) + 32.0;
            System.out.println("F="+F+" [F]");
    }
    
    public double convertCToFRet (double C){
            double F;
            F =(C * 1.8) + 32.0;
            return F;
    }
    
}
