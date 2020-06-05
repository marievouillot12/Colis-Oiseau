package livraison_oiseau;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

public class PackageTest {
    @Test
    public void setAddress(){
        Package pack4=new Package ("Paris","Marie");
        pack4.setAddress("Marseille");

        String expectedAddress = "Marseille";
        String obtainedAddress = pack4.getAddress();
        assertTrue(obtainedAddress.equals(expectedAddress));
    }
    @Test
    public void getAddress() {
        Package pack1= new Package("Paris", "Maris");

        String expectedAddress = "Paris";
        String returnedAddress = pack1.getAddress();
        assertTrue (returnedAddress.equals(expectedAddress));
    }
    @Test
    void getRecipient() {
        Package pack2= new Package("Paris", "Julia");

        String expectedRecipient = "Julia";
        String returnedRecipient = pack2.getRecipient();
        assertTrue (expectedRecipient.equals (returnedRecipient));
    }

    @Test
    public void loadingPackage() {
        Package pack3= new Package("Paris", "Julia");
        double expectedWeight =1;
        double returnedWeight = pack3.loadingPackage(0.9);
        assertTrue(expectedWeight == returnedWeight);
    }

}