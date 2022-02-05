
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * Name : Hongmei Zhang
 * ID : 991636280
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        
        Card twohearts = new Card("Hearts", 2);
        Card fiveSpades = new Card("Spades", 5);
        Card nineDiamonds = new Card("Diamonds",9);
        Card sixClubs = new Card("Clubs",6);
        
        
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
    }
}
