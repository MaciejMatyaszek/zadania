/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Prostokąt extends FiguraPłaska{
    private int a;
    private int b;
 public Prostokąt(int a, int b){
     this.a=a;
     this.b=b;
 }
    @Override
    double ObliczPole() {
       return a*b;
    }

    @Override
    double ObliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public String toString() {
        return "Prostokąt{" + "a=" + a + ", b=" + b + '}';
    }
    
    
    
}
