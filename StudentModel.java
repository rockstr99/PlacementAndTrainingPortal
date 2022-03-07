package com.tulas.models;

import java.time.LocalDate;

public class StudentModel extends userModel{
    private int marks;
    public studentModel(Sting name, LocalDate dob, int marks){
        this.marks = marks;
        String first_name;
        String last_name ;
        String student_course;
        String student_branch;
        int percentage_10th;
        int  percentange_12th;
        int num_backlog;
        boolean backlog;
        long contact;
        String email;
        int college_id;
        String password;
        super(name,dob);


    }
}

{
    //this is student model which is subclass of userModel

}
