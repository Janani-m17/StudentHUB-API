package com.example.StudentInfo.service;

import com.example.StudentInfo.model.StudentDetails;

import java.util.List;

public interface StudentDetailsService {

    public String createstudentdetails(StudentDetails stddet);
    public String updatestudentdetails(StudentDetails stddet);
    public String deletestudentdetails(String StdRollNo);
    public StudentDetails getstudentdetails(String StdRollNo);
    public List<StudentDetails> getAllStudentDetails();
}
