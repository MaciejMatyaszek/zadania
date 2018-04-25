/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere.oopl8.lekcja.zad1;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produkt[] tab = new Produkt[10];
        tab[0] = new Ksiazka(15, " Ksiazka 1", "Ksiazka");
        tab[1] = new Ksiazka(51, "Ksiazka 3", "Ksiazka");
        tab[2] = new Ksiazka(13, "Ksiazka 2", "Ksiazka");
        tab[3] = new Dlugopis(1, "Dlugopis 1", "Dlugopis");
        tab[4] = new Dzem(12, "Dzem 1", "Dzem");
        tab[5] = new Polopiryna(23, "Polopiryna 1", "Polopiryna");
        tab[6] = new Dzem(4, "Dzem 2", "Dzem");
        tab[7] = new Czekolada(6, "Czekolada 2", "Czekolada");
        tab[8] = new Dlugopis(1, "Dlugopis 2", "Dlugopis");
        tab[9] = new Czekolada(4, "Czekolada 1", "Czekolada");
        

        for (int i = 0; i < 10; i++) {
            tab[i].buy();
            tab[i].showInfo();
    }
    
}}
