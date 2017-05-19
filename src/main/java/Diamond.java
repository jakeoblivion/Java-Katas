import java.util.ArrayList;

public class Diamond {
    public static final String SPACE = " ";
    public static final String ASTERISK = "*";

    public void drawIsoscelesTriangle(int triangleHeight) {
        ArrayList<String> lines = new ArrayList<>();

        for(int x = 0; x < triangleHeight; x++) {
            String line = "";
            //int characterSize = triangleHeight * 2 - 1;
            int numberOfAsterisks = x * 2 + 1;

            for(int y = 0; y < numberOfAsterisks; y++) {
                line += ASTERISK;
            }
            System.out.println(line);
        }

    }

}
