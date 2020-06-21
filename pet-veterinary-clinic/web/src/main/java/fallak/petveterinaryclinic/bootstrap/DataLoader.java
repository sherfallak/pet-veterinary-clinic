package fallak.petveterinaryclinic.bootstrap;

import fallak.petveterinaryclinic.data.model.Owner;
import fallak.petveterinaryclinic.data.model.PetType;
import fallak.petveterinaryclinic.data.model.Vet;
import fallak.petveterinaryclinic.data.services.OwnerService;
import fallak.petveterinaryclinic.data.services.PetTypeService;
import fallak.petveterinaryclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

private final OwnerService ownerService;
private final VetService vetService;
private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {
        PetType dog=new PetType();
        dog.setName("Buldog");
        PetType saveDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        dog.setName("Manocat");
        PetType saveCatPetType=petTypeService.save(dog);


        Owner owner1=new Owner();
        owner1.setFirstName("muhammad");
        owner1.setLastName("shahbaz");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner1.setFirstName("muhammad");
        owner1.setLastName("nawaz");

        ownerService.save(owner2);

        Owner owner3=new Owner();
        owner1.setFirstName("sher");
        owner1.setLastName("fallak");

        ownerService.save(owner3);
        System.out.println("owner loaded...");

        Vet vet1=new Vet();
        vet1.setFirstName("Dr. ali");
        vet1.setLastName("khan");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet1.setFirstName("Dr. sheraz");
        vet1.setLastName("anjum");
        vetService.save(vet2);

        System.out.println("vet loaded...");

    }
}
