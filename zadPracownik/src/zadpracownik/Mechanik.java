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
public class Mechanik extends Pracownik {
    public Mechanik (String imie, String nazwisko, int wiek, String zawod){
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
        System.out.println("Naprawiam");
    }

    @Override
    public void Mów() {
        System.out.println("Podaj klucz 15");
    }
    
    
}
