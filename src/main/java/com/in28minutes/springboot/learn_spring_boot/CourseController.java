package com.in28minutes.springboot.learn_spring_boot;

// Create a Simple restAPI
//http://localhost:8080/courses
// Course: id, name, author

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes"),
                new Course(3, "LearnAzure", "in28minutes"),
                new Course(3, "Learn Python", "in28minutes")
        );
    }
}
