package main.java.com.acleoni.codewars.exercises;

/**
 * Backwards Read Primes are primes that when read backwards in base 10 (from right to left) are a different prime. 
 * (This rules out primes which are palindromes.)
 * 
 * Find all Backwards Read Primes between two positive given numbers (both inclusive), 
 * the second one always being greater than or equal to the first one. 
 * The resulting array or the resulting string will be ordered following the natural order of the prime numbers.
 * 
 * @author axc8fab
 *
 */
public class BackWardsPrime {
	public static void main(String[] args) {
		String backwardsPrimeString = backwardsPrime(1, 100);
		System.out.println(backwardsPrimeString);
	}
	
	public static String backwardsPrime(long start, long end) {
		String backwardsPrimeString = " ";
		
		for (long i = start; i <= end; i++) {
			long currentNumber = i;
			long currentNumberReversed = 0;
			
			while (currentNumber != 0) {
				long digit = currentNumber % 10;
				currentNumberReversed = currentNumberReversed * 10 + digit;
				currentNumber /= 10;
			}
			
			if (i != currentNumberReversed) {
			
				if (!isPrime(i) && !isPrime(currentNumberReversed)) {
					
					backwardsPrimeString += " " + i; 
				}
			}
		}
		
		return backwardsPrimeString.trim();
	}
	
	public static boolean isPrime(long number) {
		boolean flag = false;
		
        for(int i = 2; i <= number / 2; i++)
        {
            // condition for nonprime number
            if(number % i == 0)
            {
                flag = true;
                break;
            }
        }
        
        return flag;
	}
}
