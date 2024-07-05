package ua.develop.universitymanagement.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.develop.universitymanagement.model.Student;
import ua.develop.universitymanagement.service.StudentService;

import java.util.UUID;

@RestController("/api/university")
@AllArgsConstructor
public class StudentController {
    private StudentService service;

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @GetMapping("/student")
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentById(@PathVariable UUID id){
        return service.getStudentById(id);
    }
}
