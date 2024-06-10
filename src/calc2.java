public class calc2 {

    static void calc(double numA, double numB, char operation){
        double result;
        switch(operation){
            case '+':
                System.out.println(numA + numB);
                break;
            case '-':
                System.out.println(numA - numB);
                break;
            case '*':
                System.out.println(numA * numB);
                break;
            case '/':
                System.out.println(numA / numB);
                break;
            default:
                System.out.println("Oops, incorrect operation type");
        }
    }

    public static void main(String[] args) {
        calc(50, 10, '+');
        calc(25, 70, '-');
        calc(22, 10, '*');
        calc(40, 120, '/');
        calc(20, 10, '$');
    }
}
