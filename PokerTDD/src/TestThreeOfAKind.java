/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author green_q7uklsw
 */
public class TestThreeOfAKind {
    private boolean isThreeOfKind = false;
    private int rank1, rank2, rank3, rank4, rank5;
    
    public TestThreeOfAKind(int card1, int card2, int card3, int card4, int card5){
        this.rank1 = card1;
        this.rank2 = card2;
        this.rank3 = card3;
        this.rank4 = card4;
        this.rank5 = card5;
    }
    
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
    
    public boolean isThreeOfKind(){
        return isThreeOfKind;
    }
}
