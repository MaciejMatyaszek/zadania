/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Stożek extends FiguraPrzestrzenna{
    private int a,r,H;
    public Stożek(int a, int r, int H){
        this.a=a;
        this.H=H;
        this.r=r;
    }

    @Override
    public double ObliczObjetosc() {
        return (1/3)*Math.PI*r*H;
    }

    @Override
    public double ObliczPole() {
        return Math.PI*2*Math.PI*a;
    }

    @Override
    public String toString() {
        return "Stoźek{" + "a=" + a + ", r=" + r + ", H=" + H + '}';
    }
    
    
}

