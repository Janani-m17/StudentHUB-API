package com.example.StudentInfo;

public class StudentDetails {

    private String StdRollNo;
    private String StdName;
    private String StdDept;
    private String StdYear;
    private String StdSem;
    private String StdEmail;
    private String StdAddress;
    private String StdPhone;
    public StudentDetails(){
        super();
    }

    public StudentDetails(String stdRollNo, String stdName, String stdDept, String stdYear, String stdSem, String stdEmail, String stdAddress, String stdPhone) {
        super();
        StdRollNo = stdRollNo;
        StdName = stdName;
        StdDept = stdDept;
        StdYear = stdYear;
        StdSem = stdSem;
        StdEmail = stdEmail;
        StdAddress = stdAddress;
        StdPhone = stdPhone;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "StdRollNo='" + StdRollNo + '\'' +
                ", StdName='" + StdName + '\'' +
                ", StdDept='" + StdDept + '\'' +
                ", StdYear='" + StdYear + '\'' +
                ", StdSem='" + StdSem + '\'' +
                ", StdEmail='" + StdEmail + '\'' +
                ", StdAddress='" + StdAddress + '\'' +
                ", StdPhone='" + StdPhone + '\'' +
                '}';
    }

    public String getStdRollNo() {
        return StdRollNo;
    }

    public void setStdRollNo(String stdRollNo) {
        StdRollNo = stdRollNo;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String stdName) {
        StdName = stdName;
    }

    public String getStdDept() {
        return StdDept;
    }

    public void setStdDept(String stdDept) {
        StdDept = stdDept;
    }

    public String getStdYear() {
        return StdYear;
    }

    public void setStdYear(String stdYear) {
        StdYear = stdYear;
    }

    public String getStdSem() {
        return StdSem;
    }

    public void setStdSem(String stdSem) {
        StdSem = stdSem;
    }

    public String getStdEmail() {
        return StdEmail;
    }

    public void setStdEmail(String stdEmail) {
        StdEmail = stdEmail;
    }

    public String getStdAddress() {
        return StdAddress;
    }

    public void setStdAddress(String stdAddress) {
        StdAddress = stdAddress;
    }

    public String getStdPhone() {
        return StdPhone;
    }

    public void setStdPhone(String stdPhone) {
        StdPhone = stdPhone;
    }
}
