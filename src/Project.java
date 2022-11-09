import java.util.ArrayList;

public class Project {
    private String name;
    private ArrayList<Student> members = new ArrayList<Student>();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Student> getMembers() {
        return members;
    }
    public void setMembers(ArrayList<Student> members) {
        this.members = members;
    }
    Project(String name) {
        this.name = name;

    }
    public void addMember(Student student){
        if(student.getProject() == null) {
            members.add(student);
            student.setProject(this);
        }
        else{
            System.out.println("This student is already  working on a project");
        }
    }

}
