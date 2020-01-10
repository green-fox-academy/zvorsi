package TodoClasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArgumentHandling {

    private String[] args;

    public ArgumentHandling(String[] args) throws IOException {
        this.args = args;
        decide();
    }

    private void decide() throws IOException {
        //teljesuljenek a feltetelek
        if (this.args.length < 1) {
            System.out.println("please enter an argument");
        } else if (this.args.length == 1 && this.args[0].equals("-l")) {
            ReadFile readFile = new ReadFile();

        } else if (this.args.length == 2 && this.args[0].equals("-a")) {
            AddTask addTask = new AddTask(this.args[1]);

        } else if (this.args.length == 2 && this.args[0].equals("-r")){
            RemoveTask removeTask = new RemoveTask(this.args[1]);

        } else if (this.args.length == 2 && this.args[0].equals("-c")) {
            // itt hozza kell adni a sorhoz egy jelolo karaktert, vagy a "done" szot, string concatenate? de hogyan?
            //RemoveTask removeTask = new RemoveTask(this.args[1]);
            //AddTask addTask = new AddTask(this.args[1]);

            CompleteTask completeTask = new CompleteTask(this.args[1]);

        }else {
            System.out.println("bad");
        }
        // mi fusson le
    }
/*
    boolean areThereArguments() {
        return this.args.length > 0;
    }*/
}
