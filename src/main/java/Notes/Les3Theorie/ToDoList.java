package Notes.Les3Theorie;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> todos = new ArrayList<>();

    /**
     * add the task passed as parameter to the todo list.
     */
    public void add(String task){
        todos.add(task);
    }

    /**
     * prints the exercises.
     * Each task has a number associated with it on the print statement - use
     * the task's index here (1+).
     */
    public void print(){
        System.out.println(printString());
    }

    /**
     * prints the exercises.
     * Each task has a number associated with it on the print statement - use
     * the task's index here (1+).
     */
    public String printString(){
        String result = "";
        for (int i = 0; i < todos.size(); i++){
            if (i != 0){
                result += "\n";
            }
            result += (i + 1) + ": "+ todos.get(i);

        }
        return result;
    }




    /**
     * Removes the task associated with the given number;
     * the number is the one seen associated with the task in the print
     */
    public void remove(int number){
        todos.remove(number - 1);


    }
}
