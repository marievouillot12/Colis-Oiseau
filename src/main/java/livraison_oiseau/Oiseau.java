package livraison_oiseau;



/**
 * Décrivez votre classe agilite.tp1.oiseau.com.livraison_oiseau.Oiseau ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Oiseau implements Composant
{
    // ici, les attributs de l'oiseau : Type et couleur de l'oiseau,
    //Ailes est une variable booléenne pour dire si l'oiseau a des ailes
    private String type;

    private boolean ailes;
    private Nid nid;
    private double weight;

    public Nid getNid() {
        return nid;
    }

    public void setNid(Nid nid) {
        this.nid = nid;
    }


    /**
     * Constructeur d'objets de classe agilite.tp1.oiseau.com.livraison_oiseau.Oiseau
     */
    public Oiseau(String type, boolean ailes)
    {
        // initialisation des variables d'instance
        this.type = type;
        this.ailes = ailes;
    }
    public  Oiseau(double weight){
        this.weight=weight;
    }



    public String getType(){
        return type;
    }


    public String bouger(){
        if (ailes){
            return "vole";
        }
        else {
            return "marche";
        }
    }

    @Override
    public double getWeight() {
        return this.weight;
    }

}

