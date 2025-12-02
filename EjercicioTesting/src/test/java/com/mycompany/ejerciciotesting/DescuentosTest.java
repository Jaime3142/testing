/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejerciciotesting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PC219
 */
public class DescuentosTest {
   @Test
    public void DescuentoVeterano(){
        Cliente c = new Cliente("jaime",8);
        assertEquals(10, Descuentos.calcularDescuento(c), "No es veterano");
        
    }
    
    @Test
    public void DescuentoNuevo(){
        Cliente c = new Cliente("jaime",4);
        assertEquals(0, Descuentos.calcularDescuento(c), "No es veterano");
        
    }
    
}
