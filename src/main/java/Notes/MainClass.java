package Notes;

import Notes.Les3Theorie.ExampleClass;

import java.util.Arrays;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        /**
         * Les3 Theorie
         */
        ExampleClass ec = new ExampleClass();
        ec.doSomething("Jhudeska");
        ec.doSomething(1);

        //verkorte versie om meerdere elementen toe te voegen aan array
        List<String> words = Arrays.asList("Hallo", "Avans");
        for (String word : words){
            System.out.println(words);
        }




    }
}
