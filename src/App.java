public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, welcome to our uni");

        //create some students
        Student stu1 = new Student("7379001", "Anna");
        Student stu2 = new Student("7375888", "Bob");
        Student stu3 = new Student("7722331", "Max");

        //create some projects
        Project progPak = new Project("Progammierpraktikum");
        Project capstone = new Project("Capstone");
       
        //try adding student to a project
        progPak.addMember(stu1);
        capstone.addMember(stu1);
        
        //create some professors
        Professor prof1 = new Professor("Dumbledore",1);
        Professor prof2 = new Professor("Umbridge",2);

        //create a new course
        Course english = new Course(1, "English", 2, prof1);
        english.enroll(stu1);
        english.enroll(stu2);
        english.enroll(stu3);
       
    }
}
