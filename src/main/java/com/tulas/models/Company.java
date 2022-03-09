package com.tulas.models;
import com.tulas.enums.Departments;
import com.tulas.models.StudentModel;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyID;
    private String companyName;
    private String company_URL;
    private String industry_sector;
    private String company_desc;
    private String package_;
    private Criteria min_criteria;
    private List<StudentModel> students = new ArrayList<>();

    public Company(String companyID,
                   String companyName,
                   String company_URL,
                   String industry_sector,
                   String company_desc,
                   String package_,
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
        this.companyID = companyID;
        this.companyName = companyName;
        this.company_URL = company_URL;
        this.industry_sector = industry_sector;
        this.company_desc = company_desc;
        this.package_ = package_;
        this.min_criteria = new Criteria(companyID,
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

    public String getCompanyID() {
        return companyID;
    }

    public void setCompanyID(String companyID) {
        this.companyID = companyID;
    }

    public List<StudentModel> getStudents() {
        return students;
    }

    public void setStudents(List<StudentModel> students) {
        this.students = students;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompany_URL() {
        return company_URL;
    }

    public void setCompany_URL(String company_URL) {
        this.company_URL = company_URL;
    }

    public String getIndustry_sector() {
        return industry_sector;
    }

    public void setIndustry_sector(String industry_sector) {
        this.industry_sector = industry_sector;
    }

    public String getCompany_desc() {
        return company_desc;
    }

    public void setCompany_desc(String company_desc) {
        this.company_desc = company_desc;
    }

    public String getPackage_() {
        return package_;
    }

    public void setPackage_(String package_) {
        this.package_ = package_;
    }

    public Criteria getMin_criteria() {
        return min_criteria;
    }

    public void setMin_criteria(Criteria min_criteria) {
        this.min_criteria = min_criteria;
    }

    public void Apply(StudentModel student)
    {
        students.add(student);
    }

    public void getEligibleStudents()
    {
        for(StudentModel student : students)
        {
//            System.out.println(this.min_criteria.getBacklog_count());
//            System.out.println(student.getCriteria().getBacklog_count());
           if(this.min_criteria.getBacklog_count() >= student.getCriteria().getBacklog_count()) System.out.println(student);
        }
    }

}
