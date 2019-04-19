/**
 * The TestPairs class calculates if a hand has zero, one, or two pairs
 * @version 1.1
 * @author jbehrend4 dziege1
 */
public class TestPairs {
    private int pairsCount;
    private boolean pair1 = false;
    private boolean pair2 = false;
    private int rank1, rank2, rank3, rank4, rank5;
    
    /**
        * The TestPairs constructor gets the ranks of the five generated cards
        * @param card1 The rank of the first card
        * @param card2 The rank of the second card
        * @param card3 The rank of the third card
        * @param card4 The rank of the fourth card
        * @param card5 The rank of the fifth card
        */    
    public TestPairs(int card1, int card2, int card3, int card4, int card5){
        this.rank1 = card1;
        this.rank2 = card2;
        this.rank3 = card3;
        this.rank4 = card4;
        this.rank5 = card5;
    }
    
    /**
        * The TestAllPairs checks if any of the cards are equal to each other and counts how many pairs are found
        */    
    public void testAllPairs(){
        if(rank1 == rank2){
            pairsCount++;
        }
        if(rank1 == rank3){
            pairsCount++;
        }
        if(rank1 == rank4){
            pairsCount++;
        }
        if(rank1 == rank5){
            pairsCount++;
        }
        if(rank2 == rank3){
            pairsCount++;
        }
        if(rank2 == rank4){
            pairsCount++;
        }
        if(rank2 == rank5){
            pairsCount++;
        }
        if(rank3 == rank4){
            pairsCount++;
        }
        if(rank3 == rank5){
            pairsCount++;
        }
        if(rank4 == rank5){
            pairsCount++;
        }
        
        if(pairsCount == 1){
            pair1 = true;
        }
        if(pairsCount == 2){
            pair2 = true;
        }
    }
    
    /**
        *  Checks how many pairs are in the hand
        * @return The number of pairs that are in the hand
        */    
    public int checkNumberOfPairs(){
        if(pair2 == true){
            return 2;
        }
        else if(pair1 == true){
            return 1;
        }
        else{
            return 0;
        }
    }
}
