package peaksoft.repository;

import jakarta.persistence.EntityManager;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Student;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public String saveStudent(Student student) {
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Save student: successfully!";
    }

    @Override
    public List<Student> getAllStudentsByInstructorId(Long id) {

        return null;
    }

    @Override
    public String updateStudent(Long id, Student newStudents) {
        return null;
    }

    @Override
    public String deleteStudent(Long id) {
        return null;
    }
}
