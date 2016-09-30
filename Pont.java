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
public class Pont {
    double vk;
    double fk;
    public Pont() {
    }

    public Pont(double vk, double fk) {
        this.vk = vk;
        this.fk = fk;
    }
    
    public void kiirKoordinata(){
        System.out.println("A vízszintes koordiáta: " + vk);
        System.out.println("A függőleges koordiáta: " + fk);
        

//        System.out.println("vízszintes: " + vkEltolva);
//        System.out.println("függőleges: " + fkEltolva);
        }
    
    public double tavolsag(double a, double b){
        double tavolsag = Math.sqrt((a - vk)*(a - vk)+(b - fk)*(b - fk));
        return tavolsag;
    }
    
    public double[] eltolo(){
        double[] ujPont = new double[2];
        ujPont[0] = vk + vk;
        ujPont[1] =fk + fk;
        return ujPont;
    }
}

