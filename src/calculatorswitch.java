public class calculatorswitch {

    static void calc(double numA, double numB, char operation){
        double result = 0;
        switch (operation){
            case '+':
                result = numA + numB;
                break;
            case '-':
                result = numA - numB;
                break;
            case '*':
                result = numA * numB;
                break;
            case '/':
                result = numA / numB;
                break;
            default:
            System.out.println("Oops, incorrect operation type");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        calc(50, 10, '+');
        calc(25, 70, '-');
        calc(22, 10, '*');
        calc(40, 120, '/');
        calc(20, 10, '$');
    }
}
