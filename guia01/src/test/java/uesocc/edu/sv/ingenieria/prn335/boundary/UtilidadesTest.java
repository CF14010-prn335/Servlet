/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.boundary;


import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
     * @throws java.lang.Exception
     */
    @Test
    public void testCorrectorTexto(){
        System.out.println("correctorTexto");
        String texto = "Hola  que     tal  ?";
        Utilidades instance = new Utilidades();
        String expResult = "Hola que tal ?";
        String result = instance.correctorTexto(texto);
        assertEquals(expResult, result);
            // TODO review the generated test code and remove the default call to fail.
            // fail("The test case is a prototype.");
        }
    }
    

