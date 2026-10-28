package in.roman.SpringCrud;

import in.roman.SpringCrud.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCrudApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringCrudApplication.class, args);

//        System.out.println("hello world");

        StudentService obj=context.getBean(StudentService.class);

        obj.getStudents();


	}

}
