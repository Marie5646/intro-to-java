package ChapterThirteen;

import java.math.BigInteger;
import java.util.Scanner;

public class Rational extends Number implements Comparable<Rational> {
    // Data fields for numerator and denominator
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = BigInteger.valueOf(gcd(numerator.longValue(), denominator.longValue()));
        if (numerator.compareTo(BigInteger.ZERO) > 0) {
            this.numerator = numerator.divide(gcd);
        } else {
            this.numerator = numerator.multiply(BigInteger.valueOf(-1)).divide(gcd);
        }
        this.denominator = denominator.abs().divide(gcd);
    }

    private static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }


    public BigInteger getNumerator() {
        return numerator;
    }


    public BigInteger getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational subtract(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational multiply(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    public Rational divide(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE)) {
            return numerator + "";
        }else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
        if ((this.subtract((Rational) other).getNumerator().equals(BigInteger.ZERO)))
            return true;
        else
            return false;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) > 0)
            return 1;
        else if (this.subtract(o).getNumerator().compareTo(BigInteger.ZERO) < 0)
            return -1;
        else
            return 0;
    }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first rational number (numerator denominator): ");
            BigInteger num1 = new BigInteger(scanner.next());
            BigInteger denom1 = new BigInteger(scanner.next());

            System.out.print("Enter the second rational number (numerator denominator): ");
            BigInteger num2 = new BigInteger(scanner.next());
            BigInteger denom2 = new BigInteger(scanner.next());

            Rational r1 = new Rational(num1, denom1);
            Rational r2 = new Rational(num2, denom2);

            Rational sum = r1.add(r2);
            Rational difference = r1.subtract(r2);
            Rational product = r1.multiply(r2);
            Rational quotient = r1.divide(r2);

            System.out.println(r1 + " + " + r2 + " = " + sum);
            System.out.println(r1 + " - " + r2 + " = " + difference);
            System.out.println(r1 + " * " + r2 + " = " + product);
            System.out.println(r1 + " / " + r2 + " = " + quotient);
            System.out.println(r2 + " is " + r2.doubleValue());
        }
}

