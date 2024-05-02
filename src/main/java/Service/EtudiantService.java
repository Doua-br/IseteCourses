package Service;

import com.isetecourses.isetecourses.Entities.Etudiant;
import com.isetecourses.isetecourses.Repository.DepartmentRepository;
import com.isetecourses.isetecourses.Repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Set;

public class EtudiantService implements  IEtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;


    @Autowired
    DepartmentRepository departementRepository;
    public List<Etudiant> findAll()
    {

        return etudiantRepository.findAll();
    }
    public Etudiant findByIdEtudiant(Long id)
    {
        Etudiant etudiant = etudiantRepository.findByIdEtudiant(id);
        return etudiant;
    }

    public Etudiant addEtudiant(Etudiant c) {

        Etudiant co = etudiantRepository.save(c);
        return c;
    }
    public void DeleteEtudiant(Long id) {

        etudiantRepository.deleteById(id);

    }

    public Etudiant updateEtudiant(Long id , Etudiant e) {

        Etudiant eq = etudiantRepository.findByIdEtudiant(id);
        eq.setIdEtudiant(id);
        eq.setContrats(e.getContrats());
        eq.setOption(e.getOption());
        eq.setEquipes(e.getEquipes());
        eq.setNomE(e.getNomE());
        eq.setDepartement(e.getDepartement());
        eq.setPrenomE(e.getPrenomE());
        etudiantRepository.save(eq);
        return eq;

    }


    public Set<Etudiant> getEtudiantsByDepartement(Integer idDepartement)
    {
        return departementRepository.findByIdDepartment(new Long(idDepartement)).getEtudiants();

    }

}
