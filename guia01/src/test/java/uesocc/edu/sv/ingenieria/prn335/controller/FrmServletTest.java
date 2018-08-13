/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.controller;

import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import uesocc.edu.sv.ingenieria.prn335.boundary.Utilidades;

/**
 *
 * @author root
 */
public class FrmServletTest {
    
    public FrmServletTest() {
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
     * Test of processRequest method, of class FrmServlet.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
       String texto=""; 
       Utilidades utilidades = new Utilidades();
       HttpServletRequest request = Mockito.mock(HttpServletRequest.class);
       Mockito.when(request.getContextPath()).thenReturn("/Metodo 2");
       Mockito.when(request.getParameter("texto")).thenReturn(texto.toString());
       HttpServletResponse response = Mockito.mock(HttpServletResponse.class);
        
        StringWriter sw=new StringWriter();
        PrintWriter pw=new PrintWriter(sw);
        Mockito.when(response.getWriter()).thenReturn(pw);
        FrmServlet instance = new FrmServlet();
        instance.utilidades=utilidades;
        instance.processRequest(request, response);
        Mockito.verify(request,Mockito.atLeast(1)).getContextPath();
        pw.flush();
        assertTrue(sw.toString().contains("/Metodo 2"));
        
        assertTrue(sw.toString().contains("El resultado del texto es "+texto));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of doGet method, of class FrmServlet.
     */
   /* @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        FrmServlet instance = new FrmServlet();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class FrmServlet.
     */
   /* @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        FrmServlet instance = new FrmServlet();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class FrmServlet.
     */
   /* @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        FrmServlet instance = new FrmServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}