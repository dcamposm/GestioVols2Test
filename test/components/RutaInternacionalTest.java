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
public class RutaInternacionalTest {
    
    private RutaInternacional objecteProva, rutaIntercontinental;
    
    @Before
    public void setUp() {
        objecteProva = new RutaInternacional("0003", "SpainA1", "ProtugalBBB", "Spain", "Portugal", 400);
        rutaIntercontinental= new RutaIntercontinental("0001", "SpainA1", "USABBB1", "Spain", "China", "Europa", "Asia", 7000);
    }
    
    @Test
    public void testGetPaisOriRutaInternacional() {
        assertEquals("Spain", objecteProva.getPaisOri());
    }
    
    @Test
    public void testGetPaisOriRutaIntercontinental() {
        assertEquals("Spain", rutaIntercontinental.getPaisOri());
    }
    
    @Test
    public void testGetPaisDesRutaInternacional() {
        assertEquals("Portugal", objecteProva.getPaisDes());
    }
    
    @Test
    public void testGetPaisDesRutaIntercontinental() {
        assertEquals("China", rutaIntercontinental.getPaisOri());
    }
}
