import java.util.ArrayList;

/**
 * Class definisant la class Poulet
 */
public class Poulet extends Volaille{
    /**
     * aAttribut correspondant au prix du poulet e
     */
    double prixPoulet;
    /**
     * Attribut correspondant au poid abbatage du poulet.
     */
    double poidAbbatagePoulet;

    /**
     *
     * @param double  prixPoulet
     * @param double poidAbbatagePoulet
     */

    public Poulet(double prixPoulet,double poidAbbatagePoulet){
        this.prixPoulet = prixPoulet;
        this.poidAbbatagePoulet = poidAbbatagePoulet;
    }

    /**
     * double getPrix du poulet
     * @return
     */
    public double getPrixPoulet() {
        return prixPoulet;
    }

    /**
     * double setter poulet
     * @param prixPoulet
     */
    public void setPrixPoulet(double prixPoulet) {
        this.prixPoulet = prixPoulet;
    }

    public double getPoidAbbatagePoulet() {
        return poidAbbatagePoulet;
    }

    public void setPoidAbbatagePoulet(double poidAbbatagePoulet) {
        this.poidAbbatagePoulet = poidAbbatagePoulet;
    }

    /**
     *
     * @param method calculate prixdu prix
     * @param prixPoulet
     * @return
     */
    public double calculPrixPoulet(Volaille v, double prixPoulet){
        double prix = prixPoulet* v.getPoids();
        return prix;
    }




}
