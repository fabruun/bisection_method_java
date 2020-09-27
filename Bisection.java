public class Bisection {
    
    public static  void main(String[] args) {
        System.out.println(bisection(-5, 5, 0.0000001));
    }

    private static double f(double x) {
        return (2*x*x) + (20*x) + 42;
    }

    private static double bisection(double a, double b, double error) {
        double c = 0;

        while(a - b < error) {
            c = (a + b) / 2;
            if(f(c) == 0) {
                break;
            }
            if(f(a) * f(c) < 0) {
                b = c;
            } else {
                a = c;
            }
        }

        return c;
    }

}
