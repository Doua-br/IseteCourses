package Service;

import com.isetecourses.isetecourses.Entities.Department;
import com.isetecourses.isetecourses.Entities.Etudiant;
import com.isetecourses.isetecourses.Repository.DepartmentRepository;
import com.isetecourses.isetecourses.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class DepartmentSerVice implements IDepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    EtudiantRepository etudiantRepository;


    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();

    }

    @Override
    public Department findByIdDepartment(Long id) {
        Department department = departmentRepository.findAllByIdDepart(id);
        return department;    }

    @Override
    public Department addDepartment(Department d) {

        Department de = departmentRepository.save(d);
        return d;
    }

    @Override
    public void DeleteDepartment(Long id) {
        departmentRepository.deleteById(id);

    }

    @Override
    public Department updateDepartment(Long id,Department e) {
        Department eq = departmentRepository.findAllByIdDepart(id);
        eq.setIdDep(id);
        eq.setEtudiants(e.getEtudiants());
        eq.setNomDep(e.getNomDep());
        departmentRepository.save(eq);
        return eq;
    }

    @Override
    public void assignEtudiantToDepartment(Integer etudiantId, Integer departementId) {
        Etudiant e = etudiantRepository.findByIdEtudiant(new Long(etudiantId));
        Department d= departmentRepository.findAllByIdDepart(new Long(departmentId));
        d.getEtudiant().add(e);
        e.setDep(d);
        etudiantRepository.save(e);
        departmentRepository.save(d);

    }
}
