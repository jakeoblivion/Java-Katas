package PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        PrimeFactors primeFactors = new PrimeFactors();
        System.out.println(primeFactors.generatePrimeFactors(30));
    }

    List<Integer> primeFactors = new ArrayList<>();

    public List<Integer> generatePrimeFactors(int n) {
        for(int possiblePrime = 2; n > 1; possiblePrime++){
            while(n % possiblePrime == 0) {
                addUniquePrimesToList(possiblePrime);
                n /= possiblePrime;
            }
        }
        return primeFactors;
    }

    private void addUniquePrimesToList(int possiblePrime) {
        if(!primeFactors.contains(possiblePrime)) {
            primeFactors.add(possiblePrime);
        }
    }
}