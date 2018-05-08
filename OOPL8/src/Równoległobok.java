/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Równoległobok extends FiguraPłaska {
    private int a,b,h;

public Równoległobok(int a, int b, int h){
    this.a=a;
    this.b=b;
    this.h=h;
}    

    @Override
    double ObliczPole() {
        return a*h;
    }

    @Override
    double ObliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public String toString() {
        return "Równoległobok{" + "a=" + a + ", b=" + b + ", h=" + h + '}';
    }

}
