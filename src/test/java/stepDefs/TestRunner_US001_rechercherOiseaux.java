package stepDefs;

import livraison_oiseau.Nid;
import livraison_oiseau.Oiseau;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestRunner_US001_rechercherOiseaux {

    Nid nid1 = new Nid("Brindilles", 4);
    Oiseau oiseau1= new Oiseau("Pigeon", false);
    Oiseau oiseau2 = new Oiseau("Rougegorge", true);
    Oiseau oiseau3 = new Oiseau("Aigle", true);
    Oiseau oiseau4 = new Oiseau("Autruche", false);

    @Given("^le nid$")
    public void leNid() throws Throwable {
        this.nid1.setOiseau(oiseau1);
        this.nid1.setOiseau(oiseau2);
        this.nid1.setOiseau(oiseau3);
        this.nid1.setOiseau(oiseau4);

        assertTrue(!nid1.isEmpty());
        throw new PendingException();
    }

    /*@When("^le dresseur valide la recherche$")
    public void leDresseurValideLaRecherche() throws Throwable {
        throw new PendingException();
    }*/

    @Then("^la liste des oiseaux habitants le nid est retournee$")
    public void laListeDesOiseauxHabitantsLeNidEstRetournee() throws Throwable {
        assertEquals(Arrays.asList(oiseau1, oiseau2, oiseau3, oiseau4),nid1.getOiseaux());
        throw new PendingException();
    }
}
