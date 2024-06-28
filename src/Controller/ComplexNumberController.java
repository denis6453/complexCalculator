package Controller;

import Model.ComplexNumber;
import Service.ComplexNumberService;

public class ComplexNumberController {
    ComplexNumberService service = new ComplexNumberService();

    public <T extends ComplexNumber> ComplexNumber sum(T a, T b) {
        return service.sum(a, b);
    };

    public <T extends ComplexNumber> ComplexNumber multiply(T a, T b){
        return service.multiply(a, b);
    };

    public <T extends ComplexNumber> ComplexNumber divide(T a, T b){
        return service.divide(a, b);
    };
}
