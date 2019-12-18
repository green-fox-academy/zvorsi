package TeacherStudent;

public class Teacher {

    private String teacher;

    public Teacher() {
        this.teacher = teacher;
    }

    public void answer(){
        System.out.println("answering");
    }

    public void teach(Student student) {
        student.learn();
    }
}
