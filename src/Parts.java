
public class Parts {
    private static final int n = 21;

    public static double [] x(){
        double [] temp= new double[n];
        for (int i=0; i<n;i++){
            temp[i]=0.1*i;
        }
        return temp;
    }

}
