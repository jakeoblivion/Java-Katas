import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.sun.jmx.snmp.ThreadContext.contains;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class DiamondTest {

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
    public void drawIsoscelesTriangleFirstLine() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawIsoscelesTriangle(3);
        assertThat(outContent.toString(), containsString("*\n" ));
    }

    @Test
    public void drawIsoscelesTriangleSecondLine() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawIsoscelesTriangle(3);
        assertThat(outContent.toString(), containsString("***\n" ));
    }

    @Test
    public void drawIsoscelesTriangleThirdLine() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawIsoscelesTriangle(3);
        assertThat(outContent.toString(), containsString("*****" ));
    }

    @Test
    public void drawIsoscelesTriangleFirstLineWithSpaces() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawIsoscelesTriangle(3);
        assertThat(outContent.toString(), containsString("  *  " ));
    }


/*

    @Test
    public void drawIsoscelesTriangle() throws Exception {
        Diamond diamond = new Diamond();
        diamond.drawIsoscelesTriangle(3);
        assertEquals("  *  \n *** \n*****", outContent.toString());
    }
*/

}