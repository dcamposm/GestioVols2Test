/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DieCM
 */
public class AvioTest {
    
    private Avio objecteProva;
    
    @Before
    public void setUp(){
        objecteProva=new Avio("M001", "Bon Dia", "AAAA", 3);
    }
    
    @Test
    public void testGetCodiAvio() {
        assertEquals("M001", objecteProva.getCodi());
    }
    
    @Test
    public void testGetFabricantAvio() {
        assertEquals("Bon Dia", objecteProva.getFabricant());
    }

    @Test
    public void testGetModelAvio() {
        assertEquals("AAAA", objecteProva.getModel());
    }
    
    @Test
    public void testGetCapacitatAvio() {
        assertEquals(3, objecteProva.getCapacitat());
    }
    
    @Test
    public void testGetClassesAvio() {
        assertEquals(, objecteProva.getClasses());
    }
}
