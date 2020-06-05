package livraison_oiseau;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * When creating a package, it is empty so its weight is only 100grams.
 * We enter the city where it must be delivered and the person to whom it must be delivered.
 *
 * @author Julienne & Marie
 * @version (20 / 03 / 20)
 */
public class Package implements  Aggregate, Composant{
    public DeliveryNote DeliveryNote;
    //instance variables

    private double weight;
    private String address;
    private String recipient;

    private Collection children;



    /**
     * Package class constructor
     */
    public Package(String address, String recipient)
    {
        //initializing variables
        this.address = address;
        weight = 0.1;
        this.recipient = recipient;
        children=new ArrayList();
    }

    public Package(String address, String recipient, double weight)
    {
        //initializing variables
        this.address = address;
        this.weight = weight;
        this.recipient = recipient;
        children=new ArrayList();
    }

    public Package(double weight)
    {
        //initializing variables
        this.weight = weight;
        children=new ArrayList();

    }

    public Package(){
        children=new ArrayList();
    }

    public void add(Composant c){
        children.add(c);
    }

    public void remove(Composant c){
        children.remove(c);
    }

    public Collection getChildren() {
        return children;
    }

    /**
     * a setter for the address
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * a getter for the address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * a getter for the recipient
     */
    public String getRecipient()
    {

        return recipient;
    }

    /**
     *Method for adding charge to the package
     *
     */
    public double loadingPackage(double charge)
    {
        weight += charge;
        return weight;

    }





    public Iterator<Package> createIterator(){
        return children.iterator();
    }



    @Override
    public double getWeight() {
        double result= weight;
        Composant composant;
        Iterator<Package> i = createIterator();
        while (i.hasNext() ) {
            composant=(Composant)i.next();
             result+= composant.getWeight(); }
        return result;
    }


}
