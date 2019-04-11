
public class FibonnacciEvens {

	
	public long fibEvens() {
		
		long currentNum = 1;
		long lastNum = 0;
		long swap = 0;
		long sum = 0;
		
		while (currentNum < 4000000){
			
			swap = currentNum;
			currentNum += lastNum;
			lastNum = swap;
			
			sum += (currentNum%2 == 0) ? currentNum:0;
			
		}
		return sum;
		
	}
	
	/*******************************************************
	 * Fibonacci numbers for debug                         *
	 *                                                     *
	 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,  * 
	 * 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711,*
	 * 28657, 46368, 75025, 121393, 196418, 317811, 514229,*
	 * 832040 1346269 2178309 3524578 5702887 9227465,     *
	 * 14930352 24157817 39088169                          *
	 *******************************************************/
	
	
	
}
