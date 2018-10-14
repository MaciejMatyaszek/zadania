/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plecak;

/**
 *
 * @author Maciej
 */
public class Plecak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int Przedmioty = 6;
        final int maxV = 10;
        final int[] V= {6 ,2 ,3,2,3,1};
        final int[] W= {6, 4, 5, 7, 10, 2};
        int maxwartosc = 0;
        int objetosc, wartosc;
        int tab[] = new int [Przedmioty];
        int p1, p2, p3, p4, p5, p6;
        for (p1 = 0;  p1<= 1; p1++) 
            {for ( p2 = 0; p2 <= 1; p2++) {
                        for ( p3 = 0; p3 <=1; p3++) {
                            for ( p4 = 0; p4 <=1; p4++) {
                                for (p5 = 0; p5 <=1; p5++) {
                                    for (p6 = 0; p6 <= 1; p6++) {
                                        objetosc = p1*V[0]+p2*V[1]+p3*V[2]+p4*V[3]+p5*V[4]+p6*V[5];
                                        if(objetosc<=maxV){
                                            wartosc = p1*W[0]+p2*W[1]+p3*W[2]+p4*W[3]+p5*W[4]+p6*W[5];
                                            if(wartosc>maxwartosc){
                                                maxwartosc=wartosc;
                                                tab[0]=p1;
                                                tab[1]=p2;
                                                tab[2]=p3;
                                                tab[3]=p4;
                                                tab[4]=p5;
                                                tab[5]=p6;
                                                
                                            }
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
            
                
            }
            
        }
        System.out.println("Wartosc przedmiotów z plecaka: "+maxwartosc);
        System.out.println("W plecaku są przedmioty numer: ");
        for (int i = 0; i <6; i++) {
            if(tab[i]==1){
                System.out.println(i+ "");
            }
            
        }
                
    }
    
}
