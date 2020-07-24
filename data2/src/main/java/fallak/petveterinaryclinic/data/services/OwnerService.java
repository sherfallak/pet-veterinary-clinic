package fallak.petveterinaryclinic.data.services;

import fallak.petveterinaryclinic.data.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
