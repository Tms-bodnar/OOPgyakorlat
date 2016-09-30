/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopgyakorlas;

import java.util.Scanner;

/**
 *
 * @author bodnart
 */
public class OOPgyakorlas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//háromszög kerület-terület       
        System.out.print("Add meg a háromszög 'a' oldalát:");
        int a = sc.nextInt();
        System.out.print("Add meg a háromszög 'b' oldalát:");
        int b = sc.nextInt();
        System.out.print("Add meg a háromszög 'c' oldalát:");
        int c = sc.nextInt();
        Haromszog haromszog = new Haromszog(a, b, c);
        haromszog.kiirHaromszog();
        if (haromszog.szerkesztheto(a,b,c)){
           System.out.println("A háromszög szerkeszthető.");
           System.out.println("A háromszög kerülete: " + haromszog.kerulet() + "cm.");
           System.out.println("A háromszög területe: " + haromszog.terulet() + "ncm.");
       }else{
            System.out.println("Nem szerkeszthető háromszög.");
        }       
//síkbeli pont helyzete,távolsága, eltolása,
        System.out.print("Add meg a pont vízszintes koordinátáját:");
        double vk = sc.nextDouble();
        System.out.print("Add meg a pont függőleges koordinátáját:");
        double fk = sc.nextDouble();
        Pont pont = new Pont(vk, fk);
        pont.kiirKoordinata();
        System.out.println("A pont távolsága az origótól: " + pont.tavolsag(0,0));
        System.out.println("Egy 'P' pont koordinátái:");
        System.out.print("Vízszintes: ");
        double pvk = sc.nextDouble();
        System.out.print("Függőleges: ");
        double pfk = sc.nextDouble();
        System.out.println("A pont távolsága a 'P' ponttól: " + pont.tavolsag(pvk,pfk));
        System.out.println("A pont az origóból mutató vektorral erre változik:");
        System.out.println("A vízszintes koordiáta: " + pont.eltolo()[0]);
        System.out.println("A függőleges koordiáta: " + pont.eltolo()[1]);
        
//síkbeli koordináta háromszög terület-kerület
        double[] vizszintesKoordinata = new double[3];
        double[] fuggolegesKoordinata = new double[3];
       
        System.out.println("A háromszög koordinátái: ");
        System.out.print("'a' csúcs vízszintes: ");
        vizszintesKoordinata[0] = sc.nextDouble();
        System.out.print("'a' csúcs függőleges: ");
        fuggolegesKoordinata[0] = sc.nextDouble();
        System.out.print("'b' csúcs vízszintes: ");
        vizszintesKoordinata[1] = sc.nextDouble();
        System.out.print("'b' csúcs függőleges: ");
        fuggolegesKoordinata[1] = sc.nextDouble();
        System.out.print("'c' csúcs vízszintes: ");
        vizszintesKoordinata[2] = sc.nextDouble();
        System.out.print("'c' csúcs függőleges: ");
        fuggolegesKoordinata[2] = sc.nextDouble();
        
        SikHaromszog sikHaromszog = new SikHaromszog(vizszintesKoordinata, fuggolegesKoordinata);
        sikHaromszog.kiirSikHaromszog();
        double aOld = sikHaromszog.aOldal();
        double bOld = sikHaromszog.bOldal();
        double cOld = sikHaromszog.cOldal();
        
        if (sikHaromszog.szerkesztheto(aOld, bOld, cOld)){
           System.out.println("A háromszög szerkeszthető.");
           System.out.println("A háromszög kerülete: " + sikHaromszog.kerulet() + "cm.");
           System.out.println("A háromszög területe: " + sikHaromszog.terulet() + "ncm.");
       }else{
            System.out.println("Nem szerkeszthető háromszög.");
        }       
                
    
    }
    
}

