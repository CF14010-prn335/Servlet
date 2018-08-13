/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uesocc.edu.sv.ingenieria.prn335.boundary;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@Stateless
@LocalBean
public class Utilidades implements Serializable {

    /** Este metodo recibe un texto,corrige el texto y elimina los dobles espacios en este.
    
     * @param texto recibe el texto que va ser modificado.
     * @return Retorna el texto sin dobles espacios.
    
    */ 
    
    public String correctorTexto(String texto){
        texto = texto.replaceAll(" +", " ");
        texto = texto.trim();
        return texto;
    }
}