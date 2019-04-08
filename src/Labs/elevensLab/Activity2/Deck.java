package Labs.elevensLab.Activity2;

import java.util.ArrayList;
import java.lang.Math;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including initialize, 
 * shuffle, deal, and check if empty.
 */

public class Deck {
    private ArrayList<Card> cards;    //cards contains all the cards in the deck.
    private int size;            //The number of not-yet-dealt cards. Cards are dealt from the top (highest index) down.

    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        for(int i = 0; i < ranks.length; i++) {
            Card card = new Card(ranks[i], suits[i], values[i]);    //Creates new card by matching the params.
            cards.add(card);
        }
        size = cards.size();    //Sets the size field to the size of the deck.
    }

    //Determines if this deck is empty (no undealt cards).
    public boolean isEmpty() {
        return cards.isEmpty();
    }

    //Accessor method for the number of undealt cards in this deck.
    public int size() {
        return cards.size();
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        //Traverses array from the last position.
        for(int k = cards.size() - 1; k >= 0; k--) {
            int r = (int)(Math.random() * k);    //Randomizes within the array.
            Card temp = cards.get(r);
            cards.set(r, cards.get(k));
            cards.set(k, temp);         //Replaces value at k with value of the temporary holder.
        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        if (isEmpty())
            return null;
        size--;
        Card c = cards.get(size);
        return c;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
