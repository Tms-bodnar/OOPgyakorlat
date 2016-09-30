/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopgyakorlas;

/**
 *
 * @author bodnart
 */
public class Haromszog {
    int aOldal;
    int bOldal;
    int cOldal;

    public Haromszog() {
    }

    public Haromszog(int aOldal, int bOldal, int cOldal) {
        this.aOldal = aOldal;
        this.bOldal = bOldal;
        this.cOldal = cOldal;
    }
   public void kiirHaromszog(){
       System.out.println("A háromszög 'a' oldala: " + aOldal + "cm.");
       System.out.println("A háromszög 'b' oldala: " + bOldal + "cm.");
       System.out.println("A háromszög 'c' oldala: " + cOldal + "cm.");

   }
   public boolean szerkesztheto(int a, int b, int c){
       boolean szerkesztheto = false;
       if (a + b > c && b + c > a && a + c > b){
           szerkesztheto = true;
       }
       return szerkesztheto;
   }
   
   public double kerulet(){
       double kerulet = (double)aOldal + bOldal + cOldal;
       return kerulet;        
   }
   
   public double terulet(){
       double s = kerulet() / 2;
       double terulet = Math.sqrt(s*(s-aOldal)*(s-bOldal)*(s-cOldal));
       return terulet;
   }
   
}