package com.example.StudentInfo.controller;

import com.example.StudentInfo.ResponseHandler;
import com.example.StudentInfo.model.StudentDetails;
import com.example.StudentInfo.service.StudentDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentdetails")
public class StudentDetailsController {

    private StudentDetailsService studentdetailsService;
    @SuppressWarnings("unused")
    private String message;

    public StudentDetailsController(StudentDetailsService studentdetailsService) {
        super();
        this.studentdetailsService = studentdetailsService;
    }
    //read specific rollno
    @GetMapping("{StdRollNo}")
    public ResponseEntity<Object> getstudentdetails(@PathVariable("StdRollNo")String StdRollNo) {
        return ResponseHandler.responseBuilder(message = "Requested Student Details are given here", HttpStatus.OK,studentdetailsService.getstudentdetails(StdRollNo));
        //return studentdetailsService.getstudentdetails(StdRollNo);
    }
    //read all rollno
    @GetMapping()
    public List<StudentDetails> getAllStudentDetails() {
        //return new StudentDetails("22CC019","Janani","CCE","1","2","janani.m2022cce@sece.ac.in","17,Coimbatore","6379040717");
        return studentdetailsService.getAllStudentDetails();
    }
    @PostMapping
    public String createstudentdetails(@RequestBody StudentDetails stddet) {
        studentdetailsService.createstudentdetails(stddet);
        return "Student Details Created";
    }
    @PutMapping
    public String Updatestudentdetails(@RequestBody StudentDetails stddet) {
        studentdetailsService.updatestudentdetails(stddet);
        return "Student Details updated";
    }
    @DeleteMapping("{StdRollNo}")
    public String deletestudentdetails(@PathVariable("StdRollNo") String StdRollNo) {
        studentdetailsService.deletestudentdetails(StdRollNo);
        return "Student Details Deleted";
    }


}
