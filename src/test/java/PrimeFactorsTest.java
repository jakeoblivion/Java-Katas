import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void generatePrimeFactorsReturn1() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primes = primeFactors.generatePrimeFactors(1);

        List<Integer> expectedList = Collections.emptyList();

        assertEquals(expectedList,primes);
    }


}