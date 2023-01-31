package peaksoft.repository;

import jakarta.persistence.EntityManager;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Instructor;


public class InstructorRepositoryImpl implements InstructorRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public String saveInstructor(Instructor instructor) {
        entityManager.getTransaction().begin();
        entityManager.merge(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Save instructor: successfully!";
    }

    @Override
    public Instructor getInstructorById(Long id) {
        entityManager.getTransaction().begin();
        Instructor instructor = entityManager.createQuery("select i from Instructor i join Student s on s.id = i.id where i.id = s.id",Instructor.class).getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return instructor;
    }

    @Override
    public String updateInstructor(Long id, Instructor newInstructor) {
        entityManager.getTransaction().begin();
        Instructor oldInstructor = entityManager.find(Instructor.class,id);
        oldInstructor.setFirstName(newInstructor.getFirstName());
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Successfully!";
    }

    @Override
    public String deleteInstructor(Long id) {
        entityManager.getTransaction().begin();
        Instructor instructor =  entityManager.find(Instructor.class,id);
        entityManager.remove(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Successfully: delete instructor";
    }
}
