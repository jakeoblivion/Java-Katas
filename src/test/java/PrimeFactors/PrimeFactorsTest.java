package PrimeFactors;

import PrimeFactors.PrimeFactors;
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

    @Test
    public void generatePrimeFactorsReturn2() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primes = primeFactors.generatePrimeFactors(2);
        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, 2);

        assertEquals(expectedList,primes);
    }

    @Test
    public void generatePrimeFactorsReturn25From10() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primes = primeFactors.generatePrimeFactors(10);
        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, 2,5);

        assertEquals(expectedList,primes);
    }

    @Test
    public void generatePrimeFactorsReturn27From14() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primes = primeFactors.generatePrimeFactors(14);
        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, 2,7);

        assertEquals(expectedList,primes);
    }

    @Test
    public void generatePrimeFactorsReturn211From22() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primes = primeFactors.generatePrimeFactors(22);
        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, 2,11);

        assertEquals(expectedList,primes);
    }

    @Test
    public void generatePrimeFactorsReturn3From27() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primes = primeFactors.generatePrimeFactors(27);
        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, 3);

        assertEquals(expectedList,primes);
    }

    @Test
    public void generatePrimeFactorsReturn235From30() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        List<Integer> primes = primeFactors.generatePrimeFactors(30);
        List<Integer> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, 2,3,5);

        assertEquals(expectedList,primes);
    }
}