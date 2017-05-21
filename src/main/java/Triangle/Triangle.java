package Triangle;

public class Triangle {

    public void drawRightTriangle(int numberOfLines) {
        for(int x = 1; x < numberOfLines + 1; x++) {
            drawHorizontalLine(x);
            if(x < numberOfLines) {
                System.out.println();
            }
        }
    }

    public void drawVerticalLine(int numberOfLines) {
        for(int x = 0; x < numberOfLines; x++) {
            drawHorizontalLine(1);
            if(x < numberOfLines -1) {
                System.out.println();
            }
        }
    }

    public void drawHorizontalLine(int numberOfAsterisks) {
        for(int x = 0; x < numberOfAsterisks; x++) {
            drawAsterisk();
        }
    }

    public void drawAsterisk() {
        System.out.print('*');
    }

}
