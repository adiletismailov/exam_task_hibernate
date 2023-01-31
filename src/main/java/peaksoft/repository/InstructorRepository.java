package peaksoft.repository;

import peaksoft.entity.Instructor;

import java.util.List;

public interface InstructorRepository {
    String saveInstructor(Instructor instructor);
    Instructor getInstructorById(Long id);
    String updateInstructor(Long id, Instructor newInstructor);
    String deleteInstructor(Long id);

}