package fallak.petveterinaryclinic.data.model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets=new HashSet<>();

    public String getAddress() {
        return this.address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(final String city) {
        this.city = city;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(final String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return this.pets;
    }

    public void setPets(final Set<Pet> pets) {
        this.pets = pets;
    }
}
