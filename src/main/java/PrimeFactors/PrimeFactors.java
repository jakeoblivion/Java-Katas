package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    List<Integer> primeFactors = new ArrayList<>();

    public List<Integer> generatePrimeFactors(int n) {
        if(n>1) {
            addPrimes(n);
        }
        return primeFactors;
    }

    private void addPrimes(int n) {
        for(int i = 2;i <= n; i++) {
            while(n % i == 0) {
                addUniquePrimesToList(i);
                n /= i;
            }
        }
    }

    private void addUniquePrimesToList(int i) {
        if(!primeFactors.contains(i)) {
            primeFactors.add(i);
        }
    }
}
