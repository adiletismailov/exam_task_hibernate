package peaksoft.service;

import peaksoft.entity.Student;
import peaksoft.repository.StudentRepository;
import peaksoft.repository.StudentRepositoryImpl;

import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentRepository studentRepository = new StudentRepositoryImpl();
    @Override
    public String saveStudent(Student students) {
        return studentRepository.saveStudent(students);
    }

    @Override
    public List<Student> getAllStudentsByInstructorId(Long id) {
        return studentRepository.getAllStudentsByInstructorId(id);
    }

    @Override
    public String updateStudent(Long id, Student newStudents) {
        return studentRepository.updateStudent(id,newStudents);
    }

    @Override
    public String deleteStudent(Long id) {
        return studentRepository.deleteStudent(id);
    }
}
