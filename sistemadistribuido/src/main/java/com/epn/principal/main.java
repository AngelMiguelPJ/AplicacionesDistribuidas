/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.principal;

import com.epn.entity.Materias;
import com.epn.session.MateriasJpaController;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Aplicaciones D
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //instancia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("laboratorio");
        
        //llamar a la clase controlador
        MateriasJpaController pjc = new MateriasJpaController(emf);
        
        Materias p = new Materias();
        p.setNombre("Distribuidas");
        p.setPrecio(BigDecimal.valueOf(13.97));
        
        pjc.create(p);
        
        
    }
    
}
