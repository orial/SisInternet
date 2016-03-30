/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica4a;

import javax.persistence.Persistence;

/**
 *
 * @author Lupi
 */
public class Practica4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persistence.generateSchema("practica4aPU", null);
    }
    
}
