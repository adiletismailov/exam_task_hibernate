package peaksoft.service;

import peaksoft.entity.Instructor;
import peaksoft.repository.InstructorRepository;
import peaksoft.repository.InstructorRepositoryImpl;

import java.util.List;

public class InstructorServiceImpl implements InstructorService {
    InstructorRepository instructorRepository = new InstructorRepositoryImpl();

    @Override
    public String saveInstructor(Instructor instructor) {
        return instructorRepository.saveInstructor(instructor);
    }

    @Override
    public Instructor getInstructorById(Long id) {
        return instructorRepository.getInstructorById(id);
    }

    @Override
    public String updateInstructor(Long id, Instructor newInstructor) {
        return instructorRepository.updateInstructor(id,newInstructor);
    }

    @Override
    public String deleteInstructor(Long id) {
        return instructorRepository.deleteInstructor(id);
    }
}
