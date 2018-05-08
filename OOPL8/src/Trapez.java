/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Trapez extends FiguraPłaska{
    private int a,b,c,d,h;
    public Trapez(int a,int b, int c, int d, int h){
    this.a=a;
    this.b=b;
    this.c=c;
    this.d=d;
    this.h=h;
}

    @Override
    double ObliczPole() {
        return 0.5*(a+b)*h;
    }

    @Override
    double ObliczObwod() {
        return a+b+c+d;
    }

    @Override
    public String toString() {
        return "Trapez{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", h=" + h + '}';
    }
    
    
}
