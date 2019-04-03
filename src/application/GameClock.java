package application;

public class GameClock {
	
	private int oneTenthOfSecond;
	
	private Counter whiteCounter;
	
	private Counter blackCounter;
	
	private Counter activeCounter;
	
	public GameClock(int oneTenthOfSecond) {
		this.oneTenthOfSecond = oneTenthOfSecond;
		whiteCounter = new Counter(oneTenthOfSecond);
		blackCounter = new Counter(oneTenthOfSecond);
		this.activeCounter = null;
	}
	
	public boolean switchPlayer() {
		return true;
	}
	
	public int decrementCounter() {
		return this.activeCounter.decrementCounter();
	}

}
