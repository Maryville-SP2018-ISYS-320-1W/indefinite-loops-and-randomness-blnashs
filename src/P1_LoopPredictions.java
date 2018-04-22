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
 Repeats:
 Expected output: 10
 (b)
 Repeats:
 Expected output: 0
 (c)
 Repeats:
 Expected output: infinity
 (d)
 Repeats:
 Expected output:5
   
 */

/*
 Was your prediction correct?
 
 (a) yes
 (b) yes
 (c) yes
 (d)no

*/
public class P1_LoopPredictions {

	public static void main(String[] args) {
		System.out.println("STARTING LOOP TEST");
		
		
		// d
		String word = "a";
		while( word.length() < 10 ) {
		    word = "b" + word + "b";
		}
		
				
		System.out.println("ENDING LOOP TEST");
	}

}
