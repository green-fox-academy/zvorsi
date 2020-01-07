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
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }


    public void introduce(){
        System.out.print("Hi, my name is: " + name + ", a " + age + " year old " + gender);
        specificIntroduce();
    }

    public void specificIntroduce(){
        System.out.println();
    }

    public String getGoal(){
        return "My goal is: Live for the moment!";
    }

}
