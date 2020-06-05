package stepDefs;

import livraison_oiseau.Nid;
import livraison_oiseau.Oiseau;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestRunner_US002_rechercherMatiereNid {

    Nid nid1 = new Nid("Brindilles", 4);
    Oiseau oiseau1= new Oiseau("Pigeon", false);
    Oiseau oiseau2 = new Oiseau("Rougegorge", true);
    Oiseau oiseau3 = new Oiseau("Aigle", true);
    Oiseau oiseau4 = new Oiseau("Autruche", false);
    Nid nid2 = new Nid("Paille", 5);

    //Critères d'acceptance 1 : il existe au moins un oiseau habitant le nid
    @Given("^le nid et l’index de l'oiseau habitant ce nid$")
    public void leNid1EtIndexOiseau() throws Throwable {
        this.nid1.setOiseau(oiseau1);
        this.nid1.setOiseau(oiseau2);
        this.nid1.setOiseau(oiseau3);
        this.nid1.setOiseau(oiseau4);

        assertTrue(!nid1.isEmpty());
        throw new PendingException();
    }

    @When("^le dresseur valide la recherche$")
    public void leDresseurValideLaRechercheEtNidContientOiseau() throws Throwable {
        throw new PendingException();
    }

    @Then("^le type de l'oiseau ainsi que la matière du nid sont retournes$")
    public void typeOiseauEtMatiereDuNidSontRetournes() throws Throwable {
        assertEquals("Pigeon habite Brindilles",nid1.habitat(0));
        assertEquals("Rougegorge habite Brindilles",nid1.habitat(1));
        assertEquals("Aigle habite Brindilles",nid1.habitat(2));
        assertEquals("Autruche habite Brindilles",nid1.habitat(3));
        throw new PendingException();
    }

    /*//Critères d'acceptance 2 : il n'existe aucun oiseau habitant le nid
    @Given("^le nid et l’index de l'oiseau habitant ce nid$")
    public void leNid2EtIndexOiseau() throws Throwable {
        assertTrue(nid2.isEmpty());
        throw new PendingException();
    }

    @When("^le dresseur valide la recherche$")
    public void leDresseurValideLaRechercheEtNidVide() throws Throwable {
        throw new PendingException();
    }

    @Then("^le type de l'oiseau ainsi que la matière du nid sont retournes$")
    public void MatiereDuNidEstRetournee() throws Throwable {
        assertEquals("nid en Paille", nid2.habitat(0));
        assertEquals("nid en Paille", nid2.habitat(1));
        assertEquals("nid en Paille", nid2.habitat(2));
        throw new PendingException();
    }
*/
}
