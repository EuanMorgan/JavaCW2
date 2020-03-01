import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Games {
	
	
	
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 public static RandomInterface r=new LinearCongruentialGenerator();
	
	public void gameLoop() throws Exception{ //The default gameloop for each game
		initialiseGame();
		mainGame();
		declareWinner();
	};
	
	public abstract void initialiseGame() throws Exception;
	
	public abstract void mainGame() throws Exception;
	
	public abstract void declareWinner() throws Exception;
	
}
