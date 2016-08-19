package game;

public enum Roshambo  { 
	ROCK, PAPER, SCISSORS;

	
	public String toString(Roshambo value){

	    int ordinalRoshambo = value.ordinal();
	    switch(ordinalRoshambo){
	    case 0:
	        return "Rock";
	        
	    case 1:
	        return "Paper";
	        
	    case 2:
	        return "Scissors";
	        
	    default:
	    return    "Craaaaap!";
	        
	    }
	}	
}	
	
