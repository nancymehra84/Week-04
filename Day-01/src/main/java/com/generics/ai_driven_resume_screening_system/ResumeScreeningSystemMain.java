package com.generics.ai_driven_resume_screening_system;

import java.util.Arrays;
import java.util.List;

public class ResumeScreeningSystemMain {
    public static void main(String[] args) {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Nancy Mehra", "Responsible for writing code.");
        DataScientist dataScientist = new DataScientist("Rishika Bisht", "Responsible for analyzing data and building models.");
        ProductManager productManager = new ProductManager("Pratham Raj", "Responsible for overseeing product development.");
        Resume<SoftwareEngineer> resume1 = new Resume<>(softwareEngineer, "Nancy Mehra");
        Resume<DataScientist> resume2 = new Resume<>(dataScientist, "Rishika Bisht");
        Resume<ProductManager> resume3 = new Resume<>(productManager, "Pratham Raj");
        resume1.displayResumeDetails();
        resume2.displayResumeDetails();
        resume3.displayResumeDetails();
        List<JobRole> jobRoles = Arrays.asList(softwareEngineer, dataScientist, productManager);
        ResumeScreeningSystem.processResumes(jobRoles);
    }
}
