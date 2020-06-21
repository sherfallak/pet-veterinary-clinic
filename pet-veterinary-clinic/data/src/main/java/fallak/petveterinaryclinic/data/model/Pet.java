package fallak.petveterinaryclinic.data.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDay;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return this.petType;
    }

    public void setPetType(final PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void setOwner(final Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(final LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
