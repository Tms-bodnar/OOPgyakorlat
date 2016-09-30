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
public class SikHaromszog {
    double[] vizszint;
    double[] fuggo;

    public SikHaromszog() {
    }

    public SikHaromszog(double[] vizszint, double[] fuggo) {
        this.vizszint = vizszint;
        this.fuggo = fuggo;
    }
    public void kiirSikHaromszog(){
       System.out.println("A háromszög 'a' oldala: " + aOldal() + "cm.");
       System.out.println("A háromszög 'b' oldala: " + bOldal() + "cm.");
       System.out.println("A háromszög 'c' oldala: " + cOldal()+ "cm.");
       
    }
    public double aOldal(){
        double aOld = Math.sqrt((vizszint[1] - vizszint[0]) * (vizszint[1] - vizszint[0]) + (fuggo[1] - fuggo[0]) * (fuggo[1] - fuggo[0]));
        return aOld;
    }
    public double bOldal(){
        double bOld = Math.sqrt((vizszint[2] - vizszint[1]) * (vizszint[2] - vizszint[1]) + (fuggo[2] - fuggo[1]) * (fuggo[2] - fuggo[1]));
        return bOld; 
    }
    public double cOldal(){
        double cOld = Math.sqrt((vizszint[2] - vizszint[0]) * (vizszint[2] - vizszint[0]) + (fuggo[2] - fuggo[0]) * (fuggo[2] - fuggo[0]));
        return cOld;
    }
    public boolean szerkesztheto(double a, double b, double c ){
       boolean szerkesztheto = false;
       if (a + b > c && b + c > a && a + c > b){
           szerkesztheto = true;
       }
       return szerkesztheto;
   
    }
    
    public double kerulet(){
       double kerulet = (double)aOldal() + bOldal() + cOldal();
       return kerulet;        
   }
   
   public double terulet(){
       double s = kerulet() / 2;
       double terulet = Math.sqrt(s*(s-aOldal())*(s-bOldal())*(s-cOldal()));
       return terulet;
   }
    }

