package application;

public class Game {
	
	private String gameId;
		
	private User whitePlayer;
	
	private User blackPlayer;
	
	private int time;
	
	private GameClock gameClock;
	
	private Result result;
	
	public String createGame() {
		return this.gameId;
	}
	
	private GameClock startGame() {
		return new GameClock(this.time);
	}
	
	private String endGame() {
		return this.result.getDescription();
	}
	
	public String runGame() {
		return this.endGame();
	}
	
	public boolean deleteGame() {
		return true;
	}

}
