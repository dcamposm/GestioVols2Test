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
public class RutaIntercontinentalTest {
    
    private RutaIntercontinental objecteProva, rutaTransoceanica;
    
    @Before
    public void setUp() {
        objecteProva= new RutaIntercontinental("0001", "SpainA1", "USABBB1", "Spain", "China", "Europa", "Asia", 7000);
        rutaTransoceanica= new RutaTransoceanica("0004", "SpainA1", "USABBB", "Spain", "USA", "Europa", "America", "Atlantico", 3000);
    }
    
    @Test
    public void testGetContinentOriRutaInternacional() {
        assertEquals("Europa", objecteProva.getPaisOri());
    }
    
    @Test
    public void testGetContinentOriRutaIntercontinental() {
        assertEquals("Europa", rutaTransoceanica.getPaisOri());
    }
    
    @Test
    public void testGetContinentDesRutaInternacional() {
        assertEquals("Asia", objecteProva.getPaisDes());
    }
    
    @Test
    public void testGetContinentDesRutaIntercontinental() {
        assertEquals("America", rutaTransoceanica.getPaisOri());
    }
}
