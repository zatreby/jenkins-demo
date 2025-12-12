package com.example.math;

/**
 * Small collection of safe math utilities.
 * Designed to be simple, immutable and easy to test.
 */
public final class MathUtils {

    private MathUtils() { }

    public static double divide(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator must not be zero");
        }
        return (double) numerator / denominator;
    }

    public static double percentage(int part, int total) {
        if (total <= 0) {
            throw new IllegalArgumentException("Total must be > 0");
        }
        if (part < 0) {
            throw new IllegalArgumentException("Part must be >= 0");
        }
        return ((double) part / total) * 100.0;
    }
}
