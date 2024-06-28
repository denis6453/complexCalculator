import Model.ComplexNumber;
import Service.ComplexNumberService;

public class Main {
    public static void main(String[] args) {
        ComplexNumber number1 = new ComplexNumber(1, 2);

        ComplexNumber number2 = new ComplexNumber(3, 4);

        ComplexNumberService service = new ComplexNumberService();



        System.out.println(service.sum(number1, number2));

        System.out.println(service.multiply(number1, number2));

        System.out.println(service.divide(number1, number2));


    }
}