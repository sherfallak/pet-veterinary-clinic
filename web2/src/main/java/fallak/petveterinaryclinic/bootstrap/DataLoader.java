package fallak.petveterinaryclinic.bootstrap;

import fallak.petveterinaryclinic.data.model.*;
import fallak.petveterinaryclinic.data.services.OwnerService;
import fallak.petveterinaryclinic.data.services.PetTypeService;
import fallak.petveterinaryclinic.data.services.SpecialityService;
import fallak.petveterinaryclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

private final OwnerService ownerService;
private final VetService vetService;
private final PetTypeService petTypeService;
private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }


    @Override
    public void run(String... args) throws Exception {
        int count= petTypeService.findAll().size();
        if(count==0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog=new PetType();
        dog.setName("dog");
        PetType saveDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        dog.setName("cat");
        PetType saveCatPetType=petTypeService.save(dog);


        Owner owner1=new Owner();
        owner1.setFirstName("muhammad");
        owner1.setLastName("shahbaz");
        owner1.setAddress("kikerwala");
        owner1.setCity("Quetta");
        owner1.setTelephone("0123625489");

        Pet jonyPet=new Pet();
        jonyPet.setPetType(saveDogPetType);
        jonyPet.setOwner(owner1);
        jonyPet.setBirthDay(LocalDate.now());
        jonyPet.setName("Raqo");
        owner1.getPets().add(jonyPet);

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("muhammad");
        owner2.setLastName("nawaz");
        owner2.setAddress("cubic road");
        owner2.setCity("Sydny");
        owner2.setTelephone("0123625489");
        Pet fallakCat=new Pet();
        fallakCat.setName("Mano");
        fallakCat.setPetType(saveCatPetType);
        fallakCat.setBirthDay(LocalDate.now());
        fallakCat.setOwner(owner2);
        owner2.getPets().add(fallakCat);
        ownerService.save(owner2);

        Owner owner3=new Owner();
        owner3.setFirstName("sher");
        owner3.setLastName("fallak");

        ownerService.save(owner3);
        System.out.println("owner loaded...");
        //adding speciality
        Speciality radiology=new Speciality();
        radiology.setDescription("radiology");
        Speciality savedRadiology= specialityService.save(radiology);

        Speciality surgery=new Speciality();
        surgery.setDescription("surgery");
        Speciality savedSurgery= specialityService.save(surgery);

        Speciality dentistary=new Speciality();
        dentistary.setDescription("dentistary");
        Speciality savedDendistary= specialityService.save(dentistary);

        Vet vet1=new Vet();
        vet1.setFirstName("Dr. ali");
        vet1.setLastName("khan");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2=new Vet();
        vet2.setFirstName("Dr. sheraz");
        vet2.setLastName("anjum");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("vet loaded...");
    }
}
