/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 How many times do you expect the loop to repeat? Remember that 
 “zero,” “infinity,” and “unknown” are legal answers.
 
 What do you expect the loop to output?
 
 (a)
 Repeats: 10
 Expected output: 
 (b)
 Repeats: 0
 Expected output: nothing
 (c)
 Repeats: infinity
 Expected output:
 (d)
 Repeats: 5
 Expected output:
   
 */

/*
 Was your prediction correct?
 
 (a)
 (b)
 (c)
 (d)

*/
public class P4_DoLoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		//c
		int y = 250;
		do {
		    System.out.println( y );
		} while( y % 3 != 0 );

				
		System.out.println("ENDING LOOP TEST");

	}

}
