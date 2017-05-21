package FizzBuzz;

import Diamond.Diamond;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printFizz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.FizzBuzz(3);

        assertThat(outContent.toString(), containsString("1\n2\nFizz" ));
    }

    @Test
    public void printBuzz() throws Exception {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.FizzBuzz(6);

        assertThat(outContent.toString(), containsString("1\n2\nFizz\n4\n5\nBuzz" ));
    }
}