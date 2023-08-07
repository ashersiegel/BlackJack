//Don't forget to include Java Docs!!!
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*; 
import java.awt.Color;

public class Card
{
    private int suit;
    private int rank;
    //don't need anymore because using swing
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET  = "\u001B[0m";


    
    /**This is the paramaterized constructor for a Card
     * 
     * @param s The Suit of the card
     * @param r The Rank of the caed
     **/
    public Card(int s, int r){
        suit = s;
        rank = r;
    }
    /**
     * @return the suit of the card
    **/
    public int getSuit(){
        if(suit == 1){
            return 1;
        }
        else if(suit == 2){
            return 2;
        }
        else if(suit == 3){
            return 3;
        }
        else{
            return 4;
        }
    }
    /**
     * @return the rank of a card
     **/
    public int getRank(){
        return rank;
    }
    /**
     * @return the rank of the card if it is under 0
     * @return a rank of 10 if the card is a face card or ace
    **/
    public int getCardValue(){
        if(rank <= 10 && rank != 1){
            return rank;
        }
        else if(rank == 1){
            return 11;
        }
        else{
            return 10;
        }
    }
    
    public String getPicCard(){
        if(suit == 1){
            if(rank == 1){
                return "🂱";
            }
            else if(this.getRank() == 2){
                return "🂲";
            }
            else if(this.getRank() == 3){
                return "🂳";
            }
            else if(rank == 4){
                return "🂴";
            }
            else if(this.getRank() == 5){
                return "🂵";
            }
            else if(this.getRank() == 6){
                return "🂶";
            }
            else if(this.getRank() == 7){
                return "🂷";
            }
            else if(this.getRank() ==8){
                return "🂸";
            }
            else if(this.getRank() == 9){
                return "🂹";
            }
            else if(this.getRank() == 10){
                return "🂺";
            }
            else if(this.getRank() == 11){
                return "🂻";
            }
            else if(this.getRank() == 12){
                return "🂽";
            }
            else if(this.getRank() == 13){
                return "🂾";
            }
            else{
                return "NOT A REAL CARD: ERROR SUIT 1";
            }
        }
        else if(this.getSuit() == 2){
            if(this.getRank() == 1){
                return "🃑";
            }
            else if(this.getRank() == 2){
                return "🃒";
            }
            else if(this.getRank() == 3){
                return "🃓";
            }
            else if(this.getRank() == 4){
                return "🃔";
            }
            else if(this.getRank() == 5){
                return "🃕";
            }
            else if(this.getRank() == 6){
                return "🃖";
            }
            else if(this.getRank() == 7){
                return "🃗";
            }
            else if(this.getRank() == 8){
                return "🃘";
            }
            else if(this.getRank() == 9){
                return "🃙";
            }
            else if(this.getRank() == 10){
                return "🃚";
            }
            else if(this.getRank() == 11){
                return "🃛";
            }
            else if(this.getRank() == 12){
                return "🃝";
            }
            else if(this.getRank() == 13){
                return "🃞";
            }
            else{
                return "NOT A REAL CARD: ERROR SUIT 2";
            }
        }
        else if(this.getSuit() == 3){
            if(this.getRank() == 1){
                return "🃁";
            }
            else if(this.getRank() == 2){
                return "🃂";
            }
            else if(this.getRank() == 3){
                return "🃃";
            }
            else if(this.getRank() == 4){
                return "🃄";
            }
            else if(this.getRank() == 5){
                return "🃅";
            }
            else if(this.getRank() == 6){
                return "🃆";
            }
            else if(this.getRank() == 7){
                return "🃇";
            }
            else if(this.getRank() ==8){
                return "🃈";
            }
            else if(this.getRank() == 9){
                return "🃉";
            }
            else if(this.getRank() == 10){
                return "🃊";
            }
            else if(this.getRank() == 11){
                return "🃋";
            }
            else if(this.getRank() == 12){
                return "🃍";
            }
            else if(this.getRank() == 13){
                return "🃎";
            }
            else{
                return "NOT A REAL CARD: ERROR SUIT 3";
            }
        }
        else if(this.getSuit() == 4){
            if(this.getRank() == 1){
                return "🂱";
            }
            else if(this.getRank() == 2){
                return "🂲";
            }
            else if(this.getRank() == 3){
                return "🂳";
            }
            else if(this.getRank() == 4){
                return "🂴";
            }
            else if(this.getRank() == 5){
                return "🂵";
            }
            else if(this.getRank() == 6){
                return "🂶";
            }
            else if(this.getRank() == 7){
                return "🂷";
            }
            else if(this.getRank() == 8){
                return "🂸";
            }
            else if(this.getRank() == 9){
                return "🂹";
            }
            else if(this.getRank() == 10){
                return "🂺";
            }
            else if(this.getRank() == 11){
               return "🂻"; 
            }
            else if(this.getRank() == 12){
                return "🂽";
            }
            else if(this.getRank() == 13){
                return "🂾";
            }
            else{
                return "NOT A REAL CARD: ERROR SUIT 4";
            }
        }
        else{
            return "NOT A REAL CARD: ERROR NOT A REAL SUIT";
        }
    }
    /**
     * @return the card if it is 10 or under
     * @return the first letter of a face card, that is the rank of the card is over 10
    **/
    public String getName(){
        if(rank <= 10 && rank != 1){
            return "" + rank;
        }
        else if(rank == 1){
            return "A";
        }
        else{
            if(rank == 11){
                return "J";
            }
            else if(rank == 12){
                return "Q";
            }
            else if(rank == 13){
                return "K";
            }
            else{
                return "Not a real Card";
            }
        }
    }
    /**
     * @return the name of the card and the suit of the card
    **/
   public String toString(){
        return this.getPicCard();
    }
}