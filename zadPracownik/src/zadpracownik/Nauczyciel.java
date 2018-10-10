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
public class Nauczyciel extends Pracownik {
    public Nauczyciel(String imie, String nazwisko, int wiek, String zawod){
        super(imie, nazwisko, wiek, zawod);
        
    }

    @Override
    public void PokazDane() {
         System.out.println(imie+" "+nazwisko+" "+wiek+" "+zawod);
         Mów();
        WykonajPrace();
    }

    @Override
    public void WykonajPrace() {
         System.out.println("Uczę");
    }

    @Override
    public void Mów() {
        System.out.println("Do odpowiedzi");
    }
    
    
}
