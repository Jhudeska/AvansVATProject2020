package Notes.Les3Theorie;

import org.junit.Test;

import static org.junit.Assert.*;

public class CupTest {

//    private static Cup cup; //maak je aan om object aanspreekbaar te maken

    //Setup Test
//    @Before //BeforeEach of setup ||
//        public static void setup(){
//            cup = new Cup("Orange juice", 85.5);
//    }



    //source : https://www.youtube.com/watch?v=o5pE7L2tVV8
    // In class part ctrl+shift + f10 runs all tests in the class

    @Test
     public void getLiquidType() {
        // In method part ctrl+shift + f10 runs only selected method.
        Cup c = new Cup("Orange juice", 85.5);
//        assertEquals(42, 24); //make sure that test fail
        assertEquals("Orange juice", c.getLiquidType());

    }

    @Test
    public void getPercentFull() {
        Cup c = new Cup("Orange juice", 85.5);
        assertEquals(85.5, c.getPercentFull(),0.001);
    }

    @Test
    public void setLiquidType() {
        //Arrange
        Cup c = new Cup("Orange juice", 85.5);
        //Act
        c.setLiquidType("Water");

        //Assertion
        assertEquals("Water", c.getLiquidType());
    }


}