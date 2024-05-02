package Service;

import com.isetecourses.isetecourses.Entities.Etudiant;

import java.util.List;
import java.util.Set;

public interface IEtudiantService {
    public List<Etudiant> findAll();

    public Etudiant findByIdEtudiant(Long id);

    public Etudiant addEtudiant(Etudiant c);
    public void DeleteEtudiant(Long id);

    public Etudiant updateEtudiant(Long id , Etudiant e);



    public Set<Etudiant> getEtudiantsByDepartement(Integer idDepartement);
}
