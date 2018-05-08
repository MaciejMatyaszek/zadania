/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maciej
 */
public abstract class FiguraPrzestrzenna extends FiguraGeometryczna {
    public FiguraPrzestrzenna(){
        
    }
   public abstract double ObliczObjetosc();

    @Override
    public String toString() {
        return "Obliczanie parametrów figury przestrzennej";
    }

    @Override
    public abstract double ObliczPole();
    
   
}
    
