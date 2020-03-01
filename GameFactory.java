
public class GameFactory{

	
	public static Games getGames(String game) {
		
		
		if(game.equalsIgnoreCase("d")) {
			return new DieGame();
		}else if(game.equalsIgnoreCase("c")) {
			return new CardGame();
		}else {
			System.out.println("Input not understood");
		}
		
		return null;
		
	}
	
}
