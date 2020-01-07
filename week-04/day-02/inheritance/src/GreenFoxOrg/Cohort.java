package GreenFoxOrg;

import java.util.ArrayList;

public class Cohort extends Person {

    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void addMentor(Mentor mentor){
        this.mentors.add(mentor);
    }

    public String info(){
        return "The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.";
    }
}
