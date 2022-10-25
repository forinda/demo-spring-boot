package com.forinda.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/hello")
    public String hello() {

        return "Hello world!";
    }

    @GetMapping("/student")
    public StudentModel getStudent() {
        StudentModel deno = new StudentModel(
                "Dennis Otieno",
                "S13/0788/20", false);
        return deno;
    }

    @GetMapping("/all-students")
    public List<StudentModel> getAllStudents() {
        StudentModel deno = new StudentModel(
                "Dennis Otieno",
                "S13/0788/20", false);
        StudentModel deno0 = new StudentModel(
                "Dennis Otieno",
                "S13/0788/20", false);
        StudentModel deno1 = new StudentModel(
                "Dennis Otieno",
                "S13/0788/20", false);
        StudentModel deno2 = new StudentModel(
                "Dennis Otieno",
                "S13/0788/20", false);
        return List.of(deno, deno0, deno1, deno2);
    }

}
