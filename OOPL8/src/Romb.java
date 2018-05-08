/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Romb extends FiguraPłaska {
    private int a,h;
    public Romb(int a, int h){
        this.a=a;
        this.h=h;
    }

    @Override
    double ObliczPole() {
        return a*h;
    }

    @Override
    double ObliczObwod() {
        return 4*a;
    }

    @Override
    public String toString() {
        return "Romb{" + "a=" + a + ", h=" + h + '}';
    }
    
}
