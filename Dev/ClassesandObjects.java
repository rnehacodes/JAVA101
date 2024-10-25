class Calculator {
    
    public int sum(int n1, int n2) {
        return n1 + n2;
    }
}

public class ClassesandObjects {
    public static void main(String[] s) {
        int num1 = 3, num2 = 4;
        int sum = num1 + num2;
        System.out.println("Normal Sum: " + sum);
        Calculator calci = new Calculator();
        System.out.println("Sum via calculator method: " + calci.sum(num1, num2));
    }
}


