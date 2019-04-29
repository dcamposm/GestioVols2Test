/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
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
public class VolTest {
    private Vol objecteProva;
    
    @Before
    public void setUp() throws ParseException{
        objecteProva=new Vol("V001", new SimpleDateFormat("dd-MM-yyyy").parse("20-04-2019"), new SimpleDateFormat("dd-MM-yyyy").parse("26-04-2019"), LocalTime.of(5, 0, 0, 0), LocalTime.of(11, 30, 0, 0));
    }
    
    @Test
    public void testGetCodiVol() {
        assertEquals("V001", objecteProva.getCodi());
    }
    
    @Test
    public void testGetRutaVol() {
        assertEquals(null, objecteProva.getRuta());
    }

    @Test
    public void testGetAvioVol() {
        assertEquals(null, objecteProva.getAvio());
    }
    
    @Test
    public void testGetDataSortidaVol() throws ParseException {
        assertEquals(new SimpleDateFormat("dd-MM-yyyy").parse("20-04-2019"), objecteProva.getDataSortida());
    }
    
    @Test
    public void testGetDataArribadaVol() throws ParseException {
        assertEquals(new SimpleDateFormat("dd-MM-yyyy").parse("26-04-2019"), objecteProva.getDataArribada());
    }
    
    @Test
    public void testGetHoraSortidaVol() {
        assertEquals(LocalTime.of(5, 0, 0, 0), objecteProva.getHoraSortida());
    }
    
    @Test
    public void testGetHoraArribadaVol() {
        assertEquals(LocalTime.of(11, 30, 0, 0), objecteProva.getHoraArribada());
    }
    
    @Test
    public void testGetCapVol() {
        assertEquals(0, objecteProva.getCap());
    }
}
