import java.util.*;
public class Player
{
   private Hand cove;
   private String name;
   private int bankroll = 0;
   private int currentBet = 0;
   
   public Player(int bank, String theName){
       name = theName;
       bankroll = bank;
       cove = new Hand();
   }
   public void addCardToPlayerHand(Card c){
       cove.addCardToHand(c);
   }
   public ArrayList<Card> getPlayerHand(){
       return cove.handList();
   }
   public boolean playerBust(){
       if(cove.isBust()){
           return true;
       }
       else{
           return false;
       }
   }
   public void resetPlayerHand(){
       cove.resetHand();
   }
   public int getPlayerHandValue(){
       return cove.getHandValue();
   }
   public int getPlayerHandSize(){
       return cove.getHandSize();
   }
   public int getCardValue(int n){
       return this.coveList().get(n).getCardValue();
   }
   public ArrayList<Card> coveList(){
       return cove.handList();
   }
   public String toString(){
       String bet = "\n";
       bet = name + "'s Hand: ";
       for(int i = 0; i < this.getPlayerHandSize(); i++){
           bet += this.getPlayerHand().get(i) + " ";
       }
       bet += "\n" + name + "'s Hand Value: " + this.getPlayerHandValue();
       return bet;
   }
}