package exception_propagation;

public class ExceptionPropagationInMethods {
    public static void method1(int a, int b) throws ArithmeticException{
        System.out.println("Division:" + a/b);
    }
    public static void method2(int a,int b) throws ArithmeticException{
        method1(a,b);
    }
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            method2(a, b);
        }catch (ArithmeticException e){
            System.out.println("Handled exception in main");
        }
    }
}
