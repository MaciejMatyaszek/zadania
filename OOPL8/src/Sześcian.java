/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public class Sześcian extends FiguraPrzestrzenna{
    private int a;
    public Sześcian(int a){
        this.a=a;
    }

    @Override
    public double ObliczObjetosc() {
        return a*a*a;
    }

    @Override
    public double ObliczPole() {
       return 6*a*a;
    }

    @Override
    public String toString() {
        return "Sześcian{" + "a=" + a + '}';
    }
    
    
}
