
package adoptapet;

/**
 * The pet class.
 */
public class Pet implements Comparable<Pet> {
    
    String name;
    int dob;
    String species;
    /**
     * Creates a new pet
     * @param name String pet name
     * @param dob int date of birth
     * @param species String cat or dog
     */
    public Pet(String name, int dob, String species) {
        this.name = name;
        this.dob = dob;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    /**
     * Compare to compares pets by date of birth.
     * @param oPet the other pet we're compaing to.
     * @return result.
     */
    @Override
    public int compareTo(Pet oPet) {
        if (this.dob < oPet.getDob()) {
            return 1;
        } else if (this.dob == oPet.getDob()) {
            return 0;
        } else {
            return -1;
        }
    }

}
