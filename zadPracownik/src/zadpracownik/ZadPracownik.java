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
public class ZadPracownik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Osoba[] tab= new Osoba[7];
        tab[0] = new Murarz ("Stanisław", "Nowakowski", 35, "Murarz");
        tab[1] = new Piekarz ("Jan", "Bułeczka", 46, "Piekarz");
        tab[2] = new Nauczyciel ("Anna", "Kurek", 34, "Nauczyciel");
        tab[3] = new Mechanik ("Roman", "Ochocki", 37, "Mechanik");
        tab[4] = new Murarz ("Waldemar", "Piszczek", 43, "Murarz");
        tab[5] = new Piekarz("Tadeusz", "Bochenek", 41, "Piekarz");
        tab[6] = new Mechanik ("Janusz", "Brodowski", 38, "Mechanik");
        
        for(int i=0; i<7; i++){
            tab[i].PokazDane();
        }
    }
    
}
