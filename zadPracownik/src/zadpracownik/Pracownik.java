/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadpracownik;

/**
 *
 * @author Maciej
 */
public abstract class Pracownik extends Osoba{
    String zawod;
    
    public Pracownik(){
        
    }
    
    public Pracownik(String imie, String nazwisko, int wiek){
        super(imie, nazwisko, wiek);
        
    }
    public Pracownik(String imie, String nazwisko, int wiek, String zawod){
        super(imie, nazwisko, wiek);
        this.zawod = zawod;
    
    }
    
    
    public abstract void WykonajPrace();
   

    
    
}