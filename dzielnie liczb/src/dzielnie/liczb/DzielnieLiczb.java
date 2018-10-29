/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dzielnie.liczb;

/**
 *
 * @author Maciej
 */
public class DzielnieLiczb {
static int a=50;
static int b=0;
static int liczba=100;
static int c=101;
static int r=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        liczba();
        System.out.println(a);
       
        // TODO code application logic here
    }
    
    static void liczba(){
        while(liczba!=a){
        if (liczba<a){
            c=a;//75 63
            r=c-b; //13
            
          
            
            System.out.println("Liczba jest mniejsza od "+a);
            a=a-r/2;//63 57
        }
        else if(liczba>a){
            //50 63 57
            b=a;//50 63 57
            r=c-b;
            
             System.out.println("Liczba jest większa od "+a);
            System.out.println("tutaj" +a);
             
            a=a+r/2;//75
            
        }
        else if (liczba==a){
            b=a/2;
            System.out.println("Liczba równa sie " +a);
                 
        }
    }
}}
