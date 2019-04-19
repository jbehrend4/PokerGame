/**
 *  The TestFourOfAKind test if the player's hand has four cards of one rank
 * @version 1.1
 * @author jbehrend4 dziege1
 */
public class TestFourOfAKind {
    private boolean isFourOfKind = false;
    private int rank1, rank2, rank3, rank4, rank5;
    
    
    /**
        * The TestFourOfAKind constructor gets the ranks of the five generated cards
        * @param card1 The rank of the first card
        * @param card2 The rank of the second card
        * @param card3 The rank of the third card
        * @param card4 The rank of the fourth card
        * @param card5 The rank of the fifth card
        */    
    public TestFourOfAKind(int card1, int card2, int card3, int card4, int card5){
        this.rank1 = card1;
        this.rank2 = card2;
        this.rank3 = card3;
        this.rank4 = card4;
        this.rank5 = card5;
    }
    
    /**
        * The TestAllCards checks each possible combination of four cards to find if there is four of a kind
        */      
    public void TestAllCards(){
        if(rank1 == rank2 && rank2 == rank3 && rank3 == rank4){
            isFourOfKind = true;
        }
        if(rank1 == rank2 && rank2 == rank3 && rank3 == rank5){
            isFourOfKind = true;
        }
        if(rank1 == rank2 && rank2 == rank4 && rank4 == rank5){
            isFourOfKind = true;
        }
        if(rank1 == rank3 && rank3 == rank4 && rank4 == rank5){
            isFourOfKind = true;
        }
        if(rank2 == rank3 && rank3 == rank4 && rank4 == rank5){
            isFourOfKind = true;
        }
    }
    
    /**
        * Returns whether or not there was four of a kind
        * @return A boolean that is true if there is a four of a kind and false if there is not
        */       
    public boolean isFourOfKind(){
        return isFourOfKind;
    }
}
