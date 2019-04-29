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
public class TripulantTest {
    
    private Tripulant tripulantCabina, TCP;
    
    @Before
    public void setUp() {
        tripulantCabina=new TripulantCabina("AAAAAAAAA", "Anselmo", 35, 8000, "Comandant");
        TCP=new TCP("AAAAAAAAA", "Antonio", 40, 300);
    }
    
    @Test
    public void testGetPassaportTC() {
        assertEquals("AAAAAAAAA", tripulantCabina.getPassaport());
    }
    
    @Test
    public void testGetPassaportTCP() {
        assertEquals("AAAAAAAAA", TCP.getPassaport());
    }
    
    @Test
    public void testGetNomTC() {
        assertEquals("Anselmo", tripulantCabina.getNom());
    }
    
    @Test
    public void testGetNomTCP() {
        assertEquals("Antonio", TCP.getNom());
    }
    
    @Test
    public void testGetEdatTC() {
        assertEquals(35, tripulantCabina.getEdat());
    }
    
    @Test
    public void testGetEdatTCP() {
        assertEquals(40, TCP.getEdat());
    }
    
    @Test
    public void testGetHoresVolTC() {
        assertEquals(8000, tripulantCabina.getHoresVol());
    }
    
    @Test
    public void testGetHoresVolTCP() {
        assertEquals(300, TCP.getHoresVol());
    }
}
