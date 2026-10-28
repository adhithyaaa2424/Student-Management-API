package in.roman.SpringCrud.service;

import in.roman.SpringCrud.model.Student;
import in.roman.SpringCrud.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student createStudents(Student student){
        return studentRepository.save(student);
    }

}
