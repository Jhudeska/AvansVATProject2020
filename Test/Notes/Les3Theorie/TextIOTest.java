package Notes.Les3Theorie;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class TextIOTest {

//      @TempDir
        private File tempDirectory;

        @Test
        public void readFile() throws IOException {
            //Arrange
            String expect = "Hallo Avans";

            TextIO textIO = new TextIO();

            File tempFile = new File(tempDirectory, "text.txt");
            FileWriter fw = new FileWriter(tempFile, false);
            fw.write(expect );
            fw.write("\n");


            //Act
            String actual = textIO.readFile(tempFile);

            //Assert
            assertEquals(expect, actual);

        }

}