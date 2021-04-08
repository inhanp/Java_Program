package Calculator.src;

public class Calculator {

    private double input1;
    private double input2;

    /**
     * Initialize Calculator object
     * @param first     First double value to calculate
     * @param second    Second double value to calculate
     */
    public Calculator(double first, double second) {
        input1 = first;
        input2 = second;
    }

    /**
     * Get access to input1, which is first input of Calculator object
     * @return  input1
     */
    public double getFirst() {
        return input1;
    }

    /**
     * Get access to input2, second input of Calculator object
     * @return  input2
     */
    public double getSecond() {
        return input2;
    }

    /**
     * Return multiplication of two inputs
     * @return  product of input1 and input2
     */
    public double multiply() {
        return input1*input2;
    }

    /**
     * Return result of dividing input1 by input2
     * @return  division of input1 by input2, NaN if input2 is 0
     */
    public double divide() {
        if (Double.compare(input1, input2) == 0) {
            return Double.NaN;
        }
        return input1 / input2;
    }

    /**
     * Return sum of input1 and input2
     * @return  sum of input1 and input2
     */
    public double add() {
        return input1 + input2;
    }

    /**
     * Subtract input2 from input1
     * @return  difference between input1 and input2
     */
    public double subtract() {
        return input1 - input2;
    }

    /**
     * Return result of input1^input2
     * @return  input1 raise to the power of input2
     */
    public double power() {
        return Math.pow(input1, input2);
    }

    /**
     * Identify minimum number between input1 and input2
     * @return  Smaller number between input1 and input2
     */
    public double min() {
        return Math.min(input1, input2);
    }

    /**
     * Identify maximum number between two numbers
     * @return  Larger number between input1 and input2
     */
    public double max() {
        return Math.max(input1, input2);
    }

    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator(5.0, 2.0);
        System.out.println("first input = " + cal.getFirst());
        System.out.println("second input = " + cal.getSecond());
        System.out.println("5.0 + 2.0 = " + cal.add());
        System.out.println("5.0 - 2.0 = " + cal.subtract());
        System.out.println("5.0 * 2.0 = " + cal.multiply());
        System.out.println("5.0 / 2.0 = " + cal.divide());
        System.out.println("5.0 ^ 2.0 = " + cal.power());
        System.out.println("min(5.0, 2.0) = " + cal.min());
        System.out.println("max(5.0, 2.0) = " + cal.max());
    }
}
