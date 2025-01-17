package Service;

import Log.Log;
import Model.ComplexNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ComplexNumberService implements ComplexOperations, RealOperations {
    private static final Logger LOGGER = Log.log(ComplexNumberService.class.getName());


    @Override
    public <T extends ComplexNumber> ComplexNumber sum(T a, T b) {
        LOGGER.log(Level.INFO, "Сумма (" + a + " + " + b + ")");
        return new ComplexNumber(sum(a.getReal(), b.getReal()), sum(a.getImag(), b.getImag()));
    }

    @Override
    public <T extends ComplexNumber> ComplexNumber multiply(T a, T b) {
        LOGGER.log(Level.INFO, "Умножение (" + a + " * " + b + ")");
        double newReal = subtract(multiply(a.getReal(), b.getReal()), multiply(a.getImag(), b.getImag()));
        double newImag = sum(multiply(a.getReal(), b.getImag()), multiply(a.getImag(), b.getReal()));
        return new ComplexNumber(newReal, newImag);
    }

    @Override
    public <T extends ComplexNumber> ComplexNumber divide(T a, T b) {
        LOGGER.log(Level.INFO, "Деление (" + a + " / " + b + ")");
        double denominator = sum(multiply(b.getReal(), b.getReal()), multiply(b.getImag(), b.getImag()));
        double newReal = divide(sum(multiply(a.getReal(), b.getReal()), multiply(a.getImag(), b.getImag())), denominator);
        double newImaginary = (a.getImag() * b.getReal() - a.getReal() * b.getImag()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public double sum(double a, double b) {
        LOGGER.log( Level.INFO,a + " + " + b + " = " + (a + b));
        return a + b;
    }

    @Override
    public double multiply(double a, double b) {
        LOGGER.log(Level.INFO, a + " * " + b + " = " + (a * b));
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        LOGGER.log(Level.INFO, a + " / " + b + " = " + (a / b));
        if (b != 0) return a / b;
        else return 0;
    }

    @Override
    public double subtract(double a, double b) {
        LOGGER.log(Level.INFO, a + " - " + b + " = " + (a - b));
        return a - b;
    }
}
