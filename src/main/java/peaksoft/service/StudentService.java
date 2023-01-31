package peaksoft.service;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentService {
    String saveStudent(Student students);

    List<Student> getAllStudentsByInstructorId(Long id);

    String updateStudent(Long id, Student newStudents);

    String deleteStudent(Long id);

}
