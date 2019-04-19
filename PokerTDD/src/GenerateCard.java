/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author green_q7uklsw
 */
public class GenerateCard {
    public int generateSuit(){
        int genSuit = (int) (Math.random()* 4) + 1;
        return genSuit;
    }
    
    public int generateNumber(){
        int getNumber = (int) (Math.random()* 13) + 1;
        return getNumber;
    }
}
