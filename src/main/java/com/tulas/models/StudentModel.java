package com.tulas.models;

import com.tulas.enums.Departments;
import com.tulas.enums.Gender;

public class StudentModel extends UserModel{
    //this is student model which is subclass of userModel
    private String program;
    private Gender Gender;
    private String contactNumber;
    private Criteria criteria;

    public StudentModel(String program,Gender gender, String contactNumber,
                        Departments dept,
                        double matric_marks,
                        String matric_board,
                        String secondary_marks,
                        String secondary_board,
                        String linkedin,
                        String resumeURL,
                        int backlog_count,
                        double college_per,
                        int passout_batch) {
        this.program = program;
        Gender = gender;
        this.contactNumber = contactNumber;
        this.criteria = new Criteria(super.getCollegeID(),
        dept,
         matric_marks,
         matric_board,
         secondary_marks,
         secondary_board,
         linkedin,
         resumeURL,
         backlog_count,
        college_per,
        passout_batch);
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public com.tulas.enums.Gender getGender() {
        return Gender;
    }

    public void setGender(com.tulas.enums.Gender gender) {
        Gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "program='" + program + '\'' +
                ", Gender=" + Gender +
                ", contactNumber='" + contactNumber + '\'' +
                ", criteria=" + criteria +
                ", userName='" + getUserName() + '\'' +
                ", collegeID='" + getCollegeID() + '\'' +
                '}';
    }
}
