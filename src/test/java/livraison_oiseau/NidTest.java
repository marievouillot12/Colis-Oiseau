package livraison_oiseau;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Classe-test test.NidTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class NidTest
{
    protected Nid nid1, nid2;
    protected Oiseau oiseau1, oiseau2, oiseau3, oiseau4;

    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        nid1 = new Nid("Brindilles", 4);
        oiseau1= new Oiseau("Pigeon", false);
        oiseau2 = new Oiseau("Rougegorge", true);
        oiseau3 = new Oiseau("Aigle", true);
        oiseau4 = new Oiseau("Autruche", false);
        nid1.setOiseau(oiseau1);
        oiseau1.setNid(nid1);
        nid1.setOiseau(oiseau2);
        oiseau2.setNid(nid1);
        nid1.setOiseau(oiseau3);
        oiseau3.setNid(nid1);
        nid1.setOiseau(oiseau4);
        oiseau4.setNid(nid1);

        nid2 = new Nid("Paille", 5);
    }

    @Test
    public void testGetOiseaux()
    {
        assertEquals(Arrays.asList(oiseau1, oiseau2, oiseau3, oiseau4),nid1.getOiseaux());
    }

    @Test
    public void testHabitat()
    {
        assertEquals("Pigeon habite Brindilles",nid1.habitat(0));
        assertEquals("Rougegorge habite Brindilles",nid1.habitat(1));
        assertEquals("Aigle habite Brindilles",nid1.habitat(2));
        assertEquals("Autruche habite Brindilles",nid1.habitat(3));
        assertEquals("nid en Paille", nid2.habitat(0));
        assertEquals("nid en Paille", nid2.habitat(1));
        assertEquals("nid en Paille", nid2.habitat(2));
    }
}

