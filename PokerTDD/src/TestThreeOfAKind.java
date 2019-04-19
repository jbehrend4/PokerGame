/**
 *  The TestThreeOfAKind test if the player's hand has three cards of one rank
 * @version 1.1
 * @author jbehrend4 dziege1
 */
public class TestThreeOfAKind {
    private boolean isThreeOfKind = false;
    private int rank1, rank2, rank3, rank4, rank5;
    
    /**
        * The TestThreeOfAKind constructor gets the ranks of the five generated cards
        * @param card1 The rank of the first card
        * @param card2 The rank of the second card
        * @param card3 The rank of the third card
        * @param card4 The rank of the fourth card
        * @param card5 The rank of the fifth card
        */    
    public TestThreeOfAKind(int card1, int card2, int card3, int card4, int card5){
        this.rank1 = card1;
        this.rank2 = card2;
        this.rank3 = card3;
        this.rank4 = card4;
        this.rank5 = card5;
    }
    
    /**
        * The TestAllCombonations checks each possible combination of three cards to find if there is three of a kind
        */      
    public void TestAllCombonations(){
        if(rank1 == rank2 && rank2 == rank3){
            isThreeOfKind = true;
        }
        if(rank1 == rank2 && rank2 == rank4){
            isThreeOfKind = true;
        }
        if(rank1 == rank2 && rank2 == rank5){
            isThreeOfKind = true;
        }
        if(rank1 == rank3 && rank3 == rank4){
            isThreeOfKind = true;
        }
        if(rank1 == rank3 && rank3 == rank5){
            isThreeOfKind = true;
        }
        if(rank1 == rank4 && rank4 == rank5){
            isThreeOfKind = true;
        }
        if(rank2 == rank3 && rank3 == rank4){
            isThreeOfKind = true;
        }
        if(rank2 == rank3 && rank3 == rank5){
            isThreeOfKind = true;
        }
        if(rank2 == rank4 && rank4 == rank5){
            isThreeOfKind = true;
        }
        if(rank3 == rank4 && rank4 == rank5){
            isThreeOfKind = true;
        }
        
    }
    
    /**
        * Returns whether or not there was three of a kind
        * @return A boolean that is true if there is a three of a kind and false if there is not
        */    
    public boolean isThreeOfKind(){
        return isThreeOfKind;
    }
}
