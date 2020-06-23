package fallak.petveterinaryclinic.data.services.map;

import fallak.petveterinaryclinic.data.model.Speciality;
import fallak.petveterinaryclinic.data.services.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
