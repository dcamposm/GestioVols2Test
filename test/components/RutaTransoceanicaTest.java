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
 * @author Albert
 */
public class RutaTransoceanicaTest {
    
    private RutaTransoceanica objecteProva;
    
    @Before
    public void setUp() {
        objecteProva=new RutaTransoceanica("R001", "El Prat", "NY Airport", "Espanya", "EEUU", "Europa", "Amèrica", "Atlàntic", 1000);
    }
    
    @Test
    public void testGetOceaRT() {
        assertEquals("Atlàntic", objecteProva.getOcea());
    }
    
}