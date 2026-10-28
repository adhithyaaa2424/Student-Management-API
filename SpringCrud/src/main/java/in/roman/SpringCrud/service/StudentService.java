package in.roman.SpringCrud.service;

import in.roman.SpringCrud.model.Student;
import in.roman.SpringCrud.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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

    public Student updateStudent(Integer id, Student student){
        return studentRepository.save(student);
    }


    public void deleteStudentById(Integer id) {
         studentRepository.deleteById(id);
    }
}
