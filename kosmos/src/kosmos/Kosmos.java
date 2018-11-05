/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kosmos;

/**
 *
 * @author Maciej
 */
public class Kosmos {
    static String kos[]= new String[]{"k1", "k2","k3", "k4", "k5"};
    static int spec[]= new int[]{1, 1, 1, 1};
    static int k1[]= new int[]{0, 1, 1, 0};
    static int k2[]= new int[]{1, 0, 1, 0};
    static int k3[]= new int[]{1, 0, 0, 1};
    static int k4[]= new int[]{0, 0, 1, 1};
    static int k5[]= new int[]{1, 1, 0, 0};
    
    static int A[]=new int[]{1, 0, 0, 1, 0};
    static int B[]=new int[]{0, 1, 1, 1, 0};
    static int C[]=new int[]{0, 0, 1, 0, 1};
    static int D[]=new int[]{1, 1, 0, 0, 1};
    
    static String a,b;
    static int j=0;
    static int a1, a2,a3,a4,a5, b1, b2, b3, b4, b5;
    static int end=0;
    

   
    public static void main(String[] args) {
       wybor();
    }
    public static void wybor(){
        while(end!=1){
           
        if (spec[j]==0){
            j++;
            continue;
            
        }
        else{
        a=kos[j];
        a1=k1[j];
        a2=k2[j];
        a3=k3[j];
        a4=k4[j];
        a5=k5[j];
        b1=0;
        b2=0;
        b3=0;
        b4=0;
        b5=0;
        for(int k=0; k<4; k++){
            if(spec[k]!=k1[k]){
                b1++;
            }
             if(spec[k]!=k2[k]){
                b2++;
            }
             if(spec[k]!=k3[k]){
                b3++;
            }
              if(spec[k]!=k4[k]){
                b4++;
            }
             if(spec[k]!=k5[k]){
                b5++;
            }
             
            
        }
        
        
            if (a1==0 && b1>=b2 && b1>=b3 && b1>= b4 && b1>=b5){
                j++;
                for(int i=0; i<4; i++){
                if(spec[i]==1){
                spec[i]=k1[i];
                }}
                
                    System.out.println("k1");
                    
                if(spec[0]==0 && spec[1]==0 && spec[2]==0 && spec[3]==0){
                end=1;
                }}
            
            
            else if (a2==0 && b2>=b1 && b2>=b3 && b2>= b4 && b2>=b5){
                j++;
                for(int i=0; i<4; i++){
                    if(spec[i]==1){
                spec[i]=k2[i];}}
                    System.out.println("k2");
            
                
                if(spec[0]==0 && spec[1]==0 && spec[2]==0 && spec[3]==0){
                end=1;
            }}
            
                
            
            else if(a3==0 && b3>=b2 && b3>=b1 && b3>= b4 && b3>=b5){
                 j++;
                for(int i=0; i<4; i++){
                    if(spec[i]==1){
                spec[i]=k3[i];}}
            
                
                System.out.println("k3");
                if(spec[0]==0 && spec[1]==0 && spec[2]==0 && spec[3]==0){
                end=1;
            }}
             else if(a4==0 && b4>=b2 && b4>=b3 && b4>= b1 && b4>=b5){
                 j++;
                for(int i=0; i<4; i++){
                    if(spec[i]==1){
                spec[i]=k4[i];}}
            
                
                System.out.println("k4");
                if(spec[0]==0 && spec[1]==0 && spec[2]==0 && spec[3]==0){
                end=1;
            }}
              else if(a5==0 && b5>=b2 && b5>=b3 && b5>= b4 && b5>=b1){
                  j++;
                for(int i=0; i<4; i++){
                    if(spec[i]==1){
                spec[i]=k5[i];}}
                    System.out.println("k5");
            
                
                if(spec[0]==0 && spec[1]==0 && spec[2]==0 && spec[3]==0){
                end=1;
            }}
            
        }               
    }
    }
    }

