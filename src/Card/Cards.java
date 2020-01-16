/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Card;

/**
 *
 * @author Expression Vaishnav is undefined on line 12, column 14 in Templates/Classes/Main.java.
 * @version
 */
public class Cards {

    /**
     * @param args the command line arguments
     */

    private static final String[] suites = {"Spades", "Clover", "Heart", "Diamond"};
    private static final String[] special = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
 
    public static void main(String[] args) {

        for(int i = 0; i < special.length; i++){
          //  System.out.println("\n" + special[i] + " of: \n===============");
           System.out.println();
            for(int j = 0; j < 4; j++)
                System.out.println(special[i] + " of " + suites[j]);
        }
    }

}
