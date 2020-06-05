package stepDefs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import livraison_oiseau.DeliveryNote;
import livraison_oiseau.Package;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrixColisStepDefs {


    Package pack1 = new Package(0.9);
    Package pack2 = new Package(0.1);
    DeliveryNote dv1= new DeliveryNote(Arrays.asList(pack1,pack2));


    @Given("le remplissage d'un bon de livraison <dv1> avec deux colis")
    public void bonLivraison() throws Exception {
        List<Package> liste= new ArrayList<>();
        liste=dv1.getPack();
        assertTrue(!liste.isEmpty());

    }
    @When("les colis du bon de livraison ont un poids total <totalWeight1>")
    public void calculPoidsTotal() throws Exception {
        double totalWeight1 = dv1.getTotalWeight();
        assertTrue(totalWeight1 == 1);

    }
    @Then("le prix du colis <price> sera automatiquement calculé")
    public void calculPrix() throws Exception {
        double price=dv1.calculationPrice();
        assertTrue(price == 10.5);


    }
}
