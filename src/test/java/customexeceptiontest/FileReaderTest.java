package customexeceptiontest;



import org.junit.Assert;
import org.junit.Test;
import customexeception.FileReader;

import java.io.FileNotFoundException;

public class FileReaderTest {
    FileReader fileReader = new FileReader();
    @Test
    public void testFileReader() {
        String output = fileReader.readFile("/Users/sainathReddy/Downloads/MyCode/src/main/resources/doc");
        Assert.assertEquals("HiI am Sanjana", output);
    }
    @Test
    public void testFileException() {
        Exception exception = Assert.assertThrows(RuntimeException.class,
                () -> fileReader.readFile("data.txt"));
        Assert.assertEquals(exception.getMessage(), "File not found");
    }
}
