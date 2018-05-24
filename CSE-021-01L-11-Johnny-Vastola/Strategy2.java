package pig;

public class Strategy2 extends Player {


	public boolean throwAgain ( Player opponent ) {
		if(opponent.rollCount()>this.rollCount()) 
			return true;
			else return false;
	
	}
	
}
