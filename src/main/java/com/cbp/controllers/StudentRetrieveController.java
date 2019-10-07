package com.cbp.controllers;

// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cbp.beans.Student;
import com.cbp.beans.StudentRegistration;

import java.util.List;

@RestController
public class StudentRetrieveController {
    //  @RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
    @GetMapping("/student/allstudent")
    // @ResponseBody
    public List<Student> getAllStudents() {
        return StudentRegistration.getInstance().getStudentRecords();
    }
}
