import java.util.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.io.*;

public class Dealer extends JPanel implements ActionListener
{
    private JFrame openingFrame;
    private JFrame secondFrame;
    private JPanel startingPanel;
    private JPanel secondPanel;
    private JLabel welcome;
    private JLabel enterBankroll;
    private JLabel enterFirstHand;
    private JTextField enterName;
    private JTextField enterFirstAmount;
    private JButton submitName;
    private JButton submitBankroll;
    private JLabel submitFirstHand;
    private JTextField everyMoneyHand;
    private JLabel char1;
    private JLabel char2;
    private JLabel char3;
    private JLabel char4;
    private JButton char1pic;
    private JButton char2pic;
    private JButton char3pic;
    private JButton char4pic;
    private JLabel charEnter;
    private JButton advanceFirst;
    private JTextField bankrollEnter;
    private JTextField firstHandEnter;
    private JButton bankrollButton;
    private JButton firstHandButton;
    private JLabel describeBankroll;
    private JLabel describeFirstHand; 
    private JButton advanceSecond;
    private JLabel secondTitle;
    private JLabel nextSecond;
    private JLabel topCards;
    private JLabel bottomCards;
    private JLabel characterLabel;
    private JLabel characterPicture;
    private JLabel trickName;
    private JLabel trickCharacter;
    private JLabel trickBankroll;
    private JLabel trickFirstHand;
    private JButton red;
    private JButton orange;
    private JButton yellow;
    private JButton green;
    private JButton blue;
    private JButton purple;
    private JButton grey;
    private JButton black;
    private JPanel gamePanel;
    private JTextField enterHandAmnt;
    private JButton handSubmit;
    private JLabel handDescription;
    private JLabel mainWelcome;
    private JLabel testFeature;
    private JLabel playerHand;
    private JLabel dealerHand;
    private JButton hitButton;
    private JButton stayButton;
    private JButton doubleDownButton;
    private JLabel playerHandValue;
    private JLabel dealerHandValue;
    private JLabel gameDecision;
    private JLabel endGame;
    private JButton yesButton;
    private JButton noButton;
    private JButton quitButton;
    private JButton startNewGameButton;
    private JLabel endGame1;
    private JLabel questionGame;
    private JLabel characterColor;
    private JLabel topBox;
    private JLabel bottomBox;
    private JLabel topBankroll;
    private JLabel bottomBankroll;
    private JLabel trickColor;
    private JLabel trickHand;
    private JLabel characterDisplay;
    private JLabel yourCharacter;
    private JLabel trickUnder;
    private JLabel bigBorder;
    private JLabel smallBorder;
    private JLabel colorc;
    //private JLabel characterPicture;
    private JLabel noMoney;
    private JButton noMoneyOne;
    private JButton noMoneyTwo;
    private JTextField noMoneyEnter;
    private JButton noMoneySubmit;
    private JLabel trickAdd;
    

    private int textWidth;
    private int textHeight;
    private int buttonWidth;
    
    private static Game gameA;
    private static Dealer d;
    
    private String playerCharacter = "b";
    private String playerName = "a";
    private String playerCharacterColor = "c";
    
    private int pageNumber = 1;
    private int firstHandAmnt = 0;
    private int everyHandBet = 0;
    private int dWidth = 0;
    private int dHeight = 0;

   
    private Hand dealer;
    private Shoe deck;
    private Player other;
    private boolean isShown;
    private int bankroll = -1;
    private int bet = 0;
    private String name;
    private int count = 0;
    private int dealerCount = 0;
    private int stayCount = 0;
    private int handCount = 1;
    private int doubleCounter = 0;
    private int endCounter = 1;
    private int noCounter = 0;
    private int hitCounter = 0;
    private int stayCounter = 0;

    /**
     * @param game passes an instance of game through and sets it as an instance varible
     * This metod sets all of the labels, panels, frames, buttons, and textfields as something, since they are already delcared and not initalized
     **/
   public Dealer(Game g){
       dealer = new Hand();
       deck = new Shoe(5);
       deck.shuffleShoe();
       other = new Player(bankroll, playerName);
       gameA = g;
       
        openingFrame = new JFrame();
        secondFrame = new JFrame();
        startingPanel = new JPanel();
        enterName = new JTextField("                             ");
        enterBankroll = new JLabel("Now enter how much money you'd like to play with(bankroll): ");
        welcome = new JLabel("♠♦️️Welcome to Asher's Casino!♣️♥️");
        JLabel rule = new JLabel("Rules:");
        JLabel rule1 = new JLabel("Dealer stays on 17 or over");
        JLabel rule2 = new JLabel("Black jack pays 3:2");
        JLabel rule3 = new JLabel("The shoe contains 5 decks, so some cards may repeat");
        JLabel rule4 = new JLabel("If you choose to see the next card, it gets burned");
        JLabel rule5 = new JLabel("Please enter your name: ");
        JLabel chchar = new JLabel("Please choose your character");
        char1 = new JLabel("Character 1");
        char1pic = new JButton("😡");
        char2 = new JLabel("Character 2");
        char2pic = new JButton("😶");
        char3 = new JLabel("Character 3");
        char3pic = new JButton("😎");
        char4 = new JLabel("Character 4");
        char4pic = new JButton("😯");
        charEnter = new JLabel("Please Select A Character");
        advanceFirst = new JButton("➜");
        enterFirstHand = new JLabel();
        enterFirstAmount = new JTextField();
        submitName = new JButton("Enter");
        submitBankroll = new JButton();
        submitFirstHand = new JLabel();
        everyMoneyHand = new JTextField("");
        secondPanel = new JPanel();
        secondTitle = new JLabel("♠♦️️Welcome to Asher's Casino!♣️♥️");
        bankrollEnter = new JTextField();
        firstHandEnter = new JTextField();
        advanceSecond = new JButton("➜");
        bankrollButton = new JButton("Enter");
        firstHandButton = new JButton("Enter");
        describeBankroll = new JLabel("How much money would you like to play with?(Bankroll)");
        describeFirstHand = new JLabel("How much money would you like to place on the first hand?");
        nextSecond = new JLabel("Advance to game");
        gamePanel = new JPanel();
        topCards = new JLabel("🂡🂢🂣🂤🂥🂦🂧🂨🂩🂪🂫🂭🂮🃑🃒🃓🃔🃕🃖🃗🃘🃙🃚🃛🃝🃞");
        bottomCards = new JLabel("🃁🃂🃃🃄🃅🃆🃇🃈🃉🃊🃋🃍🃎🂱🂲🂳🂴🂵🂶🂷🂸🂹🂺🂻🂽🂾");
        characterLabel = new JLabel("Your character");
        trickName = new JLabel("Please enter a name before advancing!");
        trickCharacter = new JLabel("Please selcect a character before advancing!");
        trickBankroll = new JLabel("Please enter a valid bankroll (1-2,147,483,647)");
        trickColor = new JLabel("Please select a character color before advancing!");
        trickHand = new JLabel("");
        trickAdd = new JLabel("Please enter a valid number (1-2,147,483,647)");
        red = new JButton("Red");
        orange = new JButton("Orange");
        yellow = new JButton("Yellow");
        green = new JButton("Green");
        blue = new JButton("Blue");
        purple = new JButton("Purple");
        grey = new JButton("Grey");
        black = new JButton("Black");
        characterColor = new JLabel("Please select a color for your character");
        enterHandAmnt = new JTextField();
        handSubmit = new JButton("Enter");
        handDescription = new JLabel("Please enter how much money you'd like to place on this hand");
        mainWelcome = new JLabel("♠♦️️Asher's Gambling Room♣️♥️");
        testFeature = new JLabel("TEST TEST TEST TEST");
        playerHand = new JLabel("");
        dealerHand = new JLabel("");
        playerHandValue = new JLabel("");
        dealerHandValue = new JLabel("");
        hitButton = new JButton("Hit");
        stayButton = new JButton("Stay");
        doubleDownButton = new JButton("Double Down");
        gameDecision = new JLabel("");
        yesButton = new JButton("Yes");
        noButton = new JButton("No");
        quitButton = new JButton("Quit");
        startNewGameButton = new JButton("Start New Game");
        endGame = new JLabel("Thanks For Playing!");
        endGame1 = new JLabel("See You Soon!");
        questionGame = new JLabel("Would You like to keep playing?");
        topBox = new JLabel("");
        bottomBox = new JLabel("");
        topBankroll = new JLabel("");
        bottomBankroll = new JLabel("");
        characterDisplay = new JLabel("");
        yourCharacter = new JLabel("ERROR");
        trickUnder = new JLabel("");
        bigBorder = new JLabel("");
        smallBorder = new JLabel("");
        colorc = new JLabel("");
        characterPicture = new JLabel("");
        noMoney = new JLabel("Would you like to add more money?");
        noMoneyOne = new JButton("Yes");
        noMoneyTwo = new JButton("No");
        noMoneySubmit = new JButton("Enter");
        noMoneyEnter = new JTextField("                             ");
        setFrame();
        
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 20;
        c.gridheight = 5;
        c.fill = GridBagConstraints.BOTH;
        
        Dimension nameFact = submitName.getPreferredSize();
        Dimension wel = welcome.getPreferredSize();
        Dimension charE = charEnter.getPreferredSize();
        Dimension size = rule.getPreferredSize();
        Dimension size1 = rule1.getPreferredSize();
        Dimension size2 = rule2.getPreferredSize();
        Dimension size3 = rule3.getPreferredSize();
        Dimension size4 = rule4.getPreferredSize();
        Dimension size5 = rule5.getPreferredSize();
        Dimension char1size = char1.getPreferredSize();
        Dimension char1picsize = char1pic.getPreferredSize();
        Dimension char2size = char2.getPreferredSize();
        Dimension char2picsize = char2pic.getPreferredSize();
        Dimension char3size = char3.getPreferredSize();
        Dimension char3picsize = char3pic.getPreferredSize();
        Dimension char4size = char4.getPreferredSize();
        Dimension char4picsize = char4pic.getPreferredSize();
        Dimension textWell = enterName.getPreferredSize();
        Dimension arrowOne = advanceFirst.getPreferredSize();
        Dimension tc = trickCharacter.getPreferredSize();
        Dimension tn = trickName.getPreferredSize();
        
        
        Dimension st = welcome.getPreferredSize();
        Dimension advanceSecondSize = advanceSecond.getPreferredSize();
        Dimension firstHandEnterSize = firstHandEnter.getPreferredSize();
        Dimension bankrollEnterSize = bankrollEnter.getPreferredSize();
        Dimension firstHandButtonSize = firstHandButton.getPreferredSize();
        Dimension bankrollButtonSize = bankrollButton.getPreferredSize();
        Dimension describeBankrollSize = describeBankroll.getPreferredSize();
        Dimension describeFirstHandSize = describeFirstHand.getPreferredSize();
        
        startingPanel.add(welcome);
        startingPanel.add(rule);
        startingPanel.add(rule1);
        startingPanel.add(rule2);
        startingPanel.add(rule3);
        startingPanel.add(rule4);
        startingPanel.add(rule5);
        startingPanel.add(enterName);
        startingPanel.add(char1);
        startingPanel.add(char1pic);
        startingPanel.add(char2);
        startingPanel.add(char2pic);
        startingPanel.add(char3);
        startingPanel.add(char3pic);
        startingPanel.add(char4);
        startingPanel.add(char4pic);
        startingPanel.add(charEnter);
        startingPanel.add(submitName);
        startingPanel.add(advanceFirst);
        startingPanel.add(trickCharacter);
        startingPanel.add(trickName);
        trickName.setVisible(false);
        trickCharacter.setVisible(false);
        
        welcome.setBounds(113, 10, wel.width, wel.height);
        rule.setBounds(210, 50, size.width, size.height);
        rule1.setBounds(132, 70, size1.width, size1.height);
        rule2.setBounds(161, 90, size2.width, size2.height);
        rule3.setBounds(40, 110, size3.width, size3.height);
        rule4.setBounds(60, 130, size4.width, size4.height);
        rule5.setBounds(145, 160, size5.width, size5.height);
        enterName.setBounds(133, 180, textWell.width, textWell.height);
        submitName.setBounds(260, 180, nameFact.width, textWell.height);
        char1.setBounds(110, 240, char1size.width, char1size.height);
        char2.setBounds(280, 240, char2size.width, char2size.height);
        char3.setBounds(110, 297, char3size.width, char3size.height);
        char4.setBounds(280, 297, char4size.width, char4size.height);
        char1pic.setBounds(120, 257, char1picsize.width + 13, char1picsize.height + 10);
        char2pic.setBounds(290, 257, char2picsize.width + 13, char2picsize.height + 10);
        char3pic.setBounds(120, 312, char3picsize.width + 13, char3picsize.height + 10);
        char4pic.setBounds(290, 312, char4picsize.width + 13, char4picsize.height + 10);
        charEnter.setBounds(142, 208, charE.width, charE.height);
        advanceFirst.setBounds(400, 322, arrowOne.width, arrowOne.height);
        trickCharacter.setBounds(140, 362, tc.width + 150, tc.height);
        trickName.setBounds(180, 347, tc.width + 150, tc.height);
        
        enterName.setText("");
        bankrollEnter.setText("");
        firstHandEnter.setText("");
        enterHandAmnt.setText("");
        noMoneyEnter.setText("");
        
        textWidth = textWell.width;
        textHeight = textWell.height;
        buttonWidth = nameFact.width;
        
        
        enterName.addActionListener(this);
        enterFirstAmount.addActionListener(this);
        submitName.addActionListener(this);
        submitBankroll.addActionListener(this);
        char1pic.addActionListener(this);
        char2pic.addActionListener(this);
        char3pic.addActionListener(this);
        char4pic.addActionListener(this);
        advanceFirst.addActionListener(this);
        
        bankrollEnter.addActionListener(this);
        firstHandEnter.addActionListener(this);
        bankrollButton.addActionListener(this);
        firstHandButton.addActionListener(this);
        advanceSecond.addActionListener(this);
        
        red.addActionListener(this);
        orange.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        purple.addActionListener(this);
        grey.addActionListener(this);
        black.addActionListener(this);
        
        handSubmit.addActionListener(this);
        enterHandAmnt.addActionListener(this);
        
        hitButton.addActionListener(this);
        stayButton.addActionListener(this);
        doubleDownButton.addActionListener(this);
        
        quitButton.addActionListener(this);
        yesButton.addActionListener(this);
        noButton.addActionListener(this);
        startNewGameButton.addActionListener(this);
        noMoneyOne.addActionListener(this);
        noMoneyTwo.addActionListener(this);
        noMoneySubmit.addActionListener(this);
        
        welcome.setFont(new Font("Plain", Font.BOLD, 12));
        welcome.setForeground(new Color(158, 0, 0));
        rule5.setForeground(new Color(0, 128, 0));
        rule.setFont(new Font("Monochrome", Font.BOLD, 12));
        rule1.setForeground(new Color(115, 115, 115));
        rule2.setForeground(new Color(115, 115, 115));
        rule3.setForeground(new Color(115, 115, 115));
        rule4.setForeground(new Color(115, 115, 115));
        charEnter.setForeground(new Color(0, 128, 0));
        trickName.setForeground(new Color(158, 0, 0));
        trickCharacter.setForeground(new Color(158, 0, 0));
       
        char1pic.setFont(new Font("Plain", Font.PLAIN, 22));
        char2pic.setFont(new Font("Plain", Font.PLAIN, 22));
        char3pic.setFont(new Font("Plain", Font.PLAIN, 22));
        char4pic.setFont(new Font("Plain", Font.PLAIN, 22));
        advanceFirst.setFont(new Font("Plain", Font.PLAIN, 12));
        advanceSecond.setFont(new Font("Plain", Font.PLAIN, 12));
        
        char1pic.setForeground(new Color(0, 0, 0));
        char2pic.setForeground(new Color(0, 0, 0));
        char3pic.setForeground(new Color(0, 0, 0));
        char4pic.setForeground(new Color(0, 0, 0));
   }
   /**
    * This method sets the components for each screen as they change
    * for example, if the page is equal to one, then the compontes on the first screen will appear
    * 
    */
   public void setFrame(){
        if(pageNumber == 1){
            openingFrame.setVisible(true);
            startingPanel.setVisible(true);
            secondPanel.setVisible(false);
            gamePanel.setVisible(false);
            openingFrame.add(startingPanel, BorderLayout.PAGE_START);
            openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            startingPanel.setPreferredSize(new Dimension(479, 420)); 
            startingPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            openingFrame.pack();
            startingPanel.setLayout(null);
            startingPanel.add(Box.createVerticalGlue());
            startingPanel.revalidate();
            startingPanel.repaint();
        }
        else if(pageNumber == 2){
            startingPanel.setVisible(false);
            secondPanel.setVisible(true);
            gamePanel.setVisible(false);
            openingFrame.add(secondPanel, BorderLayout.PAGE_START);
            openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            secondPanel.setPreferredSize(new Dimension(479, 420)); 
            secondPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            openingFrame.pack();
            secondPanel.setLayout(null);
            secondPanel.add(Box.createVerticalGlue());
            secondPanel.revalidate();
            secondPanel.repaint();

            characterPicture.setText(getPlayerCharacter());
            colorc.setText("Choose a color for your character");
            
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = 20;
            c.gridheight = 5;
            c.fill = GridBagConstraints.BOTH;
            
            Dimension st = welcome.getPreferredSize();
            Dimension advanceSecondSize = advanceSecond.getPreferredSize();
            Dimension firstHandEnterSize = firstHandEnter.getPreferredSize();
            Dimension bankrollEnterSize = bankrollEnter.getPreferredSize();
            Dimension firstHandButtonSize = firstHandButton.getPreferredSize();
            Dimension bankrollButtonSize = bankrollButton.getPreferredSize();
            Dimension describeBankrollSize = describeBankroll.getPreferredSize();
            Dimension describeFirstHandSize = describeFirstHand.getPreferredSize();
            Dimension sc = nextSecond.getPreferredSize();
            Dimension tc = topCards.getPreferredSize();
            Dimension bc = bottomCards.getPreferredSize();
            Dimension cl = characterLabel.getPreferredSize();
            Dimension cp = characterPicture.getPreferredSize();
            Dimension bb = bigBorder.getPreferredSize();
            Dimension sb = smallBorder.getPreferredSize();
            Dimension r = red.getPreferredSize();
            Dimension o = orange.getPreferredSize();
            Dimension y = yellow.getPreferredSize();
            Dimension g = green.getPreferredSize();
            Dimension b = blue.getPreferredSize();
            Dimension p = purple.getPreferredSize();
            Dimension gr = grey.getPreferredSize();
            Dimension bl = black.getPreferredSize();
            Dimension co = colorc.getPreferredSize();
            
            secondPanel.add(secondTitle);
            secondPanel.add(advanceSecond);
            secondPanel.add(bankrollEnter);
            secondPanel.add(bankrollButton);
            secondPanel.add(describeBankroll);
            secondPanel.add(nextSecond);
            secondPanel.add(topCards);
            secondPanel.add(bottomCards);
            secondPanel.add(characterLabel);
            secondPanel.add(characterPicture);
            secondPanel.add(bigBorder);
            secondPanel.add(smallBorder);
            secondPanel.add(red);
            secondPanel.add(orange);
            secondPanel.add(yellow);
            secondPanel.add(green);
            secondPanel.add(blue);
            secondPanel.add(purple);
            secondPanel.add(grey);
            secondPanel.add(black);
            secondPanel.add(colorc);
            secondPanel.add(trickBankroll);
            secondPanel.add(trickColor);

            secondTitle.setBounds(115, 10, st.width, st.height);
            advanceSecond.setBounds(400, 305, advanceSecondSize.width, advanceSecondSize.height);
            firstHandEnter.setBounds(143, 185, textWidth, textHeight);
            bankrollEnter.setBounds(140, 104, textWidth, textHeight);
            firstHandButton.setBounds(275, 185, buttonWidth, textHeight);
            bankrollButton.setBounds(267, 104, buttonWidth, textHeight);
            describeBankroll.setBounds(35, 81, describeBankrollSize.width, describeBankrollSize.height);
            describeFirstHand.setBounds(20, 162, describeFirstHandSize.width, describeFirstHandSize.height);
            nextSecond.setBounds(402, 333, sc.width, sc.height);
            topCards.setBounds(65, 35, tc.width + 90, tc.height + 10);
            bottomCards.setBounds(65, 145, bc.width + 90, bc.height + 10);
            characterLabel.setBounds(8, 207, cl.width, cl.height);
            characterPicture.setBounds(11, 212, cp.width + 100, cp.height + 100);
            bigBorder.setBounds(5, 205, bb.width + 110, bb.height + 105);
            smallBorder.setBounds(5, 205, sb.width + 110, sb.height + 20);
            trickBankroll.setBounds(60, 285, 350, 100);
            trickColor.setBounds(45, 270, 370, 100);
            
            bigBorder.setVisible(true);
            smallBorder.setVisible(true);
            red.setVisible(true);
            orange.setVisible(true);
            yellow.setVisible(true);
            green.setVisible(true);
            blue.setVisible(true);
            purple.setVisible(true);
            grey.setVisible(true);
            black.setVisible(true);
            colorc.setVisible(true);
            advanceSecond.setVisible(true);
            
            colorc.setBounds(135, 180, co.width + 100, co.height);
            red.setBounds(125, 205, r.width, r.height);
            orange.setBounds(200, 205, o.width, o.height);
            yellow.setBounds(305, 205, y.width, y.height);
            green.setBounds(125, 240, g.width, g.height);
            blue.setBounds(220, 240, b.width, b.height);
            purple.setBounds(305, 240, p.width, p.height);
            grey.setBounds(175, 275, gr.width, gr.height);
            black.setBounds(260, 275, bl.width, bl.height);
            
            
            bigBorder.setBorder(new LineBorder(Color.black));
            smallBorder.setBorder(new LineBorder(Color.black));
            
            trickColor.setVisible(false);
            trickBankroll.setVisible(false);
            
            nextSecond.setText("Game");
            
            secondTitle.setFont(new Font("Plain", Font.PLAIN, 15));
            topCards.setFont(new Font("Plain", Font.BOLD, 13));
            bottomCards.setFont(new Font("Plain", Font.BOLD, 13));
            bottomCards.setForeground(new Color(158, 0, 0));
            trickColor.setForeground(new Color(158, 0, 0));
            trickBankroll.setForeground(new Color(158, 0, 0));
            secondTitle.setFont(new Font("Plain", Font.BOLD, 12));
            secondTitle.setForeground(new Color(158, 0, 0));
            describeFirstHand.setForeground(new Color(0, 140, 0));
            describeBankroll.setForeground(new Color(0, 140, 0));
            characterPicture.setFont(new Font("Plain", Font.BOLD, 90));
            bigBorder.setFont(new Font("Plain", Font.BOLD, 20));
            smallBorder.setFont(new Font("Plain", Font.BOLD, 20));
            
        }
        else if(pageNumber == 3){
            startingPanel.setVisible(false);
            secondPanel.setVisible(false);
            gamePanel.setVisible(true);
            openingFrame.add(gamePanel, BorderLayout.PAGE_START);
            openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            gamePanel.setPreferredSize(new Dimension(479, 420)); 
            gamePanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            openingFrame.pack();
            gamePanel.setLayout(null);
            gamePanel.add(Box.createVerticalGlue());
            gamePanel.revalidate();
            gamePanel.repaint();
            gamePanel.add(handDescription);
            gamePanel.add(enterHandAmnt);
            gamePanel.add(handSubmit);
            gamePanel.add(mainWelcome);
            
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = 20;
            c.gridheight = 5;
            c.fill = GridBagConstraints.BOTH;
            
            Dimension handD = handDescription.getPreferredSize();
            Dimension handA = enterHandAmnt.getPreferredSize();
            Dimension handS = handSubmit.getPreferredSize();
            Dimension mainW = mainWelcome.getPreferredSize();
            
            handDescription.setBounds(12, 31, handD.width + 200, handD.height);
            enterHandAmnt.setBounds(150, 53, textWidth, textHeight);
            handSubmit.setBounds(275, 53, buttonWidth, textHeight);
            mainWelcome.setBounds(80, 5, mainW.width + 200, mainW.height + 10);
            
            mainWelcome.setFont(new Font("Plain", Font.PLAIN, 20));
            mainWelcome.setForeground(new Color(158, 0, 0));
            handDescription.setForeground(new Color(0, 140, 0));
        }
    }
    /**
     * The add ToScreen method does something similar to the setScreen method
     * When the count is less than one, which means that there is no user activiy,
     * the correct buttons and labels will display
     * 
     * If the dealer or the player have blackjack, the it automatically displays the cards, advancing to the next hand
     */
    
    public void addToScreen(){
        if(count < 1){
            deck.reshuffleShoe();
            this.dealStartHand();
            gamePanel.add(playerHand);
            gamePanel.add(dealerHand);
            gamePanel.add(playerHandValue);
            gamePanel.add(dealerHandValue);
            gamePanel.add(hitButton);
            gamePanel.add(stayButton);
            gamePanel.add(doubleDownButton);
            gamePanel.add(gameDecision);
            gamePanel.add(yesButton);
            gamePanel.add(noButton);
            gamePanel.add(quitButton);
            gamePanel.add(endGame);
            gamePanel.add(endGame1);
            gamePanel.add(questionGame);
            gamePanel.add(topBox);
            gamePanel.add(bottomBox);
            gamePanel.add(topBankroll);
            gamePanel.add(bottomBankroll);
            gamePanel.add(characterDisplay);
            gamePanel.add(yourCharacter);
            gamePanel.add(noMoney);
            gamePanel.add(noMoneyOne);
            gamePanel.add(noMoneyTwo);
            gamePanel.add(noMoneySubmit);
            gamePanel.add(noMoneyEnter);
            gamePanel.add(trickAdd);
            
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;
            c.gridwidth = 20;
            c.gridheight = 5;
            c.fill = GridBagConstraints.BOTH;
            
            Dimension playerH = playerHand.getPreferredSize();
            Dimension dealerH = dealerHand.getPreferredSize();
            Dimension playerHv = playerHandValue.getPreferredSize();
            Dimension dealerHv = dealerHandValue.getPreferredSize();
            Dimension hitB = hitButton.getPreferredSize();
            Dimension stayB = stayButton.getPreferredSize();
            Dimension doubleD = doubleDownButton.getPreferredSize();
            Dimension yesB = yesButton.getPreferredSize();
            Dimension noB = noButton.getPreferredSize();
            Dimension gameD = gameDecision.getPreferredSize();
            Dimension quitB = quitButton.getPreferredSize();
            Dimension startN = startNewGameButton.getPreferredSize();
            Dimension endG = endGame.getPreferredSize();
            Dimension endG1 = endGame1.getPreferredSize();
            Dimension questionG = questionGame.getPreferredSize();
            Dimension topB = topBox.getPreferredSize();
            Dimension bottomB = bottomBox.getPreferredSize();
            Dimension bankrollT = topBankroll.getPreferredSize();
            Dimension bankrollB = bottomBankroll.getPreferredSize();
            Dimension n = noMoneyEnter.getPreferredSize();
            Dimension n2 = noMoneySubmit.getPreferredSize();
            
            dWidth = dealerH.width;
            dHeight = dealerH.height;
            
            playerHand.setSize(260, 70);
            dealerHand.setSize(260, 70);
            playerHandValue.setSize(250, 100);
            dealerHandValue.setSize(250, 100);
            hitButton.setSize(hitB.width, hitB.height);
            stayButton.setSize(stayB.width, stayB.height);
            doubleDownButton.setSize(doubleD.width, doubleD.height);
            yesButton.setSize(yesB.width, yesB.height);
            noButton.setSize(noB.width, noB.height);
            noMoney.setSize(300, 30);
            noMoneyOne.setSize(yesB.width, yesB.height);
            noMoneyTwo.setSize(noB.width, noB.height);
            noMoneySubmit.setSize(buttonWidth, textHeight);
            gameDecision.setSize(370, 20);
            quitButton.setSize(quitB.width, quitB.height);
            startNewGameButton.setSize(n2.width, n2.height);
            endGame.setSize(300, 30);
            endGame1.setSize(300, 30);
            questionGame.setSize(250, 25);
            topBox.setSize(topB.width + 256, topB.height + 54);
            bottomBox.setSize(bottomB.width + 256, bottomB.height + 54);
            topBankroll.setSize(200, 20);
            bottomBankroll.setSize(100, 20);
            characterDisplay.setSize(100, 200);
            yourCharacter.setSize(200, 200);
            trickAdd.setSize(350, 20);
            
            noMoneyEnter.setBounds(152, 335, textWidth, textHeight);
            
            playerHand.setLocation(130, 199);
            dealerHand.setLocation(130, 99);
            playerHandValue.setLocation(165, 225);
            dealerHandValue.setLocation(165, 125);
            hitButton.setLocation(195, 315);
            stayButton.setLocation(245, 315);
            doubleDownButton.setLocation(190, 341);
            yesButton.setLocation(185, 340);
            noButton.setLocation(250, 340);
            noMoney.setLocation(117, 307);
            noMoneyOne.setLocation(190, 340);
            noMoneyTwo.setLocation(252, 340);
            noMoneySubmit.setLocation(282, 335);
            gameDecision.setLocation(210, 300);
            quitButton.setLocation(280, 370);
            startNewGameButton.setLocation(130, 370);
            endGame.setLocation(100, 150);
            endGame1.setLocation(142, 180);
            questionGame.setLocation(135, 315);
            topBox.setLocation(130, 108);
            bottomBox.setLocation(130, 208);
            topBankroll.setLocation(10, 250);
            bottomBankroll.setLocation(10, 270);
            characterDisplay.setLocation(48, -7);
            yourCharacter.setLocation(8, -36);
            trickAdd.setLocation(98, 358);
            
            gamePanel.add(Box.createHorizontalGlue());
            gamePanel.add(Box.createVerticalGlue());
            
            playerHand.setFont(new Font("Plain", Font.PLAIN, 40));
            dealerHand.setFont(new Font("Plain", Font.PLAIN, 40));
            playerHandValue.setFont(new Font("Plain", Font.PLAIN, 15));
            dealerHandValue.setFont(new Font("Plain", Font.PLAIN, 15));
            characterDisplay.setFont(new Font("Plain", Font.PLAIN, 35));
            topBankroll.setForeground(new Color(0, 128, 0));
            bottomBankroll.setForeground(new Color(0, 128, 0));
            topBankroll.setFont(new Font("Plain", Font.PLAIN, 18));
            bottomBankroll.setFont(new Font("Plain", Font.PLAIN, 18));
            endGame.setFont(new Font("Plain", Font.PLAIN, 30));
            endGame1.setFont(new Font("Plain", Font.PLAIN, 30));
            noMoney.setForeground(new Color(0, 128, 0));
            trickAdd.setForeground(new Color(158, 0, 0));
            topBox.setBorder(new LineBorder(Color.black));
            bottomBox.setBorder(new LineBorder(Color.black));
            
            endGame.setForeground(new Color(0, 128, 0));
            endGame1.setForeground(new Color(0, 128, 0));
            
            
            playerHand.setVisible(true);
            dealerHand.setVisible(true);
            playerHandValue.setVisible(true);
            dealerHandValue.setVisible(true);
            hitButton.setVisible(true);
            stayButton.setVisible(true);
            doubleDownButton.setVisible(true);
           
            yesButton.setVisible(false);
            noButton.setVisible(false);
            quitButton.setVisible(false);
            startNewGameButton.setVisible(false);
            endGame.setVisible(false);
            gameDecision.setVisible(false);
            endGame.setVisible(false);
            endGame1.setVisible(false);
            questionGame.setVisible(false);
            
            topBox.setVisible(true);
            bottomBox.setVisible(true);
            topBankroll.setVisible(true);
            bottomBankroll.setVisible(true);
            
            characterDisplay.setVisible(true);
            yourCharacter.setVisible(true);
            trickHand.setVisible(false);
            trickUnder.setVisible(false);
            noMoney.setVisible(false);
            noMoneyOne.setVisible(false);
            noMoneyTwo.setVisible(false);
            noMoneyEnter.setVisible(false);
            noMoneySubmit.setVisible(false);
            trickAdd.setVisible(false);
            if(this.dealerBlackJack() || this.playerBlackJack()){
                this.runGame();
                this.throwScreen();
            }
            else{
                this.throwScreen();
            }
            gamePanel.updateUI();
        }
    }
   /**
    * The runGame method not only decides the winners, but also sest the correct labels
    * For example, if the dealer has blackjack then it sets the gameDecision to the dealer has blackjack
    * if the player is ever out of money, then the noMoney buttons and textbox will display, letting the user decide if they want to add more money
    **/
   public void runGame(){
       if(this.dealerBlackJack() && this.playerBlackJack()){
           hitButton.setVisible(false);
           stayButton.setVisible(false);
           doubleDownButton.setVisible(false);
           noMoney.setText("You and the dealer have black jack! You push!");           
           gameDecision.setLocation(87, 300);
           bet = 0;
           this.updateBankroll();
           if(bankroll > 0){
               handCount++;
               questionGame.setVisible(true);
               yesButton.setVisible(true);
               noButton.setVisible(true);
               gameDecision.setVisible(true);
           }
           else if(bankroll < 1){
                noMoney.setVisible(true);
                noMoneyOne.setVisible(true);
                noMoneyTwo.setVisible(true);
                noMoney.setText("Would you like to add more money?");
                gameDecision.setLocation(210, 300);
           }
       }
       else if(this.dealerBlackJack()){
           hitButton.setVisible(false);
           stayButton.setVisible(false);
           doubleDownButton.setVisible(false);
           gameDecision.setText("The Dealer Has Black jack! You Lose!");  
           gameDecision.setLocation(125, 300);
           bankroll -= bet;
           bet = 0;
           this.updateBankroll();
           if(bankroll > 0){
               handCount++;
               questionGame.setVisible(true);
               yesButton.setVisible(true);
               noButton.setVisible(true);
               gameDecision.setVisible(true);
           }
           else if(bankroll < 1){
                noMoney.setVisible(true);
                noMoneyOne.setVisible(true);
                noMoneyTwo.setVisible(true);
                noMoney.setText("Would you like to add more money?");
                gameDecision.setLocation(210, 300);
           }
       }
        else if(this.playerBlackJack()){
           hitButton.setVisible(false);
           stayButton.setVisible(false);
           doubleDownButton.setVisible(false);
           gameDecision.setText("You have black jack! You win!");
           gameDecision.setLocation(143, 300);
           bankroll += (int)(bet * 3/2);
           bet = 0;
           this.updateBankroll();
           if(bankroll > 0){
               handCount++;
               questionGame.setVisible(true);
               yesButton.setVisible(true);
               noButton.setVisible(true);
               gameDecision.setVisible(true);
           }
           else if(bankroll < 1){
                noMoney.setVisible(true);
                noMoneyOne.setVisible(true);
                noMoneyTwo.setVisible(true);
                noMoney.setText("Would you like to add more money?");
                gameDecision.setLocation(210, 300);
           }
       }
       if((this.pushHand()) && !(this.dealerBlackJack() || this.playerBlackJack())){
           hitButton.setVisible(false);
           stayButton.setVisible(false);
           doubleDownButton.setVisible(false);
           dealerHand.setVisible(true);
           dealerHandValue.setVisible(true);
           playerHand.setVisible(true);
           playerHandValue.setVisible(true);
           gameDecision.setText("You pushed! No money was gained or lost.");           
           gameDecision.setLocation(97, 300);
           gamePanel.updateUI();
           bet = 0;
           this.updateBankroll();
           if(bankroll > 0){
               handCount++;
               questionGame.setVisible(true);
               yesButton.setVisible(true);
               noButton.setVisible(true);
               gameDecision.setVisible(true);
           }
           else if(bankroll < 1){
                noMoney.setVisible(true);
                noMoneyOne.setVisible(true);
                noMoneyTwo.setVisible(true);
                noMoney.setText("Would you like to add more money?");
                gameDecision.setLocation(210, 300);
           }
       }
       else if((this.winHand()) && !(this.dealerBlackJack() || this.playerBlackJack())){
           hitButton.setVisible(false);
           stayButton.setVisible(false);
           doubleDownButton.setVisible(false);
           gameDecision.setText("You win!");           
           if(doubleCounter > 0){
               bankroll += bet * 2;
           }
           else{
               bankroll += bet;
           }
           this.updateBankroll();
           if(bankroll > 0){
               handCount++;
               questionGame.setVisible(true);
               yesButton.setVisible(true);
               noButton.setVisible(true);
               gameDecision.setVisible(true);
           }
           else{
           }
           bet = 0;
       }
       else if((!this.winHand()) && !(this.dealerBlackJack() || this.playerBlackJack())){
           hitButton.setVisible(false);
           stayButton.setVisible(false);
           doubleDownButton.setVisible(false);
           gameDecision.setText("You Lose!");  
           
           //this.seeNextCard();
           if(doubleCounter > 0){
               bankroll -= bet * 2;
           }
           else{
               bankroll -= bet;
           }
           this.updateBankroll();
           if(bankroll > 0){
               handCount++;
               questionGame.setVisible(true);
               yesButton.setVisible(true);
               noButton.setVisible(true);
               gameDecision.setVisible(true);
           }
           else if(bankroll < 1){
                noMoney.setVisible(true);
                noMoneyOne.setVisible(true);
                noMoneyTwo.setVisible(true);
                noMoney.setText("Would you like to add more money?");
                gameDecision.setLocation(210, 300);
           }
           bet = 0;
       }
       doubleCounter = 0;
       hitCounter = 0;
       stayCounter = 0;
       endCounter = 1;
   }
    /**
     * @return the player's character
     */
    public String getPlayerCharacter(){
        return playerCharacter;
    }
    /**
     * @return the player's name
     */
    public String getPlayerName(){
        return playerName;
    }
    /**
     * @return the player's character color
     */
    public String getPlayerCharacterColor(){
        return playerCharacterColor;
    }
    /**
     * @return the current page number
     */
    public int getPageNumber(){
        return pageNumber;
    }
    /**
     * @return the player's bankroll
     */
    public int getPlayerBankroll(){
        return bankroll;
    }
    /**
     * @this method sets the text of the bankroll to the current bakroll
     */
   public void updateBankroll(){
       topBankroll.setText("Bankroll");
       bottomBankroll.setText("$" + bankroll);
   }
   /**
     * this method deals the first four cards into the player's and dealer's hands, staring with the player
     * it works by adding the first card from the deck to the players hand, then removing it from the deck.
     * this works for the first four cards, alternating with the player and dealer
     */
   public void dealStartHand(){
       if(noCounter == 0){
           other.addCardToPlayerHand(deck.list().get(0));
           deck.list().remove(0);
           dealer.addCardToHand(deck.list().get(0));
           deck.list().remove(0);
           other.addCardToPlayerHand(deck.list().get(0));
           deck.list().remove(0);
           dealer.addCardToHand(deck.list().get(0));
           deck.list().remove(0);
       }
   }
   /**
    * this method adds the first card from the deck to the players hand, then removes it from the deck
    */
   public void hitPlayerHand(){
       other.addCardToPlayerHand(deck.list().get(0));
       deck.list().remove(0); 
   }
   /**
    * this method adds the first card from the deck to the dealer's hand, then removes it from the deck
    */
   public void hitDealerHand(){
       dealer.addCardToHand(deck.list().get(0));
       deck.list().remove(0);
   }
   /**
    * @return true if the player's hand value is 21 and they have less than three cards
    * @return false if the previous criteria doesn't match
    */
   public boolean playerBlackJack(){
       if(other.getPlayerHandValue() == 21 && other.getPlayerHandSize() < 3){
           return true;
       }
       else{
           return false;
       }
   }
   /**
    * @return true if the dealer's hand value is 21 and they have less than three cards
    * @return false if the previous criteria doesn't match
    */
   public boolean dealerBlackJack(){
       if(dealer.getHandValue() == 21 & dealer.getHandSize() < 3){
           return true;
       }
       else{
           return false;
       }
   }
   /**
    * @return true if the dealer busts and the player doesn't
    * @return false if the dealer doesn't bust and the player has busted
    * @return true if the dealer hand value is under 21 and the player is under 21 and the player's value is greater than the dealers, 
    * @retrn false if the dealer hand value is under 21 and the player is under 21 and the dealer's value is greater than the player
    * @return false if none of the previous work
    */
   public boolean winHand(){
       if(dealer.isBust() && !other.playerBust()){
           count = 0;
           return true;
       }
       else if(!dealer.isBust() && other.playerBust()){
           count = 0;
           return false;
       }
       else if(dealer.getHandValue() < 22 && other.getPlayerHandValue() < 22 && other.getPlayerHandValue() > dealer.getHandValue()){
           count = 0;
           return true;
       }
       else if(dealer.getHandValue() < 22 && other.getPlayerHandValue() < 22 && other.getPlayerHandValue() < dealer.getHandValue()){
           count = 0;
           return false;
       }
       else{
           return false;
       }
   }
   /**
    * @return true if both the delaer hand and the player hand are under 21 and the balues equal each other
    * @return false if the previous doesn't run
    */
   public boolean pushHand(){
       if(dealer.getHandValue() == other.getPlayerHandValue() && other.getPlayerHandValue() < 22 && dealer.getHandValue() < 22){
           count = 0;
           return true;
       }
       else{
           return false;
       }
   }
   /**
    * add a card to the players hand
    */
   public void addPlayerCard(Card c){
       other.getPlayerHand().add(c);
   }
   /**
    * adds a card to the dealers hand
    * **/
   public void addDealerCard(Card c){
       dealer.handList().add(c);
   }
   /**
    * this method returns the player's list of cards in their hand
    **/
   public ArrayList<Card> playerList(){
       return other.getPlayerHand();
   }
   /**
    * this method returns the dealer's list of cards in their hand
    **/
   public ArrayList<Card> dealerList(){
       return dealer.handList();
   }
   /**
    * to sum it up, this is the toString of a java swing
    * I made this by copying the exact format of my toString from the early stages of my project
    * Instead of printing to the console, it will set the correct values of the labels and buttons to what they are supposed to be
    * The only thing different is that I am not able to loop through a hand and keep adding to a label, so i have to individually check every hand
    **/
   public void throwScreen(){
        if(this.dealerBlackJack() || this.playerBlackJack()){
            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1));
            dealerHandValue.setText("Dealer Hand Value: " + dealer.getHandValue());
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1));
            playerHandValue.setText(playerName + "'s Hand Value: " + other.getPlayerHandValue());
            count = 10;
        }
       else if(count < 1 || (dealer.getHandSize() < 3 && count > 0 && !(this.dealerBlackJack() || this.playerBlackJack()))/*(other.getPlayerHandValue() > 21 && dealer.getHandValue() < 17)*/){
            count = 0;
            dealerHand.setText(dealer.handList().get(0) + " []");
            dealerHandValue.setText("Dealer Hand Value: " + dealer.handList().get(0).getCardValue() + " + ?");
        }
        else if(stayCounter > 0 || doubleCounter > 0){
            if(dealer.getHandSize() == 2){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1));
            }
            else if(dealer.getHandSize() == 3){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2));
            }
            else if(dealer.getHandSize() == 4){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3));
            }
            else if(dealer.getHandSize() == 5){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4));
            }
            else if(dealer.getHandSize() == 6){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5));
            }
            else if(dealer.getHandSize() == 7){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6));
            }
            else if(dealer.getHandSize() == 8){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7));
            }
            else if(dealer.getHandSize() == 9){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8));
            }
            else if(dealer.getHandSize() == 10){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9));
            }
            else if(dealer.getHandSize() == 11){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11));
            }
            else if(dealer.getHandSize() == 12){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12));
            }
            else if(dealer.getHandSize() == 13){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12));
            }
            else if(dealer.getHandSize() == 14){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13));
            }
            else if(dealer.getHandSize() == 15){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14));
            }
            else if(dealer.getHandSize() == 16){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14) + " " + dealer.handList().get(15));
            }
            else if(dealer.getHandSize() == 17){
                dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14) + " " + dealer.handList().get(15) + " " + dealer.handList().get(16));
            }
            dealerHandValue.setText("Dealers's Hand Value: " + dealer.getHandValue());
        }
        if(other.getPlayerHandSize() == 2){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1));
        }
        else if(other.getPlayerHandSize() == 3){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2));
        }
        else if(other.getPlayerHandSize() == 4){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " + other.getPlayerHand().get(3));
        }
        else if(other.getPlayerHandSize() == 5){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4));
        }
        else if(other.getPlayerHandSize() == 6){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5));
        }
        else if(other.getPlayerHandSize() == 7){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6));
        }
        else if(other.getPlayerHandSize() == 8){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7));
        }
        else if(other.getPlayerHandSize() == 9){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8));
        }
        else if(other.getPlayerHandSize() == 10){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9));
        }
        else if(other.getPlayerHandSize() == 11){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10));
        }
        else if(other.getPlayerHandSize() == 12){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11));
        }
        else if(other.getPlayerHandSize() == 13){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12));
        }
        else if(other.getPlayerHandSize() == 14){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13));
        }
        else if(other.getPlayerHandSize() == 15){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14));
        }
        else if(other.getPlayerHandSize() == 16){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14) + " " + other.getPlayerHand().get(15));
        }
        else if(other.getPlayerHandSize() == 17){
            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14) + " " + other.getPlayerHand().get(15) + " " + other.getPlayerHand().get(16));
        }
        playerHandValue.setText(playerName + "'s Hand Value: " + other.getPlayerHandValue());
        gamePanel.updateUI();
   }
   
   /**
    * @param ActionEvent e sends an action event through the method
    * The actionPerformed method is a java swing method.
    * What it checks for is the users input through the action event e, assosictaed with an action listener
    * if the source of the action event is coming from a specified button or textbox, then it will do the list of commands listed under the conditional
    */
   public void actionPerformed(ActionEvent e){
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                if(e.getSource() == submitName){
                    playerName = enterName.getText();
                    String playerNameTrimmed = playerName.trim();
                    if(playerName.equals("a") || playerNameTrimmed.isEmpty()){
                        trickName.setText("Please enter a real name!");
                        trickName.setVisible(true);
                    }
                    else{
                        trickName.setVisible(false);
                    }
                    enterName.setText("");
                }
                
                if(e.getSource() == char1pic){
                    trickCharacter.setVisible(false);
                    playerCharacter = char1pic.getText();
                    characterDisplay.setText(char1pic.getText());
                    char1pic.setForeground(new Color(0, 155, 0));
                    char2pic.setForeground(new Color(0, 0, 0));
                    char3pic.setForeground(new Color(0, 0, 0));
                    char4pic.setForeground(new Color(0, 0, 0));
                }
                else if(e.getSource() == char2pic){
                    trickCharacter.setVisible(false);
                    playerCharacter = char2pic.getText();
                    characterDisplay.setText(char2pic.getText());
                    char2pic.setForeground(new Color(0, 155, 0));
                    char3pic.setForeground(new Color(0, 0, 0));
                    char4pic.setForeground(new Color(0, 0, 0));
                    char1pic.setForeground(new Color(0, 0, 0));
                }
                else if(e.getSource() == char3pic){
                    trickCharacter.setVisible(false);
                    playerCharacter = char3pic.getText();
                    characterDisplay.setText(char3pic.getText());
                    char3pic.setForeground(new Color(0, 155, 0));
                    char4pic.setForeground(new Color(0, 0, 0));
                    char1pic.setForeground(new Color(0, 0, 0));
                    char2pic.setForeground(new Color(0, 0, 0));
                }
                else if(e.getSource() == char4pic){
                    trickCharacter.setVisible(false);
                    playerCharacter = char4pic.getText();
                    characterDisplay.setText(char4pic.getText());
                    char4pic.setForeground(new Color(0, 155, 0));
                    char1pic.setForeground(new Color(0, 0, 0));
                    char2pic.setForeground(new Color(0, 0, 0));
                    char3pic.setForeground(new Color(0, 0, 0));
                }
                if(e.getSource() == advanceFirst){
                    String playerNameTrimmed = playerName.trim();
                    if(playerNameTrimmed.isEmpty() || playerCharacter.equals("b") || playerNameTrimmed.equals("a")) {
                        if(playerName.equals("a") || playerNameTrimmed.isEmpty()){
                        trickName.setText("Please enter a name before advancing!");
                        trickName.setVisible(true);
                        }
                        if(playerCharacter.equals("b")){
                        trickCharacter.setVisible(true);
                        }
                    } 
                    if(!playerCharacter.equals("b")){
                        trickCharacter.setVisible(false);
                    }
                    if(!playerName.equals("a") && !playerNameTrimmed.isEmpty()){
                        trickName.setVisible(false);
                    }
                    if(!playerName.equals("a") && !playerNameTrimmed.isEmpty() && !playerCharacter.equals("b")){
                        pageNumber++;
                        setFrame();
                    }
                    startingPanel.updateUI();
                }
                if(e.getSource() == bankrollButton){
                    try{
                        bankroll = Integer.parseInt(bankrollEnter.getText());
                    }
                    catch(Exception e){
                        trickBankroll.setVisible(true);
                    }
                    if(bankroll != -1 && bankroll > 0){
                        trickBankroll.setVisible(false);
                    }
                    else if(bankroll < 1){
                        trickBankroll.setVisible(true);
                    }
                    bankrollEnter.setText("");
                }
                if(e.getSource() == advanceSecond){
                    if(bankroll == -1 || playerCharacterColor.equals("c")){
                        if(bankroll == -1 || bankroll < 1){
                        trickBankroll.setVisible(true);
                        }
                        if(playerCharacterColor.equals("c")){
                        trickColor.setVisible(true);
                        }
                    }
                    if(bankroll != -1 && bankroll > 0){
                        trickBankroll.setVisible(false);
                    }
                    if(!playerCharacterColor.equals("c")){
                        trickColor.setVisible(false);
                    }
                    if(!playerCharacterColor.equals("c") && (bankroll != -1 && bankroll > 0)){
                        pageNumber++;
                        setFrame();
                    }
                }
                if(e.getSource() == red){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(217, 33, 33));
                    characterDisplay.setForeground(new Color(217, 33, 33));
                    playerCharacterColor = "Red";
                }
                if(e.getSource() == orange){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(255, 130, 0));
                    characterDisplay.setForeground(new Color(255, 130, 0));
                    playerCharacterColor = "Orange";
                }
                if(e.getSource() == yellow){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(200, 200, 0));
                    characterDisplay.setForeground(new Color(200, 200, 0));
                    playerCharacterColor = "Yellow";
                }
                if(e.getSource() == green){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(5, 162, 8));
                    characterDisplay.setForeground(new Color(5, 162, 8));
                    playerCharacterColor = "Green";
                }
                if(e.getSource() == blue){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(0, 87, 217));
                    characterDisplay.setForeground(new Color(0, 87, 217));
                    playerCharacterColor = "Blue";
                }
                if(e.getSource() == purple){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(106, 13, 173));
                    characterDisplay.setForeground(new Color(106, 13, 173));
                    playerCharacterColor = "Purple";
                }
                if(e.getSource() == grey){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(150, 150, 150));
                    characterDisplay.setForeground(new Color(150, 150, 150));
                    playerCharacterColor = "Grey";
                }
                if(e.getSource() == black){
                    trickColor.setVisible(false);
                    characterPicture.setForeground(new Color(0, 0, 0));
                    characterDisplay.setForeground(new Color(0, 0, 0));
                    playerCharacterColor = "Black";
                }
                
                if(e.getSource() == hitButton){
                    trickAdd.setVisible(false);
                    count++;
                    doubleDownButton.setVisible(false);
                    hitPlayerHand();
                    hitCounter++;
                    if(other.getPlayerHandValue() > 21 && dealer.getHandValue() < 22){
                        hitButton.setVisible(false);
                        stayButton.setVisible(false);
                        throwScreen();
                        runGame();
                    }
                    else{
                        throwScreen();
                    }
                    gamePanel.updateUI();
                }
                
                if(e.getSource() == handSubmit){
                    yourCharacter.setText(playerName + " 's Character");
                    updateBankroll();
                    count = 0;
                    hitCounter = 0;
                    stayCounter = 0;
                    doubleCounter = 0;
                    try{
                        bet = Integer.parseInt(enterHandAmnt.getText());
                        gamePanel.updateUI();
                    }
                    catch(Exception e){
                        enterHandAmnt.setText("");
                        gamePanel.add(trickHand);
                        gamePanel.add(trickUnder);
                        trickHand.setSize(600, 100);
                        trickUnder.setSize(400, 100);
                        trickHand.setLocation(20, 37);
                        trickUnder.setLocation(195, 54);
                        trickHand.setForeground(new Color(158, 0, 0));
                        trickUnder.setForeground(new Color(0, 128, 0));
                        trickHand.setText("Please enter an amount less than or equal to your bankroll");
                        trickUnder.setText("Bankroll: $" + bankroll);
                        trickHand.setVisible(true);
                        trickUnder.setVisible(true);
                    }
                    if(bet > 0 && bankroll - bet >= 0){
                        enterHandAmnt.setText("");
                        enterHandAmnt.setVisible(false);
                        handSubmit.setVisible(false);
                        handDescription.setVisible(false);
                        bottomBox.setVisible(true);
                        topBox.setVisible(true);
                        dealerHand.setVisible(true);
                        dealerHandValue.setVisible(true);
                        playerHandValue.setVisible(true);
                        trickHand.setVisible(false);
                        trickUnder.setVisible(false);
                        count = 0;
                        hitCounter = 0;
                        stayCounter = 0;
                        doubleCounter = 0;
                        dealer.resetHand();
                        other.resetPlayerHand();
                        gamePanel.updateUI();
                        other.resetPlayerHand();
                        addToScreen();
                    }
                    else{
                        enterHandAmnt.setText("");
                        gamePanel.add(trickHand);
                        gamePanel.add(trickUnder);
                        trickHand.setSize(600, 100);
                        trickUnder.setSize(400, 100);
                        trickHand.setLocation(20, 37);
                        trickUnder.setLocation(195, 54);
                        trickHand.setForeground(new Color(158, 0, 0));
                        trickUnder.setForeground(new Color(0, 128, 0));
                        trickHand.setText("Please enter an amount less than or equal to your bankroll");
                        trickUnder.setText("Bankroll: $" + bankroll);
                        trickHand.setVisible(true);
                        trickUnder.setVisible(true);
                    }
                    gamePanel.updateUI();
                }
                if(e.getSource() == stayButton){
                    trickAdd.setVisible(false);
                    count++;
                    doubleDownButton.setVisible(false);
                    hitButton.setVisible(false);
                    stayButton.setVisible(false);                    
                    stayCounter++;
                    while(dealer.getHandValue() < 17 && other.getPlayerHandValue() < 22){
                        hitDealerHand();
                        gamePanel.updateUI();
                    }
                    if(dealer.getHandSize() == 2){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1));
                    }
                    else if(dealer.getHandSize() == 3){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2));
                    }
                    else if(dealer.getHandSize() == 4){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3));
                    }
                    else if(dealer.getHandSize() == 5){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4));
                    }
                    else if(dealer.getHandSize() == 6){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5));
                    }
                    else if(dealer.getHandSize() == 7){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6));
                    }
                    else if(dealer.getHandSize() == 8){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7));
                    }
                    else if(dealer.getHandSize() == 9){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8));
                    }
                    else if(dealer.getHandSize() == 10){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9));
                    }
                    else if(dealer.getHandSize() == 11){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11));
                    }
                    else if(dealer.getHandSize() == 12){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12));
                    }
                    else if(dealer.getHandSize() == 13){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12));
                    }
                    else if(dealer.getHandSize() == 14){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13));
                    }
                    else if(dealer.getHandSize() == 15){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14));
                    }
                    else if(dealer.getHandSize() == 16){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14) + " " + dealer.handList().get(15));
                    }
                    else if(dealer.getHandSize() == 17){
                        dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14) + " " + dealer.handList().get(15) + " " + dealer.handList().get(16));
                    }
                    dealerHandValue.setText("Dealers's Hand Value: " + dealer.getHandValue());
                    if(other.getPlayerHandSize() == 2){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1));
                    }
                    else if(other.getPlayerHandSize() == 3){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2));
                    }
                    else if(other.getPlayerHandSize() == 4){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " + other.getPlayerHand().get(3));
                    }
                    else if(other.getPlayerHandSize() == 5){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4));
                    }
                    else if(other.getPlayerHandSize() == 6){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5));
                    }
                    else if(other.getPlayerHandSize() == 7){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6));
                    }
                    else if(other.getPlayerHandSize() == 8){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7));
                    }
                    else if(other.getPlayerHandSize() == 9){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8));
                    }
                    else if(other.getPlayerHandSize() == 10){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9));
                    }
                    else if(other.getPlayerHandSize() == 11){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10));
                    }
                    else if(other.getPlayerHandSize() == 12){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11));
                    }
                    else if(other.getPlayerHandSize() == 13){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12));
                    }
                    else if(other.getPlayerHandSize() == 14){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13));
                    }
                    else if(other.getPlayerHandSize() == 15){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14));
                    }
                    else if(other.getPlayerHandSize() == 16){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14) + " " + other.getPlayerHand().get(15));
                    }
                    else if(other.getPlayerHandSize() == 17){
                        playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14) + " " + other.getPlayerHand().get(15) + " " + other.getPlayerHand().get(16));
                    }
                    playerHandValue.setText(playerName + "'s Hand Value: " + other.getPlayerHandValue());
                    runGame();
                    gamePanel.updateUI();
                }
                if(e.getSource() == doubleDownButton){
                    if(bet * 2 <= bankroll){
                        gamePanel.updateUI();
                        count++;
                        doubleDownButton.setVisible(false);
                        hitButton.setVisible(false);
                        stayButton.setVisible(false);
                        doubleCounter++;
                        hitPlayerHand();
                        while(dealer.getHandValue() < 17 && other.getPlayerHandValue() < 22){
                            hitDealerHand();
                            gamePanel.updateUI();
                        }
                        if(dealer.getHandSize() == 2){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1));
                        }
                        else if(dealer.getHandSize() == 3){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2));
                        }
                        else if(dealer.getHandSize() == 4){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3));
                        }
                        else if(dealer.getHandSize() == 5){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4));
                        }
                        else if(dealer.getHandSize() == 6){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5));
                        }
                        else if(dealer.getHandSize() == 7){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6));
                        }
                        else if(dealer.getHandSize() == 8){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7));
                        }
                        else if(dealer.getHandSize() == 9){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8));
                        }
                        else if(dealer.getHandSize() == 10){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9));
                        }
                        else if(dealer.getHandSize() == 11){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11));
                        }
                        else if(dealer.getHandSize() == 12){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12));
                        }
                        else if(dealer.getHandSize() == 13){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12));
                        }
                        else if(dealer.getHandSize() == 14){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13));
                        }
                        else if(dealer.getHandSize() == 15){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14));
                        }
                        else if(dealer.getHandSize() == 16){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14) + " " + dealer.handList().get(15));
                        }
                        else if(dealer.getHandSize() == 17){
                            dealerHand.setText(dealer.handList().get(0) + " " + dealer.handList().get(1) + " " + dealer.handList().get(2) + " " + dealer.handList().get(3) + " " + dealer.handList().get(4) + " " + dealer.handList().get(5) + " " + dealer.handList().get(6) + " " + dealer.handList().get(7) + " " + dealer.handList().get(8)  + " " + dealer.handList().get(9) + " " + dealer.handList().get(10) + " " + dealer.handList().get(11) + " " + dealer.handList().get(12) + " " + dealer.handList().get(13) + " " + dealer.handList().get(14) + " " + dealer.handList().get(15) + " " + dealer.handList().get(16));
                        }
                        dealerHandValue.setText("Dealers's Hand Value: " + dealer.getHandValue());
                        if(other.getPlayerHandSize() == 2){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1));
                        }
                        else if(other.getPlayerHandSize() == 3){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2));
                        }
                        else if(other.getPlayerHandSize() == 4){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " + other.getPlayerHand().get(3));
                        }
                        else if(other.getPlayerHandSize() == 5){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4));
                        }
                        else if(other.getPlayerHandSize() == 6){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5));
                        }
                        else if(other.getPlayerHandSize() == 7){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6));
                        }
                        else if(other.getPlayerHandSize() == 8){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7));
                        }
                        else if(other.getPlayerHandSize() == 9){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8));
                        }
                        else if(other.getPlayerHandSize() == 10){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9));
                        }
                        else if(other.getPlayerHandSize() == 11){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10));
                        }
                        else if(other.getPlayerHandSize() == 12){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11));
                        }
                        else if(other.getPlayerHandSize() == 13){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12));
                        }
                        else if(other.getPlayerHandSize() == 14){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13));
                        }
                        else if(other.getPlayerHandSize() == 15){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14));
                        }
                        else if(other.getPlayerHandSize() == 16){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14) + " " + other.getPlayerHand().get(15));
                        }
                        else if(other.getPlayerHandSize() == 17){
                            playerHand.setText(other.getPlayerHand().get(0) + " " + other.getPlayerHand().get(1) + " " + other.getPlayerHand().get(2) + " " +  other.getPlayerHand().get(3) + " " + other.getPlayerHand().get(4) + " " + other.getPlayerHand().get(5) + " " + other.getPlayerHand().get(6) + " " + other.getPlayerHand().get(7) + " " + other.getPlayerHand().get(8) + " " + other.getPlayerHand().get(9) + " " + other.getPlayerHand().get(10) + " " + other.getPlayerHand().get(11) + " " + other.getPlayerHand().get(12) + " " + other.getPlayerHand().get(13) + " " + other.getPlayerHand().get(14) + " " + other.getPlayerHand().get(15) + " " + other.getPlayerHand().get(16));
                        }
                        playerHandValue.setText(playerName + "'s Hand Value: " + other.getPlayerHandValue());
                        runGame();
                        trickAdd.setVisible(false);
                    }
                    else if(bet * 2 > bankroll){
                        trickAdd.setText("You cannot double down! Bet too Large!");
                        trickAdd.setVisible(true);
                        trickAdd.setLocation(120, 345);
                        doubleDownButton.setVisible(false);
                    }
                    gamePanel.updateUI();
                }
                if(e.getSource() == yesButton){
                    quitButton.setVisible(false);
                    startNewGameButton.setVisible(false);
                    yesButton.setVisible(false);
                    noButton.setVisible(false);
                    enterHandAmnt.setVisible(true);
                    handSubmit.setVisible(true);
                    handDescription.setVisible(true);
                    playerHand.setVisible(false);
                    dealerHand.setVisible(false);
                    playerHandValue.setVisible(false);
                    dealerHandValue.setVisible(false);
                    hitButton.setVisible(false);
                    stayButton.setVisible(false);
                    doubleDownButton.setVisible(false);
                    endGame.setVisible(false);
                    endGame1.setVisible(false);
                    gameDecision.setVisible(false);
                    questionGame.setVisible(false);
                    topBox.setVisible(false);
                    bottomBox.setVisible(false);
                    characterDisplay.setVisible(false);
                    yourCharacter.setVisible(false);
                    topBankroll.setVisible(true);
                    bottomBankroll.setVisible(true);
                    dealer.resetHand();
                    other.resetPlayerHand();
                    hitCounter = 0;
                    stayCounter = 0;
                    doubleCounter = 0;
                }
                if(e.getSource() == noButton){
                    //quitButton.setVisible(true);
                    startNewGameButton.setVisible(true);
                    yesButton.setVisible(false);
                    noButton.setVisible(false);
                    enterHandAmnt.setVisible(false);
                    handSubmit.setVisible(false);
                    handDescription.setVisible(false);
                    playerHand.setVisible(false);
                    dealerHand.setVisible(false);
                    topBox.setVisible(false);
                    bottomBox.setVisible(false);
                    dealerHandValue.setVisible(true);
                    playerHandValue.setVisible(true);
                    characterDisplay.setVisible(false);
                    yourCharacter.setVisible(false);
                    topBankroll.setVisible(false);
                    bottomBankroll.setVisible(false);
                    playerHandValue.setVisible(true);
                    dealerHandValue.setVisible(true);
                    hitButton.setVisible(false);
                    stayButton.setVisible(false);
                    doubleDownButton.setVisible(false);
                    endGame.setVisible(true);
                    endGame1.setVisible(true);
                    gameDecision.setVisible(false);
                    questionGame.setVisible(false);
                    playerHandValue.setVisible(false);
                    dealerHandValue.setVisible(false);
                    //questionGame.setText("Quit or Start New Game?");
                }
                if(e.getSource() == quitButton){
                    startNewGameButton.setVisible(true);
                    yesButton.setVisible(false);
                    noButton.setVisible(false);
                    enterHandAmnt.setVisible(false);
                    handSubmit.setVisible(false);
                    handDescription.setVisible(false);
                    playerHand.setVisible(false);
                    dealerHand.setVisible(false);
                    topBox.setVisible(false);
                    bottomBox.setVisible(false);
                    dealerHandValue.setVisible(false);
                    playerHandValue.setVisible(false);
                    characterDisplay.setVisible(false);
                    yourCharacter.setVisible(false);
                    topBankroll.setVisible(false);
                    bottomBankroll.setVisible(false);
                    playerHandValue.setVisible(true);
                    dealerHandValue.setVisible(true);
                    hitButton.setVisible(false);
                    stayButton.setVisible(false);
                    doubleDownButton.setVisible(false);
                    endGame.setVisible(true);
                    endGame1.setVisible(true);
                    gameDecision.setVisible(false);
                    questionGame.setVisible(false);
                }
                if(e.getSource() == noMoneyOne){
                    noMoneyEnter.setVisible(true);
                    noMoneySubmit.setVisible(true);
                    noMoneyOne.setVisible(false);
                    noMoneyTwo.setVisible(false);
                    noMoney.setText("How much money would you like to add?");
                }
                if(e.getSource() == noMoneyTwo){
                    quitButton.setVisible(false);
                    startNewGameButton.setVisible(false);
                    yesButton.setVisible(false);
                    noButton.setVisible(false);
                    enterHandAmnt.setVisible(false);
                    handSubmit.setVisible(false);
                    handDescription.setVisible(false);
                    playerHand.setVisible(false);
                    dealerHand.setVisible(false);
                    playerHandValue.setVisible(true);
                    dealerHandValue.setVisible(true);
                    hitButton.setVisible(false);
                    stayButton.setVisible(false);
                    doubleDownButton.setVisible(false);
                    endGame.setVisible(true);
                    endGame1.setVisible(true);
                    characterDisplay.setVisible(false);
                    topBox.setVisible(false);
                    bottomBox.setVisible(false);
                    yourCharacter.setVisible(false);
                    topBankroll.setVisible(false);
                    bottomBankroll.setVisible(false);
                    noMoney.setVisible(false);
                    noMoneyOne.setVisible(false);
                    noMoneyTwo.setVisible(false);
                    playerHandValue.setVisible(false);
                    dealerHandValue.setVisible(false);
                }
                if(e.getSource() == noMoneySubmit){
                    try{
                        bankroll += Integer.parseInt(noMoneyEnter.getText());
                        noMoneyEnter.setText("");
                        if(bankroll > 0){
                            noMoney.setVisible(false);
                            noMoneyOne.setVisible(false);
                            noMoneyTwo.setVisible(false);
                            noMoneySubmit.setVisible(false);
                            noMoneyEnter.setVisible(false);
                            enterHandAmnt.setVisible(true);
                            handSubmit.setVisible(true);
                            handDescription.setVisible(true);
                            playerHand.setVisible(false);
                            dealerHand.setVisible(false);
                            topBox.setVisible(false);
                            bottomBox.setVisible(false);
                            dealerHandValue.setVisible(false);
                            playerHandValue.setVisible(false);
                            yourCharacter.setVisible(false);
                            characterDisplay.setVisible(false);
                            trickAdd.setVisible(false);
                            updateBankroll();
                        }
                        else if(bankroll < 1){
                            noMoney.setText("Please enter more money!");
                            noMoney.setLocation(145, 307);
                            trickAdd.setVisible(true);
                            trickAdd.setText("Your bankroll is still equal to or under $0");
                            trickAdd.setLocation(120, 358);
                            updateBankroll();
                        }
                    }
                    catch(Exception e){
                        trickAdd.setVisible(true);
                        noMoneyEnter.setText("");
                    }
                }
            }
        });          
    }
}