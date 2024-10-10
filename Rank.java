package CardSorting;

public enum Rank {
	TWO("2"), 
	THREE("3"), 
	FOUR("4"), 
	FIVE("5"), 
	SIX("6"), 
	SEVEN("7"), 
	EIGHT("8"), 
	NINE("9"), 
	TEN("10"), 
	J("J"), 
	Q("Q"), 
	K("K"), 
	ACE("A");
	
private String symb;
	
	Rank(String s){
		symb = s;
	}
	
	@Override
	public String toString() {
		return symb;
	}
}
