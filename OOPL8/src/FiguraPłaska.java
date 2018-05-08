/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public abstract class FiguraPłaska extends FiguraGeometryczna {
    public FiguraPłaska(){
    
    }

    @Override
    abstract double ObliczPole();
    abstract double ObliczObwod();    

    @Override
    public String toString() {
        return "Obliczanie parametrów figury płaskiej";
    }

    
}
