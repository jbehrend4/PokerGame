/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author green_q7uklsw
 */
public class PokerHandTest {
    
    @Test
    public void canCreateHand(){
        PokerHand h = new PokerHand();
    }
    
    @Test
    public void canGenerateInfo(){
        GenerateCard cardGen = new GenerateCard();
        cardGen.generateSuit();
        cardGen.generateNumber();
    }
    
    @Test
    public void canCreateCard(){
        Card card1 = new Card();
        card1.setNumber();
        card1.setSuit();
        card1.setDiscriptNumber();
        card1.setDiscriptSuit();
        assertTrue(card1.getNumber()>= 1 && card1.getNumber()<= 13);
    }
    
    @Test
    public void canCheckOnePairs(){
        TestPairs tp = new TestPairs(2, 1, 2, 3, 4);
        tp.testAllPairs();
        assertTrue(tp.checkNumberOfPairs() == 1);
    }
    
    @Test
    public void canCheckTwoPairs(){
        TestPairs tp = new TestPairs(2, 3, 2, 3, 4);
        tp.testAllPairs();
        assertTrue(tp.checkNumberOfPairs() == 2);
    }
    
    @Test
    public void canCheckThreeOfKind(){
        TestThreeOfAKind ttok = new TestThreeOfAKind(2,3,2,2,4);
        ttok.TestAllCombonations();
        assertTrue(ttok.isThreeOfKind() == true);
    }
    
    @Test
    public void canCheckFourOfKind(){
        TestFourOfAKind tfok = new TestFourOfAKind(2,2,2,2,4);
        tfok.TestAllCards();
        assertTrue(tfok.isFourOfKind() == true);
    }
    
    @Test
    public void canCheckFullHouse(){
        TestThreeOfAKind ttok = new TestThreeOfAKind(2,3,2,2,4);
        ttok.TestAllCombonations();
        TestPairs tp = new TestPairs(2, 2, 6, 3, 4);
        tp.testAllPairs();
        assertTrue(ttok.isThreeOfKind() == true && tp.checkNumberOfPairs() == 1);
    }
}
