package stepDefs;

import livraison_oiseau.Nid;
import livraison_oiseau.Oiseau;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class TestRunner_US003_ajouterOiseauAuNid {

    Nid nid1 = new Nid("Brindilles", 6);
    Oiseau oiseau1= new Oiseau("Pigeon", false);
    Oiseau oiseau2 = new Oiseau("Rougegorge", true);
    Oiseau oiseau3 = new Oiseau("Aigle", true);
    Oiseau oiseau4 = new Oiseau("Autruche", false);
    Oiseau oiseau5 = new Oiseau("Chouette", true);
    Nid nid2 = new Nid("Paille", 1);

    //Critères d'acceptance 1 : il reste de l'espace au sein du nid
    @Given("^le nid contenant de la place$")
    public void leNidContenantEspace() throws Throwable {
        this.nid1.setOiseau(oiseau1);
        this.nid1.setOiseau(oiseau2);
        this.nid1.setOiseau(oiseau3);
        this.nid1.setOiseau(oiseau4);

        assertTrue(nid1.getOiseaux().size() < nid1.getCapacite());
        throw new PendingException();
    }

    @When("^le dresseur ajoute l'oiseau au nid$")
    public void leDresseurAjouteOiseauAuNid1() throws Throwable {
        this.nid1.setOiseau(oiseau5);
        throw new PendingException();
    }

    @Then("^le nid contient l'oiseau nouvellement ajouté$")
    public void nidContientOiseauAjoute() throws Throwable {
        assertTrue(nid1.getOiseaux().size() < nid1.getCapacite());
        assertEquals(oiseau5,this.nid1.getOiseau(4));
        throw new PendingException();
    }

    //Critères d'acceptance 2 : la capacité du nid a atteint sa limite
    @Given("^le nid plein$")
    public void leNidEstPlein() throws Throwable {
        this.nid2.setOiseau(oiseau1);
        assertTrue(nid1.getOiseaux().size() == nid1.getCapacite());
        assertEquals(oiseau1,this.nid2.getOiseau(0));
        throw new PendingException();
    }

    /*@When("^le dresseur ajoute l'oiseau au nid$")
    public void leDresseurAjouteOiseauAuNid2() throws Throwable {
        this.nid2.setOiseau(oiseau5);
        throw new PendingException();
    }*/

    @Then("^le nid reste tel quel et l'oiseau n'est pas ajouté$")
    public void oiseauPasAjouteAuNid() throws Throwable {
        assertTrue(nid1.getOiseaux().size() == nid1.getCapacite());
        assertEquals(oiseau1,this.nid2.getOiseau(0));
        assertNotEquals(oiseau5,this.nid1.getOiseau(2));
        throw new PendingException();
    }

}
