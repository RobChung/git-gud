package pkg2020w_ice1_4365;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @modifier AMRITPREET KAUR
 * @modifier Nidhi
 * Student id - 991563808
 * 
 * Student Id:-991551280
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            card.setValue((int)(Math.random()*13+1));
            card.setSuit(Card.SUITS[(int)(Math.random()*13+1)]);
            magicHand[i]=card;
        }
System.out.println("pick a card");
System.out.println("enter the face value for card");
int value=sc.nextInt();
System.out.println("enter the suit of your card");
int suitInt=sc.nextInt();

Card card=new Card();
card.setValue(value);
card.setSuit(Card.SUITS[suitInt-1]);

Card luckynumber=new Card();
card.setValue(10);
card.setSuit(Card.SUITS[2]);


boolean found=false;
for(Card magicCard:magicHand)
{if(magicCard.getValue()==card.getValue() && magicCard.getSuit().equals(card.getSuit()))
    found=true;
break;
    }
if(found)
{
    System.out.println("congrats it is matched");
}
else
{
    System.out.println("doesnot match");
}
        // and search magicHand here
        //Then report the result here
    }
}
