import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String poo = "poo";


        double[] firstValue = {100.0d, 25.0d, 225.0d, 11.0d};
        double[] secondValue = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];


        for (int index = 0; index < opCodes.length; index++){
        switch(opCodes[index]) {

            case 'a':
                results[index] = firstValue[index] + secondValue[index];
                break;
            case 's':
                results[index] = firstValue[index] - secondValue[index];
                break;
            case 'm':
                results[index] = firstValue[index] * secondValue[index];
                break;
            case 'd':
                //conditional assignments are if-else statements but for more simple assignments as shown below
                results[index] = secondValue[index] != 0 ? firstValue[index] / secondValue [index]: 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: " + opCodes[index]);
                results[index] = 0.0d;
                break;
            }
        }
        System.out.println(Arrays.toString(results));

//        if (opCode == 'a')
//            result = value1 + value2;
//        else if (opCode == 's')
//            result = value1 - value2;
//        else if (opCode == 'm')
//            result = value1 * value2;
////        else if (value2 == 0 && opCode == 'd') {
////            System.out.println("0 cannot be a divisor");
////        }
//        // With no {} around below statement, else statement is tied to if (value2 !=0)
//        else if (opCode == 'd') {
//            if (value2 != 0)
//                result = value1 / value2;
//        }
//        else {
//            System.out.println("Invalid opCode: " + opCode);
//            result = 0.0d;
//        }
//        System.out.println(result);
    }
}