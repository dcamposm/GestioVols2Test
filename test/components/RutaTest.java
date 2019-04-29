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
public class RutaTest {
    
     private Ruta rutaIntercontinental, rutaNacional, rutaInternacional, rutaTransoceanica;
    
    @Before
    public void setUp(){
        rutaIntercontinental= new RutaIntercontinental("0001", "SpainA1", "USABBB1", "Spain", "China", "Europa", "Asia", 7000);
        rutaNacional= new RutaNacional("0002", "Spain", "SpainA1", "SpainBBB", 200);
        rutaInternacional= new RutaInternacional("0003", "SpainA1", "ProtugalBBB", "Spain", "Portugal", 400);
        rutaTransoceanica= new RutaTransoceanica("0004", "SpainA1", "USABBB", "Spain", "USA", "Europa", "America", "Atlantico", 3000);
    }
    
    @Test
    public void testGetCodiIntercontinental() {
        assertEquals("0001", rutaIntercontinental.getCodi());
    }
    
    @Test
    public void testGetCodiNacional() {
        assertEquals("0002", rutaNacional.getCodi());
    }
    
    @Test
    public void testGetCodiInternacional() {
        assertEquals("0003", rutaInternacional.getCodi());
    }
    
    @Test
    public void testGetCodiTransoceanica() {
        assertEquals("0004", rutaTransoceanica.getCodi());
    }
    
    @Test
    public void testGetAeroportOriIntercontinental() {
        assertEquals("SpainA1", rutaIntercontinental.getAeroportOri());
    }
    
    @Test
    public void testGetAeroportOriNacional() {
        assertEquals("SpainA1", rutaNacional.getAeroportOri());
    }
    
    @Test
    public void testGetAeroportOriInternacional() {
        assertEquals("SpainA1", rutaInternacional.getAeroportOri());
    }
    
    @Test
    public void testGetAeroportOriTransoceanica() {
        assertEquals("SpainA1", rutaTransoceanica.getAeroportOri());
    }
    
    @Test
    public void testGetAeroportDesIntercontinental() {
        assertEquals("USABBB1", rutaIntercontinental.getAeroportDes());
    }
    
    @Test
    public void testGetAeroportDesNacional() {
        assertEquals("SpainBBB", rutaNacional.getAeroportDes());
    }
    
    @Test
    public void testGetAeroportDesInternacional() {
        assertEquals("ProtugalBBB", rutaInternacional.getAeroportDes());
    }
    
    @Test
    public void testGetAeroportDesTransoceanica() {
        assertEquals("USABBB", rutaTransoceanica.getAeroportDes());
    }
    
    @Test
    public void testGetDistanciaIntercontinental() {
        assertEquals(7000, rutaIntercontinental.getDistancia());
    }
    
    @Test
    public void testGetDistanciaNacional() {
        assertEquals(200, rutaNacional.getDistancia());
    }
    
    @Test
    public void testGetDistanciaInternacional() {
        assertEquals(400, rutaInternacional.getDistancia());
    }
    
    @Test
    public void testGetDistanciaTransoceanica() {
        assertEquals(3000, rutaTransoceanica.getDistancia());
    }
}
