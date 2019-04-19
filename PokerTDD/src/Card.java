/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author green_q7uklsw
 */
public class Card {
    private int suit;
    private int number;
    private String discriptSuit;
    private String discriptNumber;
    private GenerateCard cardGen = new GenerateCard();

    public int getSuit() {
        return suit;
    }

    public void setSuit() {
        this.suit = cardGen.generateSuit();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = cardGen.generateNumber();
    }

    public String getDiscriptSuit() {
        return discriptSuit;
    }

    public void setDiscriptSuit() {
        switch(suit){
            case 1:
                this.discriptSuit = "Clubs";
                break;
            case 2:
                this.discriptSuit = "Diamonds";
                break;
            case 3:
                this.discriptSuit = "Hearts";
                break;
            case 4:
                this.discriptSuit = "Spades";
                break;
            default:
                this.discriptSuit = "None";
                break;
        }
    }

    public String getDiscriptNumber() {
        return discriptNumber;
    }

    public void setDiscriptNumber() {
        switch(number){
            case 1:
                this.discriptNumber = "Ace";
                break;
            case 2:
                this.discriptNumber = "2";
                break;
            case 3:
                this.discriptNumber = "3";
                break;
            case 4:
                this.discriptNumber = "4";
                break;
            case 5:
                this.discriptNumber = "5";
                break;
            case 6:
                this.discriptNumber = "6";
                break;
            case 7:
                this.discriptNumber = "7";
                break;
            case 8:
                this.discriptNumber = "8";
                break;
            case 9:
                this.discriptNumber = "9";
                break;
            case 10:
                this.discriptNumber = "10";
                break;
            case 11:
                this.discriptNumber = "Jack";
                break;
            case 12:
                this.discriptNumber = "Queen";
                break;
            case 13:
                this.discriptNumber = "King";
                break;
            default:
                this.discriptNumber = "None";
                break;
        }
    }
    
    
        
}
