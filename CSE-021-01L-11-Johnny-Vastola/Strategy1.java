package pig;

public class Strategy1 extends Player {


	public boolean throwAgain ( Player opponent ) {
	if(opponent.turnTotal()>this.turnTotal())
			return true;
		else 
		return false;
	}
	
}
