import java.util.ArrayList;

/**
 * It creates a class called Elevage that extends the Volaille class.
 */
public class Elevage extends Volaille {
    ArrayList<Volaille> listeVolailles;
    ArrayList<Double> listePrix;

   // A constructor.
    public Elevage(ArrayList<Volaille> listeVolailles, ArrayList<Double> listePrix) {
        this.listeVolailles = listeVolailles;
        this.listePrix = listePrix;
    }

   /**
    * // Java
    * public void ajoutElevage(Volaille v) {
    *         listeVolailles.add(v);
    *     }
    * 
    * @param v the object to add to the list
    */
    public void ajoutElevage(Volaille v) {
        listeVolailles.add(v);
    }

  /**
   * It prints the list of volailles
   */
    public void afficherElevage() {
        for (int i = 0; i < listeVolailles.size(); i++) {
            System.out.println(listeVolailles.get(i).toString());
        }
    }

      /**
    * Method to update - mis a jour le list des vollaile . It takes a Canard and a Poulet as parameters, and then loops through the listeVolailles list
    * 
    * @param c Canard
    * @param p Poulet
    */
 
    public void maj() {
        for (int i = 0; i < listeVolailles.size(); i++) {
            System.out.print("Matricule : " + listeVolailles.get(i).getNumeroMat());
            System.out.println("Entrez un nouvel age : ");
            listeVolailles.get(i).age = Terminal.lireInt();
            System.out.println("Entrez un nouveau poids : ");
            listeVolailles.get(i).poids = Terminal.lireDouble();
        }
    }

   /**
    * It takes a Canard and a Poulet as parameters, and then loops through the listeVolailles list, and
    * if the type of the Volaille is a P, it adds the price of the Poulet multiplied by the weight of
    * the Volaille to the listePrix list, otherwise it adds the price of the Canard multiplied by the
    * weight of the Volaille to the listePrix list
    * 
    * @param c Canard
    * @param p Poulet
    */
    public void calculPrixAbbatage(Canard c, Poulet p) {
        for (int i = 0; i < listeVolailles.size(); i++) {
            if (listeVolailles.get(i).getType() == 'P') {
                listePrix.add((p.getPrixPoulet() * listeVolailles.get(i).getPoids()));
            } else {
                listePrix.add((c.getPrixCanard() * listeVolailles.get(i).getPoids()));
            }
        }
    }

    /**
     * It displays the poultry that can be slaughtered
     * 
     * @param c Canard
     * @param p Poulet
     */
    public void afficherVolailleAbbatage(Canard c, Poulet p) {
        for (int i = 0; i < listeVolailles.size(); i++) {
            if (listeVolailles.get(i).getType() == 'P') {
                if (listeVolailles.get(i).getPoids() >= c.getPoidAbbatageCanard()) {
                    System.out.println(listeVolailles.get(i).toString());
                    System.out.println("Prix : "+listePrix.get(i));
                }
            } else {
                if (listeVolailles.get(i).getPoids() >= p.getPoidAbbatagePoulet()) {
                    System.out.println(listeVolailles.get(i).toString());
                    System.out.println("Prix : "+listePrix.get(i));
                }

            }
        }
    }
}
