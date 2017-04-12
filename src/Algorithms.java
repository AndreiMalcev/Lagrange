import static java.lang.Math.abs;
import static java.lang.System.out;

public class Algorithms {
    static double[] xk = Nodes.xk_full;

    private double w(double x){
        double l=1;
        for (int i=0;i<xk.length;i++){
                l *= (x - xk[i]);
        }
        return l;
    }

    private double dw (int k){
        double temp=1;
           for (int j=0;j<xk.length;j++){
              if (j!=k){
                  temp*=(xk[k]-xk[j]);
                }
            }
        return temp;
    }

    public double L(double x){
        double l=0;

        for (int i=0;i<xk.length;i++) {
            if (x!=xk[i]) {
                l += w(x) * f(xk[i]) / ((x - xk[i]) * dw(i));
            }
            else {
                l= f(x);
            }
        }
        return l;
    }

    public static void nodes(){
        if (xk==Nodes.xk_full){
            out.println("Данные узлы");
        }
        if (xk==Nodes.xk_double){
            out.println("Удвоенные узлы");
        }
        if (xk==Nodes.xk_left){
            out.println("Узлы левой части");
        }
        if (xk==Nodes.xk_right){
            out.println("Узлы правой части");
        }
    }

     public double f(double temp){
        return 0;
    }

    private static int factoiral (int k){
         int temp=1;
         for (int i=1;i<=k;i++){
             temp*=i;
         }
         return temp;
    }

    public double maxf(){
        return 0;
    }


    public double A(double x){
         return abs(w(x))*maxf()/(factoiral(xk.length));
    }
}
