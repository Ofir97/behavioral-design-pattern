package numbers;

public class TestCalcChain {

    public static void main(String[] args) {

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultiNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4,2,"add");

        chainCalc1.calculate(request);
        System.out.println();

        Numbers request2 = new Numbers(8,4,"div");
        chainCalc1.calculate(request2);
    }
}
