package Notes.Les3Theorie;

import Notes.Les3Theorie.ToDoList;
import junit.framework.TestCase;
import org.junit.Test;

public class CustomerToDoListTest extends TestCase {

    /**
     * We have used Junit 3 in this Class
     * Les3 Praktijk Mooc TodoList
     */
    @Test
    public void testCase1(){
        //Arrange
        String expected1 = "1: read the course material\n" +
                "2: watch the latest fool us\n" +
                "3: take it easy";

        String expected2 = "1: read the course material\n" +
                "2: take it easy";

        //Act
        ToDoList list = new ToDoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        String actual1 = list.printString();
        list.remove(2);
        System.out.println();
        String actual2 = list.printString();

        //Assert
        assertEquals(expected1, actual1);
        assertEquals(expected2,actual2 );

    }


    @Test
    public void testCase2(){
        //Arrange
        String expected1 = "1: read the course material\n" +
                "2: watch the latest fool us\n" +
                "3: take it easy";

        String expected2 = "1: read the course material\n" +
                "2: take it easy";
        String expected3 = "1: read the course material\n" +
                "2: take it easy\n" +
                "3: buy raisins";
        String expected4 = "1: buy raisins";


        //Act
        ToDoList list = new ToDoList();
        list.add("read the course material");
        list.add("watch the latest fool us");
        list.add("take it easy");

        String actual1 = list.printString();
        list.remove(2);
        System.out.println();
        String actual2 = list.printString();
        list.add("buy raisins");
        String actual3 = list.printString();
        list.remove(1);
        list.remove(1);
        String actual4 = list.printString();

        //Assert
        assertEquals(expected1,actual1);
        assertEquals(expected2,actual2);
        assertEquals(expected3,actual3);
        assertEquals(expected4,actual4);




    }

}