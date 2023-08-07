import java.util.*;
import java.util.Scanner;
public class Hand
{
    private ArrayList<Card> hand;
    
   /**
    * This nonparamaterized constructor creates an ArrayList of card objects
    **/
    public Hand(){
        hand = new ArrayList<Card>();
    }
    
    /**
     * @param Card c is a card from te top of the deck that will be added to the player's hand
     **/
    public void addCardToHand(Card c){
        hand.add(c);
    }
    
    /**
     * This void method resets the players hand, which will most likely occur after a hand ends
     **/
    public void resetHand(){
        hand = new ArrayList<Card>();
    }
    /**
     * @return true if the hand value is 21 and there are only two cards in the deck
     * @return false if the hand value is not 21 and/or there are not two cards in the hand
     **/
    
    public boolean isBlackJack(){
        int sum = 0;
        for(int i = 0; i < 2; i++){
            sum += hand.get(i).getCardValue();
        }
        if(sum == 21){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @return true if the value of the current cards in the hand is greater than 21
     * @return false if the value of the current cards in the hand is under 21
     **/
    public boolean isBust(){
        if(this.getHandValue() > 21){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * @return the size of the hand
     **/
    public int getHandSize(){
        return hand.size();
    }
    /**
     * @return -1 if the value of the hand is over 21 the return value is -1
     * @return the numberic value of the cards in the players hand
     **/
    public int getHandValue(){
        int sum = 0;
        for(int i = 0; i < hand.size(); i++){
            sum += hand.get(i).getCardValue();
        }
        for(int i = 0; i < hand.size(); i++){
            if(sum > 21){
                if(hand.get(i).getCardValue() == 11){
                    sum -= 10;
                }
            }
        }
        return sum;
    }
    /**
     * @return true if the number of cards in the current hand is at least 5 and the total value of those five cards is under 21
     * @return false if the number of cards in the current hand is over 21 and/or the total size of the hand in less than 5
     **/
    public boolean isFiveCardCharlie(){
        if(this.getHandSize() >= 5){
            if(this.getHandValue() < 21){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public ArrayList<Card> handList(){
        return hand;
    }
    /**
     * @return a statement that says there are no cards in the hand, value and hand size as 0, along with black jack, bust, and five crd charlie as N/A if there aren't any cards in the current hand
     * @return the card objects in the current player's hand, the value of the current hand, the size of the current hand, if the current hand has black jack, if the current hand has busted, and if the current hand has a five card charlie
     **/
    public String toString(){
        String play = "";
        String zimmerman = "";
            if(this.hand.size() == 0){
               zimmerman = "[No cards in current hand]\n\nValue: 0" + "\nHand Size: 0" + "\nBlack Jack: N/A"  + "\nBust: N/A"  + "\nFive Card Charlie: N/A";
               return zimmerman; 
            }
            else{
                for(int i = 0; i < hand.size(); i++){
                    play += hand.get(i) + "  ";
                }
                play += "\nValue: " + getHandValue() + "\nHand Size: " + getHandSize() + "\nBlack Jack: " + isBlackJack() + "\nBust: " + isBust() + "\nFive Card Charlie: " + isFiveCardCharlie();
                return play;
            }
        }
}