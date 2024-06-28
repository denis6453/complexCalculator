package Service;

import Model.ComplexNumber;

public interface ComplexOperations {
    <T extends ComplexNumber> ComplexNumber sum(T a, T b);

    <T extends ComplexNumber> ComplexNumber multiply(T a, T b);

    <T extends ComplexNumber> ComplexNumber divide(T a, T b);
}
