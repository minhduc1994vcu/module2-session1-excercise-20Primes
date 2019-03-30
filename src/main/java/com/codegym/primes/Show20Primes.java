package com.codegym.primes;

public class Show20Primes {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        StringBuilder show = new StringBuilder();

        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                count++;
                show.append(number).append("\t");
            }
            number++;
        }
        System.out.print(count+ " primes are :" + show);
    }
}
