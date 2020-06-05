package livraison_oiseau;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test test.OiseauTest.
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
public class OiseauTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    Oiseau oiseau1, oiseau2;
    Nid nid1;

    /**
     * Constructeur de la classe-test test.OiseauTest
     */
    public OiseauTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements

        oiseau1 = new Oiseau("Pigeon", false);
        oiseau2 = new Oiseau("Aigle", true);
        nid1 = new Nid("rotin",5);
        oiseau1.setNid(nid1);
        oiseau2.setNid(nid1);
    }

    @Test
    public void testSeDeplacer()
    {
        assertEquals("marche",oiseau1.bouger());
        assertEquals("vole",oiseau2.bouger());
        assertEquals(nid1,oiseau1.getNid());
        assertEquals(nid1,oiseau2.getNid());
        assertEquals(nid1.getCapacite(),5);
    }
}

