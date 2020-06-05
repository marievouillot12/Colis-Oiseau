package livraison_oiseau;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Describe your class DeliveryNote" here:
 * The delivery note will include the weight of his package as well as the price
 * paid to send it. The price is calculated such that 1 kilo costs 10.50 €
 *
 * @author (Julienne & Marie )
 * @version (20/03/2020)
 */
public class DeliveryNote
{
    //instance variables

    private double price;
    double totalWeight;
    protected List<Package> packageList = new ArrayList<Package>();

    /**
     * DeliveryNote class constructor
     */
    public DeliveryNote()
    {
        // initializing variables
        price = 0;
    }

    public DeliveryNote(List<Package> packageList) {
        this.packageList = packageList;
    }

    /**
     * a setter for the package
     */
    public void setPack(Package pack){
        this.packageList.add(pack);
        pack.DeliveryNote = this;
    }
    public List<Package> getPack()
    {
        return packageList;
    }

    /**
     * a getter for the price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * a getter pour the weight
     */
    public double getTotalWeight()
    {
        for (Package pack : packageList)
            totalWeight += pack.getWeight();
        return totalWeight;
    }


    /**
     * @return     the total price depending on the weight
     */
    public double calculationPrice()
    {
        price = totalWeight*10.5;
        return price;

    }
}
