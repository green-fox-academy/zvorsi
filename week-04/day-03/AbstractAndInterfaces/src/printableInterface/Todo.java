package printableInterface;

public class Todo implements Printable{

    String task;
    String priority;
    Boolean done;

    public Todo() {
    }

    public Todo(String task, String priority, Boolean done) {
        this.task = task;
        this.priority = priority;
        this.done = done;
    }

    @Override
    public void printAllFields() {
        System.out.println("Task: " + this.task + " | Priority: " + this.priority + " | Done: " + this.done);
    }
}
