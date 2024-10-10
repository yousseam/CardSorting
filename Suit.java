package CardSorting;

public enum Suit {
	DIAMONDS("d"), CLUBS("c") , HARTS("h"), SPADES("s");
	
	private String symb;
	
	Suit(String s){
		symb = s;
	}
	
	@Override
	public String toString() {
		return symb;
	}
}
