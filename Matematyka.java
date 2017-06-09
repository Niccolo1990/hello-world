package funkcje;

public class Matematyka	// Przyk³ad iteracyjnego wykonania funkcji silni
{

	public static long silnia(int argument)
		{
		long wynik = 1 ;
		for (int i = 1; i <= argument; i++) {
		wynik = wynik * i;
		}
		return wynik;
		}
	
	public static long rSilnia(int argument) // Przyk³ad rekurencyjnego wykonania funkcji silni
		{
		if (argument == 1) 
			return 1;
		else
			return rSilnia(argument-1) * argument;
			
			
		}
	
	public static long ciagFibonacciego(int argIleRazy) // Przyk³ad iteracyjnego wykonania ci¹gu fibonacciego
		{
		long wynik = 0;
		long arg1 = 0;
		long arg2 = 1;
		for (int i = 0; i < argIleRazy - 2; i++) 
			{
		    	wynik = arg1 + arg2;
		    	arg1 = arg2;
		    	arg2 = wynik;
		    	//System.out.println(wynik);
			}
		return wynik;
		
		}
	 
	public static long rCiagFibonacciego(int argIleRazy)// Przyk³ad rekurencyjnego wykonaiani ci¹gu fibonacciego
	{
	    if (argIleRazy == 1)
		return 0;
	    else if (argIleRazy == 2)
			return 1;
		else 
			
		return  rCiagFibonacciego(argIleRazy - 2) + rCiagFibonacciego(argIleRazy - 1);	//
		
	}
	
}
