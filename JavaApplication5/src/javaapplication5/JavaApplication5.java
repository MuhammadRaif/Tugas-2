/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 *
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int g = 6;
        for (int h = 1; h <= g; h++) {
            for (int j = 1; j <= g; j++) {
                if ((j == 1 || j == g) || (h == 1 || h == g)) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
                System.out.print("");
            }
            System.out.println("");
        }
    }
}
