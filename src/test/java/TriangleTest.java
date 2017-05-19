import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TriangleTest {

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
    public void drawAsterisk() {
        Triangle triangle = new Triangle();
        triangle.drawAsterisk();
        assertEquals("*", outContent.toString());
    }

    @Test
    public void drawHorizontalLine() {
        Triangle triangle = new Triangle();
        triangle.drawHorizontalLine(5);
        assertEquals("*****", outContent.toString());
    }

    @Test
    public void drawVerticalLine() {
        Triangle triangle = new Triangle();
        triangle.drawVerticalLine(3);
        assertEquals(
                "*\n*\n*", outContent.toString());
    }

    @Test
    public void drawRightTriangle() {
        Triangle triangle = new Triangle();
        triangle.drawRightTriangle(3);
        assertEquals(
                "*\n**\n***", outContent.toString());
    }

}