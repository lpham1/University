public class Course {
private String name;
private int id;
private int maxCapacity;
private boolean isFull;
private int StudentCount = 0;

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getMaxCapacity() {
    return maxCapacity;
}

public void setMaxCapacity(int maxCapacity) {
    this.maxCapacity = maxCapacity;
}

public boolean isFull() {
    return isFull;
}

public void setFull(boolean isFull) {
    this.isFull = isFull;
}

public int getStudentCount() {
    return StudentCount;
}

public void setStudentCount(int studentCount) {
    StudentCount = studentCount;
}

public Course(int id,String name,int maxCapacity, Professor prof){
this.id = id;
this.name = name;
this.maxCapacity = maxCapacity;

}

public void enroll(Student student){
    if(!isFull){
        StudentCount +=1;
        System.out.println("Added "+ student.getName());
    }
    if(StudentCount == maxCapacity){
        isFull = true;
        System.out.println("This course is already full");
    }
}
}
