/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author green_q7uklsw
 */
public class PokerHand {
    public static void main(String[] args) {
        Card card1 = new Card();
        Card card2 = new Card();
        Card card3 = new Card();
        Card card4 = new Card();
        Card card5 = new Card();
    
        card1.setNumber();
        card1.setSuit();
        card1.setDiscriptNumber();
        card1.setDiscriptSuit();
        card2.setNumber();
        card2.setSuit();
        card2.setDiscriptNumber();
        card2.setDiscriptSuit();
        card3.setNumber();
        card3.setSuit();
        card3.setDiscriptNumber();
        card3.setDiscriptSuit();
        card4.setNumber();
        card4.setSuit();
        card4.setDiscriptNumber();
        card4.setDiscriptSuit();
        card5.setNumber();
        card5.setSuit();
        card5.setDiscriptNumber();
        card5.setDiscriptSuit();
        System.out.println(card1.getDiscriptNumber() + " of " + card1.getDiscriptSuit());
        System.out.println(card2.getDiscriptNumber() + " of " + card2.getDiscriptSuit());
        System.out.println(card3.getDiscriptNumber() + " of " + card3.getDiscriptSuit());
        System.out.println(card4.getDiscriptNumber() + " of " + card4.getDiscriptSuit());
        System.out.println(card5.getDiscriptNumber() + " of " + card5.getDiscriptSuit());
        TestPairs tp = new TestPairs(card1.getNumber(), card2.getNumber(), card3.getNumber(), card4.getNumber(), card5.getNumber());
        tp.testAllPairs();
        if(tp.checkNumberOfPairs() == 2){
            System.out.println("This hand has two pairs");
        }else if(tp.checkNumberOfPairs() == 1){
            System.out.println("This hand has one pair");
        }else{
            System.out.println("This hand has no pairs");
        }
        TestThreeOfAKind ttok = new TestThreeOfAKind(card1.getNumber(), card2.getNumber(), card3.getNumber(), card4.getNumber(), card5.getNumber());
        ttok.TestAllCombonations();
        if(ttok.isThreeOfKind() == true){
            System.out.println("This hand has a three of a kind");
        }else{
            System.out.println("This hand does not have a three of a kind");
        }
        TestFourOfAKind tfok = new TestFourOfAKind(card1.getNumber(), card2.getNumber(), card3.getNumber(), card4.getNumber(), card5.getNumber());
        tfok.TestAllCards();
        if(tfok.isFourOfKind() == true){
            System.out.println("This hand has a four of a kind");
        }else{
            System.out.println("This hand does not have a four of a kind");
        }
        if(ttok.isThreeOfKind() == true && tp.checkNumberOfPairs() == 1){
            System.out.println("This hand is a full house"); 
        }else{
            System.out.println("This hand is not a full house");
        }
    }

}
