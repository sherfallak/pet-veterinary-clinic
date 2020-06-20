package fallak.petveterinaryclinic.data.model;

public class PetType extends BaseEntity {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}
