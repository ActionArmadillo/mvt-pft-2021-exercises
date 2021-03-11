package week_05.exercise_017_02;

public class ScientificCalculator extends SimpleCalculator implements AdvancedMathOperations {

    public double square(double number) {
        return number * number;
    }

    public double raisedToThePowerOf(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double remainder(double dividend, double divisor) {
        return dividend % divisor;
    }
}
