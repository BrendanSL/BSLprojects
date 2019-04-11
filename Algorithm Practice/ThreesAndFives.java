

/*************************************************************** 
 *                                                             *
 *   Find the sum of all the multiples of 3 or 5 below 1000.   *
 *                                                             *
 ***************************************************************/
public class ThreesAndFives {

	public ThreesAndFives() {
		this.threesAndFives();
	}
	
	
	/***************************************************************
	 *  Everyone on the site used a for loop with 1000 iterations. * 
	 *  This loop only has 332. Is it because this has more lines? *
	 ***************************************************************/
	
	
	public int threesAndFives() {
		
		int sum = 8;
		int three = 3;
		int five = 5;
	
		while (three < 999) {
			
			three += 3;
			
			if (three%5 != 0)
				sum += three;
			
			if (five < 995)
				sum += (five += 5);	
		}	
		return sum;
	}
}


