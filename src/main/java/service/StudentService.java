package service;
import configuration.JPAConfiguration;
import entity.Docent;
import entity.Student;
import repository.DocentRepository;
import repository.StudentRepository;
import java.util.List;

public class StudentService {

    private final StudentRepository repository;

    public StudentService() {
        this.repository = new StudentRepository(JPAConfiguration.getEntityManager());
    }

    public Student insertStudent(Student student) {
        return repository.createStudent(student);
    }

    public List<Student> getAllStudents() {
        return repository.getStudenten();
    }



}
