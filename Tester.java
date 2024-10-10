package CardSorting;

import java.util.ArrayList;

import java.util.Collections;

import heaps114.priorityQueue.MaxHeap;

public class Tester {

	public static void main(String[] args) {
		
		// Create an array of cards
		ArrayList<Card> cards1 = new ArrayList<Card>();
		cards1.add(new Card(Rank.EIGHT, Suit.CLUBS));
		cards1.add(new Card(Rank.FIVE, Suit.DIAMONDS));
		cards1.add(new Card(Rank.EIGHT, Suit.HARTS));
		cards1.add(new Card(Rank.ACE, Suit.SPADES));
		cards1.add(new Card(Rank.J, Suit.DIAMONDS));
		cards1.add(new Card(Rank.TWO, Suit.CLUBS));
		cards1.add(new Card(Rank.FOUR, Suit.HARTS));
		cards1.add(new Card(Rank.FOUR, Suit.CLUBS));
		//Card c = new Card(Rank.EIGHT, Suit.DIAMONDS)
		//c.rank.ordinal(); 
		

		// print unsorted array
		System.out.println("Before sorting: ");
		for (Card c : cards1) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// sort cards using built in java method. This sort is using the Card.CompareTo(card) method. 
		// For this to work you must implement the method compareTo in the Card class to work as expected.
		Collections.sort(cards1);
		
		// print sorted array
		System.out.println("After sorting: ");
		for (Card c : cards1) {
			System.out.print(c + " ");
		}
		System.out.println();

		insSort(cards1);
		System.out.println("Insertion Sort:");
		for (Card c : cards1) {
			System.out.print(c + " ");
		}
		System.out.println();

		bubbleSort(cards1);
		System.out.println("Bubble Sort:");
		for (Card c : cards1) {
			System.out.print(c + " ");
		}
		System.out.println();
	}
	
	/* Implementation on insertion sort*/
	public static void insSort(ArrayList<Card> arr) {
		for (int i = 1; i < arr.size(); ++i) {
			for (int j = i; (j > 0) && (arr.get(j).compareTo(arr.get(j-1)) == -1); --j) {
				Collections.swap(arr, (j-1), j);
			}
		}
	}
	
	/* implementation of bubble sort */
	public static void bubbleSort(ArrayList<Card> arr){
		for (int i = 0; i < arr.size() - 1; ++i) {
			for (int j = 0; j < arr.size() - i - 1; ++j) {
				if (arr.get(j).compareTo(arr.get(j + 1)) == 1) {
					Collections.swap(arr, j, j + 1);
				}
			}
		}
	}	
		
}
