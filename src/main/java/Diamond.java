public class Diamond {
    public void drawIsoscelesTriangle(int triangleHeight) {
        for(int x = 0; x < triangleHeight; x++) {
            drawSpace();
            drawSpace();
            drawAsterisk();
            drawSpace();
            drawSpace();
            drawNewLine();
        }
    }

    public void drawAsterisk() {
        System.out.print('*');
    }

    public void drawSpace() {
        System.out.print(' ');
    }

    public void drawNewLine() {
        System.out.println();
    }

}
