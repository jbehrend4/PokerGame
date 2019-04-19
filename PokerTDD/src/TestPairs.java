/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author green_q7uklsw
 */
public class TestPairs {
    private int pairsCount;
    private boolean pair1 = false;
    private boolean pair2 = false;
    private int rank1, rank2, rank3, rank4, rank5;
    
    public TestPairs(int card1, int card2, int card3, int card4, int card5){
        this.rank1 = card1;
        this.rank2 = card2;
        this.rank3 = card3;
        this.rank4 = card4;
        this.rank5 = card5;
    }
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
