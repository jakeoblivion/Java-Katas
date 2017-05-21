import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    List<Integer> primes = new ArrayList<>();

    public List<Integer> generatePrimeFactors(int n) {
        if (n<=1) {

        } else {
            primes.add(n);
        }
        return primes;
    }
}
