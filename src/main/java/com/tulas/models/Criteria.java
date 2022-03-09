package com.tulas.models;

import com.tulas.enums.Departments;

public class Criteria {
    private String criteriaID;
    private Departments dept;
    private double matric_marks;
    private String matric_board;
    private String secondary_marks;
    private String secondary_board;
    private String Linkedin;
    private String resumeURL;
    private int backlog_count;
    private double college_per;
    private int passout_batch;

    public Criteria(String criteriaID,
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
        this.criteriaID = criteriaID;
        this.dept = dept;
        this.matric_marks = matric_marks;
        this.matric_board = matric_board;
        this.secondary_marks = secondary_marks;
        this.secondary_board = secondary_board;
        Linkedin = linkedin;
        this.resumeURL = resumeURL;
        this.backlog_count = backlog_count;
        this.college_per = college_per;
        this.passout_batch = passout_batch;
    }

    public String getCriteriaID() {
        return criteriaID;
    }

    public void setCriteriaID(String criteriaID) {
        this.criteriaID = criteriaID;
    }

    public Departments getDept() {
        return dept;
    }

    public void setDept(Departments dept) {
        this.dept = dept;
    }

    public double getMatric_marks() {
        return matric_marks;
    }

    public void setMatric_marks(double matric_marks) {
        this.matric_marks = matric_marks;
    }

    public String getMatric_board() {
        return matric_board;
    }

    public void setMatric_board(String matric_board) {
        this.matric_board = matric_board;
    }

    public String getSecondary_marks() {
        return secondary_marks;
    }

    public void setSecondary_marks(String secondary_marks) {
        this.secondary_marks = secondary_marks;
    }

    public String getSecondary_board() {
        return secondary_board;
    }

    public void setSecondary_board(String secondary_board) {
        this.secondary_board = secondary_board;
    }

    public String getLinkedin() {
        return Linkedin;
    }

    public void setLinkedin(String linkedin) {
        Linkedin = linkedin;
    }

    public String getResumeURL() {
        return resumeURL;
    }

    public void setResumeURL(String resumeURL) {
        this.resumeURL = resumeURL;
    }

    public int getBacklog_count() {
        return backlog_count;
    }

    public void setBacklog_count(int backlog_count) {
        this.backlog_count = backlog_count;
    }

    public double getCollege_per() {
        return college_per;
    }

    public void setCollege_per(double college_per) {
        this.college_per = college_per;
    }

    public int getPassout_batch() {
        return passout_batch;
    }

    public void setPassout_batch(int passout_batch) {
        this.passout_batch = passout_batch;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                "criteriaID='" + criteriaID + '\'' +
                ", dept=" + dept +
                ", matric_marks=" + matric_marks +
                ", matric_board='" + matric_board + '\'' +
                ", secondary_marks='" + secondary_marks + '\'' +
                ", secondary_board='" + secondary_board + '\'' +
                ", Linkedin='" + Linkedin + '\'' +
                ", resumeURL='" + resumeURL + '\'' +
                ", backlog_count=" + backlog_count +
                ", college_per=" + college_per +
                ", passout_batch=" + passout_batch +
                '}';
    }
}
