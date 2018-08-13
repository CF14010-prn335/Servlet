/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.boundary;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of correctorTexto method, of class Utilidades.
     */
    @Test
    public void testCorrectorTexto() throws Exception{
        System.out.println("correctorTexto");
        String texto = "Habia unos estudiantes   les gustaba ir a la universidad   de El     Salvador";
        Utilidades instance = new Utilidades();
        String expResult = "Habia unos estudiantes les gustaba ir a la universidad de El Salvador";
        String result = instance.correctorTexto(texto);
        assertEquals(expResult, result);
    }  
}
