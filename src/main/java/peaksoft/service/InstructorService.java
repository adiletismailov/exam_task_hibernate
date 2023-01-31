package peaksoft.service;

import peaksoft.entity.Instructor;

import java.util.List;


public interface InstructorService {
    String saveInstructor(Instructor instructor);

    Instructor getInstructorById(Long id);

    String updateInstructor(Long id, Instructor newInstructor);

    String deleteInstructor(Long id);
}
