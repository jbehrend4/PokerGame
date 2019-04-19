/**
 * The GenerateCard class generates the suit and number for the cards
 * @version  1.1
 * @author jbehrend4, dziege1
 */
public class GenerateCard {
    
    /**
        * The GenerateSuit method generates a number that determines the suit for the card
        * @return  A number between 1 and 4 that is assigned to a suit in the Card class
        */    
    public int generateSuit(){
        int genSuit = (int) (Math.random()* 4) + 1;
        return genSuit;
    }
    
    /**
        * The GenerateNumber method generates a number that determines the rank of the card
        * 2-10 equal the numbers themselves, 1= Ace, 11 = Jack, 12 = Queen, and 13 = King
        * @return  A number between 1 and 13 that is assigned to a rank in the Card class
        */    
    public int generateNumber(){
        int getNumber = (int) (Math.random()* 13) + 1;
        return getNumber;
    }
}
