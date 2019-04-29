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
public class ClasseTest {
    
    private Classe objecteProva;
    
    @Before
    public void setUp(){
        objecteProva=new Classe("AAAA", 3);
    }
    
    @Test
    public void testGetNomClasse() {
        assertEquals("AAAA", objecteProva.getNom());
    }
    
    @Test
    public void testGetCapacitatClasse() {
        assertEquals("Bon Dia", objecteProva.getCapacitat());
    }
}
