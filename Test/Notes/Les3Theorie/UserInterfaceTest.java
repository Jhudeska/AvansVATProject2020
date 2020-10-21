package Notes.Les3Theorie;

import Notes.Les3Theorie.ToDoList;
import Notes.Les3Theorie.UserInterface;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

/**
 * We have used Junit 4 in this Class
 * Les3 Praktijk Mooc Userinterface
 */
public class UserInterfaceTest {

    private static InputStream oldStin;

    @BeforeClass
    public static void beforeClass(){
        oldStin = System.in;
    }

    @AfterClass
    public static void afterClass(){
        System.setIn(oldStin);
    }

    @Test
    public void start(){
        //Arrange
        ToDoList toDoList = new ToDoList();
//        Scanner scanner = new Scanner(System.in);

        String instructuons = "add\n" +
                "write an essay\n" +
                "add\n" +
                "read a book\n" +
                "list\n" +
                "remove\n" +
                "1\n" +
                "list\n" +
                "add\n" +
                "stop\n" +
                "list\n" +
                "stop";

        InputStream is = new ByteArrayInputStream(instructuons.getBytes());
        Scanner scanner = new Scanner(is);

        //Act
        UserInterface ui = new UserInterface(toDoList,scanner);
        ui.start();

        //Assert
        System.out.println("Joepie we zijn er");


    }

}