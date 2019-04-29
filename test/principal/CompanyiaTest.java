/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import components.Avio;
import components.Ruta;
import components.Tripulant;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Albert
 */
public class CompanyiaTest {
    
    private Component[] componentsProva = new Component[2945];
    private Companyia objecteProva;
    
    @Before
    public void setUp() {
        objecteProva=new Companyia("Iberia");
    }
    
    @Test
    public void testGetCodiC() {
        assertEquals(1, objecteProva.getCodi());
    }
    
    @Test
    public void testGetNomC() {
        assertEquals("Iberia", objecteProva.getNom());
    }
    
    @Test
    public void testGetComponentsC() {
        Assert.assertArrayEquals(componentsProva, objecteProva.getComponents());
    }
    
    @Test
    public void testGetPosicioComponentsC() {
        assertEquals(1, objecteProva.getPosicioComponents());
    }
}
