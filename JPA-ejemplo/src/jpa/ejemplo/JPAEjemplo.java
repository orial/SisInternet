/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.ejemplo;

import javax.persistence.Persistence;

/**
 *
 * @author Lupi
 */
public class JPAEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persistence.generateSchema("JPA-ejemploPU", null);
    }
    
}
