package Diamond;

public class Diamond {
    public static void main(String[] args) {
        Diamond diamond = new Diamond();
        System.out.println();
        diamond.drawIsoscelesTriangle(3);
        System.out.println();
        diamond.drawDiamond(3);
        System.out.println();
        diamond.drawDiamondWithName(3);
    }

    public void drawDiamondWithName(int diamondHeight) {
        drawIsoscelesTriangleWithName(diamondHeight);
        drawUpsideDownTriangle(diamondHeight);
    }

    public void drawDiamond(int diamondHeight) {
        drawIsoscelesTriangle(diamondHeight);
        System.out.println();
        drawUpsideDownTriangle(diamondHeight);
    }

    public void drawIsoscelesTriangle(int triangleHeight) {
        for(int lineNumber = 0; lineNumber < triangleHeight; lineNumber++) {
            drawSpace(((triangleHeight * 2 - 1) - (lineNumber * 2 + 1)) / 2);
            drawAsterisk(lineNumber * 2 + 1);
            drawNewLine(triangleHeight, lineNumber);
        }
    }

    private void drawUpsideDownTriangle(int triangleHeight) {
        for(int lineNumber = triangleHeight - 1; lineNumber > 0; lineNumber--) {
            drawSpace(triangleHeight - lineNumber);
            drawAsterisk(lineNumber * 2 - 1);
            drawNewLine(lineNumber, 0);
        }
    }

    private void drawIsoscelesTriangleWithName(int diamondHeight) {
        for(int lineNumber = 0; lineNumber < diamondHeight; lineNumber++) {
            drawSpace(((diamondHeight * 2 - 1) - (lineNumber * 2 + 1)) / 2);
            if(lineNumber + 1 < diamondHeight) {
                drawAsterisk(lineNumber * 2 + 1);
            } else {
                System.out.println("JAKE");
            }
            drawNewLine(diamondHeight, lineNumber);
        }
    }

    private void drawSpace(int numberOfSpaces) {
        for(int characterInLine = 0; characterInLine < numberOfSpaces; characterInLine++) {
            System.out.print(" ");
        }
    }

    private void drawAsterisk(int numberOfAsterisks) {
        for(int characterInLine = 0; characterInLine < numberOfAsterisks; characterInLine++) {
            System.out.print("*");
        }
    }

    private void drawNewLine(int triangleHeight, int lineNumber) {
        if (triangleHeight - 1 > lineNumber) {
            System.out.println();
        }
    }

}
