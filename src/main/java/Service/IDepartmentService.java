package Service;

import com.isetecourses.isetecourses.Entities.Department;

import java.util.List;
import java.util.Set;

public interface IDepartmentService {
    public List<Department> findAll();

    public Department findByIdDepartment(Long id);

    public Department addDepartment(Department d);
    public void DeleteDepartment(Long id);
    public Department updateDepartment(Long id , Department e);
    public void assignEtudiantToDepartment (Integer etudiantId, Integer departementId);


}
