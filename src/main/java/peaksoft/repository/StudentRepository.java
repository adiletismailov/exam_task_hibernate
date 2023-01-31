package peaksoft.repository;

import peaksoft.entity.Student;

import java.util.List;

public interface StudentRepository {
    String saveStudent(Student student);
    List<Student> getAllStudentsByInstructorId(Long id);
    String updateStudent(Long id, Student newStudents);
    String deleteStudent(Long id);
}