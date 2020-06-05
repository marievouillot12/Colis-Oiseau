package livraison_oiseau;

import static org.junit.jupiter.api.Assertions.*;

import io.cucumber.java.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class DeliveryNoteTest {

    @Test
    public void getPack() {
        DeliveryNote deliveryNote1 = new DeliveryNote();
        Package pack1 = new Package("Paris","marie");
        Package pack2 = new Package("Lyon","Julienne");

        deliveryNote1.setPack(pack1);
        deliveryNote1.setPack(pack2);

        List<Package> expectedPackageList = new ArrayList<Package>();
        expectedPackageList.add(pack1);
        expectedPackageList.add(pack2);

        List<Package> returnedPackageList = deliveryNote1.packageList;

        assertTrue (expectedPackageList.equals (returnedPackageList));
    }
    @Test
    public void getPrice() {
        DeliveryNote deliveryNote1 = new DeliveryNote();

        double expectedPrice= 0;
        double returnedPrice = deliveryNote1.getPrice();
        assertTrue(expectedPrice == returnedPrice);
    }
    @Test
    void getTotalWeight() {
        DeliveryNote deliveryNote1 = new DeliveryNote();
        Package pack1 = new Package("Paris","marie",0.9);
        Package pack2 = new Package("Lyon","Julienne",0.2);
        deliveryNote1.packageList.add(pack1);
        deliveryNote1.packageList.add(pack2);
        double expectedTotalWeight = 1.1;
        double returnedTotalWeight = deliveryNote1.getTotalWeight();
        assertTrue(expectedTotalWeight == returnedTotalWeight);
    }
    @Test
    public void calculationPrice() {
        DeliveryNote deliveryNote1 = new DeliveryNote();
        Package pack1 = new Package("Paris","marie",0.9);
        Package pack2 = new Package("Lyon","Julienne",0.2);

        deliveryNote1.packageList.add(pack1);
        deliveryNote1.packageList.add(pack2);

        double totalWeight = deliveryNote1.getTotalWeight();

        double expectedPrice = 11.55;
        double returnedPrice = deliveryNote1.calculationPrice();
        assertTrue(expectedPrice == returnedPrice);
    }
}