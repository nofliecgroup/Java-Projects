import java.util.ArrayList;

public class Canard extends Volaille{
    double prixCanard;
    double poidAbbatageCanard;

  // A constructor.
    public Canard(double prixCanard,double poidAbbatageCanard){
        this.prixCanard = prixCanard;
        this.poidAbbatageCanard = poidAbbatageCanard;
    }

    /**
     * This function returns the price of a duck
     * 
     * @return The price of the duck.
     */
    /**
     * This function returns the price of a duck
     * 
     * @return The price of the duck.
     */
    public double getPrixCanard() {
        return prixCanard;
    }

    /**
     * This function sets the price of a duck
     * 
     * @param prixCanard the price of the duck
     */
    public void setPrixCanard(double prixCanard) {
        this.prixCanard = prixCanard;
    }

   /**
    * // Java
    * public double getPoidAbbatageCanard() {
    *         return poidAbbatageCanard;
    *     }
    * 
    * @return The weight of the duck after it has been slaughtered.
    */
    public double getPoidAbbatageCanard() {
        return poidAbbatageCanard;
    }

    /**
     * This function sets the weight of the duck at the time of slaughter
     * 
     * @param poidAbbatageCanard the weight of the duck after slaughter
     */
    public void setPoidAbbatageCanard(double poidAbbatageCanard) {
        this.poidAbbatageCanard = poidAbbatageCanard;
    }

    /**
     * This function calculates the price of a duck
     * 
     * @param v Volaille
     * @param prixCanard the price of a duck
     * @return The price of the duck.
     */
    public double calculPrixCanard(Volaille v, double prixCanard){
        double prix = prixCanard*v.getPoids();
        return prix;
    }


}
