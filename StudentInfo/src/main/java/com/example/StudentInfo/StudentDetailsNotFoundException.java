package com.example.StudentInfo;

@SuppressWarnings("serial")
public class StudentDetailsNotFoundException extends RuntimeException{

    public StudentDetailsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentDetailsNotFoundException(String message) {
        super(message);
    }
}
