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
        assertEquals(new Classe[0], objecteProva.getClasses());
    }
    
    @Test
    public void testGetPosicioClassesAvio() {
        assertEquals(3, objecteProva.getClasses());
    }
    
    @Test
    public void testMostrarComponentAvio() {
        System.out.println("\nLes dades de l'avió amb codi " + objecteProva.getCodi() + " són:");
        System.out.println("\nFabricant: " + objecteProva.getFabricant());
        System.out.println("\nModel: " + objecteProva.getModel());
        System.out.println("\nCapacitat: " + objecteProva.getCapacitat());
    }
    
    @Test
    public void testAfegirClasseAvio() {

        int capacitatClasses = 0;

        Classe classe = Classe.novaClasse();

        if (testSeleccionarClasseAvio(classe.getNom()) == -1) { //La classe no existeix

            for (int i = 0; i < objecteProva.getPosicioClasses(); i++) {
                capacitatClasses += objecteProva.getClasses()[i].getCapacitat();
            }

            if (capacitatClasses + classe.getCapacitat() <= objecteProva.getCapacitat()) {
                objecteProva.getClasses()[objecteProva.getPosicioClasses()] = classe;
            }

            objecteProva.setPosicioClasses(objecteProva.getPosicioClasses()+1);

        } else if (testSeleccionarClasseAvio(classe.getNom()) != -1 || capacitatClasses + classe.getCapacitat() > objecteProva.getCapacitat()) {
            System.out.println("\nLa classe no s'ha pogut afegir");
        }

    }
    
    @Test
    public int testSeleccionarClasseAvio(String nom) {

        boolean trobat = false;
        int pos = -1;

        for (int i = 0; i < objecteProva.getPosicioClasses() && !trobat; i++) {
            if (objecteProva.getClasses()[i].getNom().equals(nom)) {
                pos = i;
                trobat = true;
            }
        }

        return pos;
    }
}
