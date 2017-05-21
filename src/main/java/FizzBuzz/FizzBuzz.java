package FizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.FizzBuzz(100);
    }

    private final int FIZZ = 3;
    private final int BUZZ = 5;

    public void FizzBuzz(int n) {
        for(int i = 1;i <= n;i++) {
            if(Buzz(i)&&Fizz(i)) {
                System.out.println("FizzBuzz");
            } else if(Fizz(i)) {
                System.out.println("Fizz");
            } else if(Buzz(i)) {
                System.out.println("Buzz");
            }  else {
                System.out.println(i);
            }
        }
    }

    private boolean Buzz(int i) {
        return i%BUZZ==0;
    }

    private boolean Fizz(int i) {
        return i%FIZZ==0;
    }

}
