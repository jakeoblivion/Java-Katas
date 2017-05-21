package FizzBuzz;

public class FizzBuzz {

    public void FizzBuzz(int n) {
        for(int i = 1;i <= n;i++) {
            if(i%3==0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }

        }
    }

}
