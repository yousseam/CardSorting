package CardSorting;

public class Card implements Comparable<Card>{
	public Rank rank;
	public Suit suit;
	
	public Card(Rank r, Suit s) {
		this.rank = r;
		this.suit = s;
	}
	@Override
	public String toString() {
		return rank.toString() + suit.toString();
		
	}
	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub
		if (this.rank.ordinal() > o.rank.ordinal()) {
			return 1;
		}
		else if (this.rank.ordinal() == o.rank.ordinal()) {
			if (this.suit.ordinal() > o.suit.ordinal()) {
				return 1;
			}
			else if (this.suit.ordinal() < o.suit.ordinal()) {
				return -1;
			}
			else {
				return 0;
			}
		}
		else {
			return -1;
		}
		
	}
}

