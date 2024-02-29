package com.example.StudentInfo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentdetails")
public class StudentDetailsController {

    StudentDetails stddet;
    @GetMapping("{StudentRollNo}")
    public StudentDetails getStudentDetails(String StdRollNo){

        return stddet;
                //("22CC019","Janani","CCE","1","2","janani.m2022cce@sece.ac.in","17,Coimbatore","6379040717");
    }

    @PostMapping
    public String createstudentdetails(@RequestBody StudentDetails stddet) {
        this.stddet = stddet;
        return "Student Details Created";
    }

    @PutMapping
    public String updatestudentdetails(@RequestBody StudentDetails stddet) {
        this.stddet = stddet;
        return "Student Details Updated";
    }

    @DeleteMapping("{StdRollNo}")
    public String deletestudentdetails(String StdRollNo) {
        this.stddet = null;
        return "Student Details Deleted";
    }



}
