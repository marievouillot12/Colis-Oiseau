package stepDefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import livraison_oiseau.Oiseau;
import livraison_oiseau.Package;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CompositionColisStepDefs {

    Package pack1 = new Package();
    Package pack2 = new Package();
    Oiseau oiseau1 = new Oiseau(3);

    @Given("Un colis <pack1> peut contenir un autre colis <pack2> afin de séparer les oiseaux")
    public void colisDansColis() throws Exception {
        pack1.add(pack2);
        assertTrue(pack1.getChildren().contains(pack2));
    }
    @When("Le Livreur rempli le colis")
    public void chargeColis() throws Exception {
        pack2.add(oiseau1);
    }
    @Then("Il pourra y mettre un colis <pack2> ou un oiseau <oiseau1>")
    public void choixDuComposant() throws Exception {
        assertTrue(pack2.getChildren().contains(oiseau1));
        assertEquals(false,pack1.getChildren().contains(pack2) && pack1.getChildren().contains(oiseau1));

    }
}
