import java.util.*;
public class Deck
{
    private ArrayList<Card> deck; 
    /**
     *Non paramaterized constructor that creates a deck of 52 cards in order from Ace to King
     **/

    public Deck(){
        deck = new ArrayList<Card>();
        for(int i = 1; i < 5; i++){
            for(int j = 1; j < 14; j++){
                deck.add(new Card(i , j));
            }
        }
    }
    /**
     * This method takes the pre-existing deck and shuffles it by taking a radnom card and adding it to a new ArrayList. Then it sets the old ArrayList to the already shuffled one
     **/

    public void shuffle(){
        int rand = 0;
        ArrayList<Card> dent = new ArrayList<Card>();
        while(deck.size() > 0){
            rand = (int)(Math.random() * deck.size());
            dent.add(deck.get(rand));
            deck.remove(rand);
        }
        deck = dent;
    }
    /**
     * creates a new card object as a placeholder for the first card in the deck
     * @return the first card in the deck 
     * 
     **/
    public Card drawCardFromDeck(){
        Card first = new Card(1, 1);
        first = deck.get(0);
        deck.remove(0);
        return first;
        
    }
    /**
     * @return the deck of 52 cards
     **/

    public ArrayList<Card> getList(){
        return deck;
    }
    /**
     * @return the deck in String format and not ArrayList format
     **/
    public String toString(){
        String bad = "";
        for(int i = 0; i < deck.size(); i++){
            bad += deck.get(i) + "  ";
        }
        return bad;
    }
}