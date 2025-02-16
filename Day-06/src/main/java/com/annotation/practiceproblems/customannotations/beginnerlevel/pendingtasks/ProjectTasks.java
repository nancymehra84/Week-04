package com.annotation.practiceproblems.customannotations.beginnerlevel.pendingtasks;

public class ProjectTasks {
    //Marking method with a pending feature
    @Todo(task = "Implement user authentication", assignedTo = "Nancy", priority = "HIGH")
    public void userAuthentication() {
        System.out.println("Pending: Implement user authentication");
    }

    //Marking another method with a pending feature
    @Todo(task = "Optimize database queries", assignedTo = "Muskan")
    public void optimizeDatabase() {
        System.out.println("Pending: Optimize database queries");
    }
}