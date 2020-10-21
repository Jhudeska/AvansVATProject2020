package Notes.Les3Theorie;

/**
 * Method overloading
 */
public class ExampleClass {
    String attribute;
    String attribute1;
    String attribute2;

    public void doSomething(String parameter){
        System.out.println(parameter);
        //Complex code
    }

    public void doSomething(int parameter){
        System.out.println(parameter);
    }

    public ExampleClass() {
        this("Henk", "Iets", "Anders");
        System.out.println("Constructor 1");
//        this.attribute = "Henk";
//        this.attribute1 = "Iets";
//        this.attribute2 = "Anders";
    }

    public ExampleClass(String attribute,String attribute1,String attribute2) {
        this.attribute = attribute;
        this.attribute1 = attribute;
        this.attribute2= attribute;
        System.out.println("Constructor 2");
    }


}
