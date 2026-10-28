package in.roman.SpringCrud.controller;

import in.roman.SpringCrud.model.Student;
import in.roman.SpringCrud.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService= studentService;
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    public Student createStudents(@RequestBody Student student){
       return studentService.createStudents(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student studentDetails){

        return  studentService.updateStudent(id, studentDetails);

    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){

         studentService.deleteStudentById(id);
    }


}
