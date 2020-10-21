package Notes.JavaDoc;

/**
 * Created by jhudeska on Oct, 2020
 * <p>
 * Person class uses for storing person information
 */
public class Person {
    /**
     * name of a person
     */
    private String name;

    /**
     * This is a constructor to initialize person object.
     * @param name an initial person name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * To set a name of a person
     * @param name a name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get person name
     * @return person name
     */
    public String getName() {
        return name;
    }

    /**
     * show person name
     * @return person name
     */
    protected String show() {
        return "show: " + name;
    }

    /**
     * return a message from a person object.
     * @return I am a person
     */
    String talk() {
        return "I am a person";
    }


    /**
     * Instruction to create your own JavaDoc
     *
     * 1: Tools
     * 2: Generate Javadoc/
     *
     * Source: https://www.youtube.com/watch?v=1IuJPTrrdHI
     */
}
