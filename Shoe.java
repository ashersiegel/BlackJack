import java.util.*;
public class Shoe
{
    private ArrayList<Card> shoe;
    private int totalCards;
    private int numCards;
    
    /**
     *@param number of decks is going to be in the shoe
     *52 cards in each deck from Ace to King
     **/
    public Shoe(int num){
        shoe = new ArrayList<Card>();
        totalCards = 0;
        for(int m = 0; m < num; m++){
            for(int i = 1; i < 5; i++){
                for(int j = 1; j < 14; j++){
                    shoe.add(new Card(i, j));
                    numCards++;
                }
            }
        }
    }
    /**
     *this nonparamaterized construtor creates an ArrayList and sets the instance varible totalCards to 0, this is used for when I need to create a new shoe in the show class 
     **/
    public Shoe(){
        shoe = new ArrayList<Card>();
        totalCards = 0;
    }
    /**
     *This void method makes a new ArrayList as a placeholder while taking a random card from the pre-existing deck, adding it to the placeholder deck then removing it. FInally reassigning the old deck to the placeholder deck
     **/
    public void shuffleShoe(){
        int rand = 0;
        ArrayList<Card> hold = new ArrayList<Card>();
        while(shoe.size() > 0){
            rand = (int)(Math.random() * shoe.size());
            hold.add(shoe.get(rand));
            shoe.remove(rand);
        }
        shoe = hold;
    }
    /**
     *This void method creates a new object and makes it identical to the preexisting shoe
     * It then chekcs to see if the card is equal to or past halfway
     * If it is then it it shuffles the new instance of shoe then sets shoe to the new shuffled shoe
     **/
    public void reshuffleShoe(){
        Shoe nip = new Shoe();
        int set = numCards / 52;
        for(int m = 0; m < set; m++){
            for(int i = 1; i < 5; i++){
                for(int j = 1; j < 14; j++){
                    nip.list().add(new Card(i, j));
                }
            }
        }
        int temp = (int)(numCards * 0.5);
        if(totalCards >= temp){
            nip.shuffleShoe();
            shoe = nip.list();
        }
    }
    /**
     *@return the first card from the shoe 
     * removes the first card fron the shoe so it is updated
     **/
    public Card drawCardFromShoe(){
        Card fat = new Card(1, 1);
        fat = shoe.get(0);
        shoe.remove(0);
        totalCards++;
        return fat;
    }
    /**
     *@return the shoe in ArrayList format 
     **/
    public ArrayList<Card> list(){ 
        return shoe;
    }
    /**
     *@return the number of current cards in the shoe
     *@return a String of all of the cards in the shoe by iterating through a for loop of the shoe's length
     **/
    public String toString(){
        String cheese = "";
        for(int i = 0; i < shoe.size(); i++){
            cheese += shoe.get(i) + "  ";
        }
        return "Your deck has: " + shoe.size() + " Cards\n\n" + cheese;
    }
}