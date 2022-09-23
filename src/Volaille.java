import java.util.ArrayList;

/**
 * The type Volaille.
 */
public class Volaille {

    /**
     * The Numero mat.
     */
// Declaring the variables.
    int numeroMat;
    /**
     * The Age.
     */
    int age;
    /**
     * The Poids.
     */
    double poids;
    /**
     * The Type.
     */
    char type;

    /**
     * Instantiates a new Volaille.
     *
     * @param numeroMat the numero mat
     * @param age       the age
     * @param poids     the poids
     * @param type      the type
     */
// A constructor.
    public Volaille(int numeroMat, int age, double poids ,char type) {
        this.numeroMat = numeroMat;
        this.age = age;
        this.poids = poids;
        this.type = type;
    }

    /**
     * Instantiates a new Volaille.
     */
    public Volaille(){}


    @Override
// A method that returns a string representation of the object.
    public String toString() {
        return "Volaille{" +
                "numeroMat=" + numeroMat +
                ", age=" + age + "jours" +
                ", poids=" + poids +
                ", type=" + type +
                '}';
    }

    /**
     * Gets numero mat.
     *
     * @return the numero mat
     */
    public int getNumeroMat() {
        return numeroMat;
    }

    /**
     * Sets numero mat.
     *
     * @param numeroMat the numero mat
     */
    public void setNumeroMat(int numeroMat) {
        this.numeroMat = numeroMat;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets poids.
     *
     * @return the poids
     */
    public double getPoids() {
        return poids;
    }

    /**
     * Sets poids.
     *
     * @param poids the poids
     */
    public void setPoids(double poids) {
        this.poids = poids;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public char getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(char type) {
        this.type = type;
    }
}
