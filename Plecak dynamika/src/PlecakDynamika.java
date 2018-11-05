class Plecak 
{ 
  
    static int max(int a, int b) { return (a > b)? a : b; } 
       
  
    static int plecak(int P, int V[], int val[], int n) 
    { 
         int i, w; 
     int K[][] = new int[n+1][P+1]; 
       
    
     for (i = 0; i <= n; i++) 
     { 
         for (w = 0; w <= P; w++) 
         { 
             if (i==0 || w==0) 
                  K[i][w] = 0; 
             else if (V[i-1] <= w) 
                   K[i][w] = max(val[i-1] + K[i-1][w-V[i-1]],  K[i-1][w]); 
             else
                   K[i][w] = K[i-1][w]; 
         } 
      } 
       
      return K[n][P]; 
    } 
  
    
    
    public static void main(String args[]) 
    { 
        int val[] = new int[]{6, 4, 5, 7, 10, 2}; 
    int V[] = new int[]{6, 2, 3, 2, 3, 1}; 
    int  P = 10; 
    int n = val.length; 
    System.out.println(plecak(P, V, val, n)); 
    } 
} 