/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Kwadrat extends FiguraPłaska {
    private double bok;

    public Kwadrat(double bok){
        this.bok=bok;
    }
    @Override
    double ObliczPole() {
        return bok*bok;
    }

    @Override
    double ObliczObwod() {
        return bok*4;
    }

    @Override
    public String toString() {
        return "Kwadrat{" + "bok=" + bok + '}';
    }
    
    
}

