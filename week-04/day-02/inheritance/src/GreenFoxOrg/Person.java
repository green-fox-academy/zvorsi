package GreenFoxOrg;

public class Person {

    String name;
    Integer age;
    String gender;

    public Person(String name, Integer age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(){

    }


    public String Introduce(){
        return "Hi, my name is: " + name + ", a " + age + " year old " + gender;
    }

    public String getGoal(){
        return "My goal is: Live for the moment!";
    }

}
