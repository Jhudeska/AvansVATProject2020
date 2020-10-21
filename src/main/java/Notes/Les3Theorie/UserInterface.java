package Notes.Les3Theorie;

import Notes.Les3Theorie.ToDoList;

import java.util.Scanner;

public class UserInterface {
    private final ToDoList todoList;
    private final Scanner scanner;

    public UserInterface(ToDoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            switch(command){
                case "stop":
                    return;
                case "add":
                    System.out.println("To add:");
                    String todo = scanner.nextLine();
                    todoList.add(todo);
                case "list": todoList.print();
                     break;
                case "remove":
                    System.out.println("Which one is removed?");
                    int removeIndex = Integer.parseInt(scanner.nextLine());
                    todoList.remove(removeIndex);
            }
        }
    }
}
