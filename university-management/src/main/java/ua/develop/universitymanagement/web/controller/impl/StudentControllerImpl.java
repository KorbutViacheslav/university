package ua.develop.universitymanagement.web.controller.impl;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.develop.universitymanagement.model.Student;
import ua.develop.universitymanagement.service.StudentService;
import ua.develop.universitymanagement.web.controller.StudentController;

import java.util.UUID;

@RestController
@RequestMapping("/api/university")
@AllArgsConstructor
public class StudentControllerImpl implements StudentController {

    private StudentService service;

    @PostMapping("/student")
    @ResponseStatus(HttpStatus.CREATED)
    @Override
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Override
    public Student getStudentById(@PathVariable UUID id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/student/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Override
    public void deleteStudentById(@PathVariable UUID id) {
        service.deleteStudentById(id);
    }

    @PatchMapping("/student/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Override
    public Student updateStudentById(Student student, UUID id) {
        return null;
    }

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public String hello() {
        return "Hello from test";
    }


}