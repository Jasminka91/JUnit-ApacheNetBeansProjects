/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tanevska;

/**
 *
 * @author Mitrovski
 */
public class Matematika {
	//class attributes
	public double pi=3.1415;
	//construct
	public Matematika(){}
        public Matematika (double myPi){
            this.pi= myPi;
        }
	//methods
	public void pPravoagolnik(int a,int b)
	{
		int P=1;
		P=a*b;
		System.out.println(P);
	}
        public int pPravoagolnikRet(int a, int b)
        {
	        int P=1;
	        P=a*b;
	        return P;
        }
        public void pKvadrat (int a){
             int p = 1;
             p = a * a;
             System.out.println(p); 
        }
        public int pKvadratRet (int a){
             int p = 1;
             p = a * a;
             return p;
        }
        
        public void pKruznica(double r){
		double P=1;
		P=r*r*this.pi;
		System.out.println(P); 
        }
            
        public double pKruznicaRet(double r){
		double P=1;
		P=r*r*this.pi;
		return P ;
        }
                
        
}

    
