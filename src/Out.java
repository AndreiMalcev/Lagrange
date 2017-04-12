import static java.lang.Math.abs;
import static java.lang.System.out;

public class Out {

    static void space(int p) {
        String s = "";
        for (int i = 0; i < p; i++) {
            out.print(" ");
        }
    }

    static void table() {
        Algorithms.nodes();
        space(1);
        out.print("x_i");
        space(7);
        out.print("f_i");
        space(7);
        out.print("L(x,f)");
        space(7);
        out.print("|f-L|");
        space(10);
        out.println("A");
    }

    static void number(double[] xk, Sin sin) {
        for (int i = 0; i < xk.length; i++) {
            out.printf("%1.3f", xk[i]);
            space(1);
            if (sin.f(xk[i])>=0){
                space(1);
            }
            out.printf("%1.8f", sin.f(xk[i]));
            space(1);
            if (sin.L(xk[i]) >= 0) {
                space(1);
            }
            out.printf("%1.8f", sin.L(xk[i]));
            space(2);
            out.printf("%1.8f", abs(sin.f(xk[i]) - sin.L(xk[i])));
            space(2);
            out.printf("%1.8f", sin.A(xk[i]));
            out.println();
        }
    }

    static void number(double[] xk, Cos cos) {
        for (int i = 0; i < xk.length; i++) {
            out.printf("%1.3f", xk[i]);
            space(1);
            if (cos.f(xk[i])>=0){
                space(1);
            }
            out.printf("%1.8f", cos.f(xk[i]));
            space(1);
            if (cos.L(xk[i]) >= 0) {
                space(1);
            }
            out.printf("%1.8f", cos.L(xk[i]));
            space(2);
            out.printf("%1.8f", abs(cos.f(xk[i]) - cos.L(xk[i])));
            space(2);
            out.printf("%1.8f", cos.A(xk[i]));
            out.println();
        }
    }
}

