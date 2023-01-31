package peaksoft;

import peaksoft.config.HibernateConfig;
import peaksoft.entity.Instructor;
import peaksoft.entity.Student;
import peaksoft.service.InstructorService;
import peaksoft.service.InstructorServiceImpl;
import peaksoft.service.StudentService;
import peaksoft.service.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println(HibernateConfig.getEntityManager());

        InstructorService instructorService = new InstructorServiceImpl();
        Instructor instructor1 = new Instructor("Aijamal","Asangazieva",28);
        Instructor instructor2 = new Instructor("Muhammed","Toichubai uulu",26);
        Instructor instructor3 = new Instructor("Rahim","Bazarbai uulu",20);
        List<Instructor> instructors = new ArrayList<>(Arrays.asList(instructor1,instructor2,instructor3));

        System.out.println(instructorService.saveInstructor(instructor1));

        Student student = new Student("Adilet","Ismailov",22);
        instructor1.setStudents(Arrays.asList(student));

        StudentService studentService = new StudentServiceImpl();
//        studentService.saveStudent(new Student("Adilet","Ismailov",22));
//        studentService.saveStudent(new Student("Syimyk","Jumabek uulu",21));
//        studentService.saveStudent(new Student("Baiysh","Orozaliev",22));

   }
}
