
import java.util.HashSet;

public class DieGame extends Games{

	public static HashSet<Integer> numbersRolled=new HashSet<Integer>();
	

	
	public void initialiseGame() throws Exception {
		// Nothing to do here
		
	}


	public void mainGame() throws Exception {
		// The main game:

	      // Let the user roll the die twice
	      for (int i=0; i<2; i++) {
	        System.out.println("Hit <RETURN> to roll the die");
	        br.readLine();
	        int dieRoll=(int)(r.next() * 6) + 1;

	        System.out.println("You rolled " + dieRoll);
	        numbersRolled.add(new Integer(dieRoll));
	      }

	      // Display the numbers rolled
	      System.out.println("Numbers rolled: " + numbersRolled);
		
	}


	public void declareWinner() throws Exception {
		 // Declare the winner:

	      // User wins if at least one of the die rolls is a 1
	      if (numbersRolled.contains(new Integer(1))) {
	        System.out.println("You won!");
	      }
	      else System.out.println("You lost!");
		
	}
	

}
