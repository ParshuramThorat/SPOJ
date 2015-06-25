import java.util.*;  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
	public static HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();  
	

    public static void main(String[] args) throws IOException {
    	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        
        int numOfCases = Integer.parseInt(inp.readLine());
        int m , n ;
        String str[] ;

    hashMap.put(1,0) ;    
    hashMap.put(2,1) ;
	hashMap.put(3,1) ;
	hashMap.put(5,1) ;
		
        for(int num = 0 ; num < numOfCases;  num++)
        {

        	str = inp.readLine().split(" ") ;
        	m = Integer.parseInt( str[0] );
        	n = Integer.parseInt( str[1] );
        	printPrimesBetween( m , n);
        	System.out.println() ;
        
        }
    }



	public static void printPrimesBetween(int m, int n) 
	{
		while( m <= n)
		{	
			if( hashMap.containsKey(m) )
			{	
				if(hashMap.get(m) == 1) {
					System.out.println( m ) ;
					m += 1 ; 
					continue ;
				}
				else {
					m++ ;
					continue ;
				}
			}
			int unitPlace = m%10 ;
			switch (unitPlace) {
				case 1:
					if( isPrime(m) )
					{	
						 hashMap.put(m, 1);
						 System.out.println(m);
					}
					else hashMap.put(m , 0) ;
					m += 2 ;
					break;
				case 3:
					if( isPrime(m) )
					{	
						 hashMap.put(m, 1);
						 System.out.println(m);
					}
					else hashMap.put(m , 0) ;
					m += 4 ;
					break;
				case 7:
					if( isPrime(m) )
					{	
						 hashMap.put(m, 1);
						 System.out.println(m);
					}
					else hashMap.put(m , 0) ;
					m += 2 ;
					break;
				case 9:
					if( isPrime(m) )
					{	
						 hashMap.put(m, 1);
						 System.out.println(m);
					}
					else hashMap.put(m , 0) ;
					m += 2 ;
					break;
		
				default:
					m += 1 ; 
					break;
			}
		}
	}	
	
	public static boolean isPrime(int num){
		if (num == 1) return false ;
		if (num == 2) return true ;
		if (num == 3) return true ;
		if (num % 2 == 0) return false ;
   		if (num % 3 == 0) return false ;
		int i = 5 ;
		int w = 2 ;
	
		while( i*i <= num )
		{
			if(num%i == 0) return false ;
			i += w ;
			w = 6-w ;
		}
		return true ;
	}
}


