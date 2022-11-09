public class Student {
    private String name, id;
    private Project project;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    Student(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    public Project getProject() {
        return project;
    }

}