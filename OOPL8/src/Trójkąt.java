/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Trójkąt extends FiguraPłaska{
    private int a, b,c;
    private int h;
    public Trójkąt(int a, int b, int c, int h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }

    @Override
    double ObliczPole() {
        return 0.5*a*h;
    }

    @Override
    double ObliczObwod() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return "Trójkąt{" + "a=" + a + ", b=" + b + ", c=" + c + ", h=" + h + '}';
    }
    
    
}
