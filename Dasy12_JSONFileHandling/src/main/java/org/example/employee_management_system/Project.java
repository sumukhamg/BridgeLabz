package org.example.employee_management_system;

public class Project {

    private int projectId;
    private String projectName;
    private boolean status;

    public Project(int projectId, String projectName, boolean status) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.status = status;
    }

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public boolean isStatus() {
        return status;
    }
}
