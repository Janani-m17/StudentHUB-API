package com.example.StudentInfo.service;

import com.example.StudentInfo.StudentDetailsNotFoundException;
import com.example.StudentInfo.model.StudentDetails;
import com.example.StudentInfo.repository.StudentDetailsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {

    StudentDetailsRepository studentdetailsRepository;

    public StudentDetailsServiceImpl(StudentDetailsRepository studentdetailsRepository) {
        super();
        this.studentdetailsRepository = studentdetailsRepository;
    }

    @Override
    public String createstudentdetails(StudentDetails stddet) {
        studentdetailsRepository.save(stddet);
        return "Success";
    }

    @Override
    public String updatestudentdetails(StudentDetails stddet) {
        studentdetailsRepository.save(stddet);
        return "Success";
    }

    @Override
    public String deletestudentdetails(String StdRollNo) {
        studentdetailsRepository.deleteById(StdRollNo);
        return "Success";
    }

    @Override
    public StudentDetails getstudentdetails(String StdRollNo) {
        if (studentdetailsRepository.findById(StdRollNo).isEmpty())
            throw new StudentDetailsNotFoundException("Requested Student Details does not exists");
        return studentdetailsRepository.findById(StdRollNo).get();
    }

    @Override
    public List<StudentDetails> getAllStudentDetails() {
        return studentdetailsRepository.findAll();
    }

}
