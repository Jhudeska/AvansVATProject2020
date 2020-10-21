package Notes.Les3Theorie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
//    private static Calculator calculator;

//    @BeforeClass //Er wordt 1 instantie gemaakt voor de gehele class [static]
//     public static void beforeClass(){
//        calculator = new Calculator();
//    }

    private static Calculator calculator;

    @Before // nieuwe instantie voor iedere method
    public  void before(){
        calculator = new Calculator();
    }


    @Test
    public void sum_for1and2_expect3(){
        //Arrange = regelen
//        Calculator calculator = new Calculator();

        //Act = handelen
        int actual = calculator.sum(1, 2);

        // Assert -= beweren
        assertEquals(3, actual);
        // vul 2 in iplaast van 3 om de kijken of de assertion stuk kan.

        /**
         * Het is altijd belanrijk om na te gaan of je Assertion stuk kan maken voor je business logica ga
         * testen!
         */

    }
    //@DisplayName
    @Test
    public void sum_forMinus3and5_expect2(){
        //Act
        int actual = calculator.sum(-3, 5);

        //Assert
        assertEquals(2, actual);
    }

//    @Test
//    public void sum_call2times_expectException(){
//        assertThrows(IllegalStateException.class, () -> {
//            calculator.sum(0, 0);
//            calculator.sum(0, 0);
//        });
//    }




}