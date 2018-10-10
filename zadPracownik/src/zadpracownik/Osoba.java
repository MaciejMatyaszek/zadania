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
public abstract class Osoba {
    public String imie;
    public String nazwisko;
    public int wiek;
    public abstract void Mów();
    
    
 
    public abstract void PokazDane();
        
    
    public Osoba(){
    }
    public Osoba(String imie, String nazwisko, int wiek){
        this.imie= imie;
        this.nazwisko= nazwisko;
        this.wiek= wiek;
        
    }
}
