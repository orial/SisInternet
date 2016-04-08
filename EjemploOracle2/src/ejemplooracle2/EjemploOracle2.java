/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplooracle2;

import javax.persistence.Persistence;

/**
 *
 * @author Lupi
 */
public class EjemploOracle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persistence.generateSchema("EjemploOracle2PU", null);
    }
    
}
