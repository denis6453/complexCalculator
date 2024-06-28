package Model;

public class ComplexNumber {
    private final double real;
    private final double imag;

    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    @Override
    public String toString() {
        return "ComplexNumber{" +
                real +
                " + i" + imag +
                '}';
    }
}
