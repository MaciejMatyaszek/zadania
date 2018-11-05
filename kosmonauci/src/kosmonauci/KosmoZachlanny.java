package kosmonauci;


/*
 Rozwiazanie problemu kosmonautow
 Metoda algorytmu zachlannego
*/


public class KosmoZachlanny
{

    final static int N = 5;                // liczba kosmonautow
    
    static int [][] D = {{1,0,0,1,0},
                         {0,1,1,1,0},
                         {0,0,1,0,1},
                         {1,2,0,0,1}};
    
    public static void kosmos()
    {
        boolean [] rozwiazanie = new boolean[N];
        

        int liczKosmo = 0;

        boolean [] rozwD = new boolean[N];
        
        while(true)
        {
            
            int maxlD = 0;
            int maxPoz = -1;
            for (int i=0; i<N; i++) //Szukamy najlepszego w sensie liczby dziedzin, ktory jeszcze nie zostal zabrany
            {
                if (!rozwiazanie[i]) //jesli jeszcze nie zabrany
                {
                    int lD = D[0][i] + D[1][i] + D[2][i] + D[3][i];

                    if (lD>maxlD)
                    {
                        maxlD = maxlD; maxPoz = i;
                    };
                }
            }

            if (maxPoz>-1)
            {
                for (int i=0; i<N; i++)
                {
                  if (D[0][maxPoz]==1) rozwD[i]=true;
                }
                

                rozwiazanie[maxPoz]=true;
                liczKosmo++;

                boolean AND = true;
                for (int i=0; i<N; i++)
                {
                    if (!rozwD[i]) {AND = false; break;}
                }
                if (AND) break;
                
            }
            else break;

        }

        System.out.println("Liczba kosmonautow:  " + liczKosmo);
        
        System.out.print("Konsmonauci: ");

        for (int i = 0; i < N; i++)
            if (rozwiazanie[i]) System.out.print(i+1 + " ");

        System.out.println();

    }

    public static void main(String[] args)
    {

        kosmos();        

    }
}
