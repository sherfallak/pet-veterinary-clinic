package fallak.petveterinaryclinic.data.model;

import java.util.Set;

public class Owner extends Person {
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return this.pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
