package com.cbp.controllers;
// import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
// import org.springframework.web.bind.annotation.RequestMethod

import com.cbp.beans.StudentRegistration;
import com.cbp.beans.StudentRegistrationReply;
import com.cbp.beans.Student;

@RestController
public class StudentRegistrationController {

    //@RequestMapping("/register/student")
    //@ResponseBody
    @PostMapping("/register/student")
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {

        System.out.println("In registerStudent");

        StudentRegistrationReply stdregreply = new StudentRegistrationReply();

        StudentRegistration.getInstance().add(student);

        //We are setting the below value just to reply a message back to the caller

        stdregreply.setName(student.getName());

        stdregreply.setAge(student.getAge());

        stdregreply.setRegistrationNumber(student.getRegistrationNumber());

        stdregreply.setRegistrationStatus("Successful");



        return stdregreply;

    }
}
