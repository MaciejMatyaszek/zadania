/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koza;

/**
 *
 * @author Maciej
 */
public class Koza {
    static String a= "koza";
    static int h=0;
    static String b= "kapusta";
    static String c= "wilk";
    public static int[] lewy=new int [3];
    public  static int[] prawy={1,1,1};
    public static  String[] prawyN={a,b,c};
    static int lodka=0;
    static int wilk=0;
    static int koza=0;
    static int kapusta=0;
    static int m;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        lodka();
        for (int k=0; k<3; k++){
            
        System.out.println(lewy[k]);
        // TODO code application logic here
    }
    }
    static void lodka(){
        if ( m == 3)
        {
            System.out.println("Na lewym brzegu jest: ");
            for (int j=0; j<3; j++){
                System.out.println(lewy[j]);
            }
        }
        else {
            
        
            for(int t=0;t<6;t++){
                System.out.println("lodz jest "+lodka);
            for (h=0;h<3; h++){
            if (lewy[0]==1 && lewy[1]==1 && lewy[2] ==1){
            m=3;
             }
            else{
            {
                if ((lodka==0 )&& ((lewy[0]==1 || lewy[2]==0) || (lewy[0]==0 || lewy[2]==1)) && ((lewy[0]==1 || lewy[1]==0) || (lewy[0]==0 || lewy[1]==1))  && ((prawy[0]==1 || prawy[2]==0) || (prawy[0]==0 || prawy[2]==1)) && ((prawy[0]==1 || prawy[1]==0) || (prawy[0]==0 || prawy[1]==1)) ){
                   
                    if ( prawy[h]==1){
                prawy[h]=0;
                lewy[h]=1;
                System.out.println(prawyN[h]+ " płynie na lewy brzeg");
                lodka=1;
                
                
            }} else if ( lodka==1 && ((lewy[0]==1 || lewy[2]==0) || (lewy[0]==0 || lewy[2]==1)) && ((lewy[0]==1 || lewy[1]==0) || (lewy[0]==0 || lewy[1]==1))  && ((prawy[0]==1 || prawy[2]==0) || (prawy[0]==0 || prawy[2]==1)) && ((prawy[0]==1 || prawy[1]==0) || (prawy[0]==0 || prawy[1]==1)) ){
                lodka=0;
                    System.out.println("łodka płynie na prawo");
            }
                
                
                
                
                
                
                
                else if (lodka==1 && ((lewy[0]==1 || lewy[2]==0) && (lewy[0]==0 || lewy[2]==1) && (lewy[0]==1 || lewy[1]==0) && (lewy[0]==0 || lewy[1]==1)  && (prawy[0]==1 || prawy[2]==0) && (prawy[0]==0 || prawy[2]==1) && (prawy[0]==1 || prawy[1]==0) && (prawy[0]==0 || prawy[1]==1) )){
                
                 if ( lodka==1 && lewy[h]==1) {
                lewy[h]=0;
                prawy[h]=1;
                    System.out.println(prawyN[h]+ "płynie na prawy brzeg");
                    lodka=0;
                    
            }
                
            }
              
            
        }}}}}
            
        
}
    }
