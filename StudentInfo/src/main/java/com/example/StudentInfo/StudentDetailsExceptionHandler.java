package com.example.StudentInfo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentDetailsExceptionHandler {

    @ExceptionHandler(value = {StudentDetailsNotFoundException.class})

    public ResponseEntity<Object> handleStudentDetailsNotFoundException
            (StudentDetailsNotFoundException studentDetailsNotFoundException)
    {
        StudentDetailsException studentDetailsException = new StudentDetailsException(studentDetailsNotFoundException.getMessage(),
                studentDetailsNotFoundException.getCause(),
                HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(studentDetailsException,HttpStatus.NOT_FOUND);

    }
}
