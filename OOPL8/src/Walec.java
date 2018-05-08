/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Walec extends FiguraPrzestrzenna{
    private int r, H;
    public Walec(int r, int H){
        this.H=H;
        this.r=r;
    }

    @Override
    public double ObliczObjetosc() {
        return Math.PI*r*r*H;
    }

    @Override
    public double ObliczPole() {
       return 2*r*H;
    }

    @Override
    public String toString() {
        return "Walec{" + "r=" + r + ", H=" + H + '}';
    }
    
    
}
