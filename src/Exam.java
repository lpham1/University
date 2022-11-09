public class Exam {
    private int maxValue;

public Exam(int maxValue){
this.maxValue = maxValue;
}

public void register(Student student){}

public void addQuestion(int id, String task, int value){
    Question newQues = new Question(id,task,value);
}

private static class Question {
    private String task;
    private int id, maxValue;

    public Question(int id, String task, int value) {
        this.id = id;
        this.task = task;
        this.maxValue = value;
    }
}

}

