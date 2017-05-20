public class Diamond {

    public void drawIsoscelesTriangle(int triangleHeight) {

        for(int lineNumber = 0; lineNumber < triangleHeight; lineNumber++) {
            int numberOfCharacters = triangleHeight * 2 - 1;
            int numberOfAsterisks = lineNumber * 2 + 1;
            int numberOfSpaces = (numberOfCharacters - numberOfAsterisks) / 2;

            for(int characterInLine = 0; characterInLine < numberOfCharacters; characterInLine++) {
                while(characterInLine < numberOfSpaces) {
                    System.out.print(" ");
                    numberOfSpaces--;
                }

                if(characterInLine < numberOfAsterisks){
                    System.out.print("*");
                }
            }
            if (lineNumber < triangleHeight - 1) {
                System.out.println();
            }
        }

    }

}
