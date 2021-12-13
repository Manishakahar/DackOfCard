package dackofcards;

import java.util.Arrays;
import java.util.Collections;

public class Cards {
    // Declare variables
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9","10", "Jack", "Queen", "King"};
    String cards[][] = new String[4][13];
    String index[] = new String[52];
    int position = 0;
    //Create Card Deck
    public void createDeck(){
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<13;j++)
            {
                index[position] = suits[i]+" of "+ranks[j];
                position++;
            }
        }
        System.out.println();
    }
    //Shuffle Cards and Display
    public void shuffleCards(){
        Collections.shuffle(Arrays.asList(index));
        for (int a=0;a<index.length;a++){
            System.out.println("Shuffle: "+index[a]);
        }
        System.out.println();
    }
    //Main method
    public static void main(String[] args) {
        System.out.println(" welcome to Dack of card game");
        Cards deckOfCards=new Cards();
        deckOfCards.createDeck();
        deckOfCards.shuffleCards();
    }
}
