/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author green_q7uklsw
 */
public class TestFourOfAKind {
    private boolean isFourOfKind = false;
    private int rank1, rank2, rank3, rank4, rank5;
    
    public TestFourOfAKind(int card1, int card2, int card3, int card4, int card5){
        this.rank1 = card1;
        this.rank2 = card2;
        this.rank3 = card3;
        this.rank4 = card4;
        this.rank5 = card5;
    }
    
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
    
    public boolean isFourOfKind(){
        return isFourOfKind;
    }
}
