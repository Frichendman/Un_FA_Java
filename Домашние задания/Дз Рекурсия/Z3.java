public class Z3 {

    public static double f(double x) {
        return Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23;
    }

    public static double Z3(double a, double b, double fa, double fb, double eps) {
        double c = 0.5 * (a + b);
        if (Math.abs(a - b) < eps) return c;
        double fc = f(c);
        if (Math.abs(fc) < eps) return c;
        if (fc * fa < 0)
            return Z3(a, c, fa, fc, eps);
        else
            return Z3(c, b, fc, fb, eps);
    }
    public static void main(String[] args) {
        double a = 0.0;
        double b = 10;
        double c = f(0.0);
        double d = f(10.0);
        double eps = 0.00000001;
        System.out.println(Z3(a,b,c,d,eps));
    }
}
