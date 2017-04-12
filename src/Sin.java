import static java.lang.StrictMath.sin;
import static java.lang.System.out;

public class Sin extends Algorithms {

    @Override
    public double f (double x){
        return sin(x);
    }

    @Override
    public double maxf(){
        return 1;
    }

    public static void main(String[] args) {
            Sin sin=new Sin();
            out.println("f(x)=sin(x):");
            Out.table();
            Out.number(Parts.x(),sin);
    }
}
