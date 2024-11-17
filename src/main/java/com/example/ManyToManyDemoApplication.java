package com.example;

import com.example.entity.Student;
import com.example.entity.Course;
import com.example.repository.StudentRepository;
import com.example.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyToManyDemoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(ManyToManyDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create Courses
        Course math = new Course();
        math.setTitle("Mathematics");

        Course science = new Course();
        science.setTitle("Science");

        courseRepository.save(math);
        courseRepository.save(science);

        // Create Students
        Student john = new Student();
        john.setName("John Doe");

        Student jane = new Student();
        jane.setName("Jane Doe");

        // Associate Students with Courses
        john.getCourses().add(math);
        john.getCourses().add(science);

        jane.getCourses().add(math);

        // Save Students
        studentRepository.save(john);
        studentRepository.save(jane);

        // Verify Data
        studentRepository.findAll().forEach(student -> {
            System.out.println("Student: " + student.getName());
            student.getCourses().forEach(course ->
                    System.out.println("  Course: " + course.getTitle())
            );
        });
    }
}


//http://localhost:8080/h2-console/login.jsp?jsessionid=58180e1bddef0718098459d3e80d15b0