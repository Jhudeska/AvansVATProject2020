package Notes;

import java.util.Arrays;
import java.util.List;

public class AppClassGeneral {
    private String attribute;


    public AppClassGeneral(String attribute) {
        this.attribute = attribute;
        System.out.println("Constructor 1");
    }

    public AppClassGeneral() {
        //Roept constructor aan van deze klas
        this("Henk");
        System.out.println("Constructor 2");

    }

    public void doSomething(String parameter){
        System.out.println(parameter);
    }

    public void doSomething(int parameter){
        System.out.println(parameter);
    }

    public void schoolAantekeningen(){

        AppClassGeneral appClassGeneral = new AppClassGeneral();
        appClassGeneral.doSomething(9);
        appClassGeneral.doSomething("test");

        //verkorte versie om meerdere elementen toe te voegen aan array
        List<String> words = Arrays.asList("Hallo", "Avans");
        for (String word : words){
            System.out.println(words);
        }





    }
}
