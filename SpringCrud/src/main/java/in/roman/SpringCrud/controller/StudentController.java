package in.roman.SpringCrud.controller;

import in.roman.SpringCrud.model.Student;
import in.roman.SpringCrud.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


}
