/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Maciej
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i=0;
        FiguraGeometryczna[] a= new FiguraGeometryczna[15];
        a[0]= new Kwadrat(3);
        a[1]= new Prostokąt(2, 3);
        a[2]= new Trójkąt(3, 2, 3, 2);
        a[3]= new Trapez(3, 3, 2, 2, 2);
        a[4]= new Równoległobok(4, 3, 2);
        a[5]= new Romb(4, 3);
        a[6]= new Prostopadłościan(4, 2, 5);
        a[7]= new Koło(3);
        a[8]= new Kula(5);
        a[9]= new Sześcian(4);
        a[10]= new Stożek(4, 3, 5);
        a[11]= new Koło(5);
        a[12]= new Prostopadłościan(3, 6, 5);
        a[13]= new Walec(3, 5);
        a[14]= new Prostokąt(5, 8);
        
        while(i<15){
            a[i].toString();
            i++;
        }
    }
    
}
