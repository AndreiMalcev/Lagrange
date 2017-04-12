import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.pow;
import static java.lang.System.out;

public class Cos extends Algorithms {

    @Override
    public double f (double x){
        return cos(10*x);
    }

    @Override
    public double maxf(){
        return pow(10, Algorithms.xk.length);
    }

    public static void main(String[] args) {
        Cos cos=new Cos();
        out.println("f(x)=cos(10x):");
        Out.table();
        Out.number(Parts.x(),cos);
    }
}
