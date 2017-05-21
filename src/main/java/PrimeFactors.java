import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    List<Integer> primeFactors = new ArrayList<>();

    public List<Integer> generatePrimeFactors(int n) {
        if(n>1) {
            for(int i = 2;i <= n; i++) {
                while(i % n == 0) {
                    i /= n;
                    primeFactors.add(i);
                }
            }
        }
        return primeFactors;
    }
}
