/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tanevska;

/**
 *
 * @author Mitrovski
 */
public class Tanevska {

    public static void main(String[] args) {
        System.out.println("Jasmina");
        int a=3;
        int b=2;
        int p=a*b;
        System.out.println("p="+p+" m2");
        //Instance
        Matematika objKM=new Matematika();
	           objKM.pPravoagolnik(3,6);
                   objKM.pKruznica (2.0);
                   
        Matematika objTA=new Matematika(13.1415);
	           objTA.pPravoagolnik(3,6);
                   objTA.pKruznica (2.0);
                   
        //Instance
        Person objBebe = new Person();
        System.out.println(objBebe.getFirst_name());//llll
        System.out.println(objBebe.last_name);//pppp
 
        
        //Promena na default llll=Ljubisa
        objBebe.setFirst_name("Ljubisa");
        //Promena na default pppp=Popovski
        objBebe.last_name = "Popovski";
        
        System.out.println (objBebe.getFirst_name());//Ljubisa
        System.out.println (objBebe.last_name);//Popovski
        objBebe.isAdult(1);
        
        //Instance
        Fizika objKMSF = new Fizika ();
               objKMSF.convertCToF(2.0);
               
               
        //Instance
        Person Jasmina = new Person();
        int JasminaAge = 32;
        String JasminaPol ="z";
        Jasmina.isAdult(JasminaAge);
        Jasmina.voGradinka(JasminaAge);
        Jasmina.voOsnovno(JasminaAge);
        Jasmina.voSredno(JasminaAge);
        Jasmina.naFakultet(JasminaAge);
        //Jasmina.Penzija(JasminaAge,JasminaPol);
        
        
        Person Ljubisha = new Person();
        int LjubishaAge = 40;
        String pol ="m";
        Ljubisha.isAdult(LjubishaAge);
        Ljubisha.voGradinka(LjubishaAge);
        Ljubisha.voOsnovno(LjubishaAge);
        Ljubisha.voSredno(LjubishaAge);
        Ljubisha.naFakultet(LjubishaAge);
        //Jasmina.Penzija(JasminaAge,JasminaPol);
      
        
    }
}
