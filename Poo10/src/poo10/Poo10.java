/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10;

/**
 *
 * @author lpaschoal
 */
public class Poo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Lucas", "Brasil", 25, 1.70f, 75.0f, 30, 1, 2);
        l[0].apresentar();
    }
    
}
