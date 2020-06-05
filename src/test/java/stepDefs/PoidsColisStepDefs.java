package stepDefs;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import livraison_oiseau.Package;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoidsColisStepDefs {

    Package pack1 = new Package(0.9);
    double charge1 = 1.1;

    @Given("le colis <pack1> pèse initialement 0.1 kg")
    public void CalculerPoidsColis() throws Exception {
        assertTrue(pack1.getWeight()==0.1);

    }
    @When("le client charge le colis <pack1> avec une charge <charge1>")
    public void chargeColis() throws Exception {
        pack1.loadingPackage(charge1);
        assertTrue(pack1.getWeight()!= 0);

    }
    @Then("le nouveau poids du colis <pack1> sera automatiquement calculé ")
    public void calculPoids() throws Exception {
        assertTrue(pack1.getWeight() == 1.2);

    }
}
