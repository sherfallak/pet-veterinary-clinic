package fallak.petveterinaryclinic.bootstrap;

import fallak.petveterinaryclinic.data.model.Owner;
import fallak.petveterinaryclinic.data.model.Vet;
import fallak.petveterinaryclinic.data.services.OwnerService;
import fallak.petveterinaryclinic.data.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

private final OwnerService ownerService;
private final VetService vetService;

    public DataLoader(final OwnerService ownerService, final VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("muhammad");
        owner1.setLastName("shahbaz");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner1.setId(2L);
        owner1.setFirstName("muhammad");
        owner1.setLastName("nawaz");

        ownerService.save(owner2);

        System.out.println("owner loaded...");

        Vet vet1=new Vet();
        vet1.setId(3L);
        vet1.setFirstName("Dr. ali");
        vet1.setLastName("khan");

        vetService.save(vet1);

        Vet vet2=new Vet();
        vet1.setId(4L);
        vet1.setFirstName("Dr. sheraz");
        vet1.setLastName("anjum");
        vetService.save(vet2);

        System.out.println("vet loaded...");

    }
}
