/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Koło extends FiguraPłaska{
    private int r;
    public Koło(int r){
        this.r=r;
    }

    @Override
    double ObliczPole() {
        return Math.PI*r*r;
    }

    @Override
    double ObliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return super.toString() + "Koło{" + "r=" + r + '}' + "Pole: " + ObliczPole() + " Obwod: " + ObliczObwod();
    }
    
}
