
public class NthSeries {
    public static String seriesSum(int n) {
        if(n<=0){
            return "0.00";
        }
            double mySum = 1.0;
            for(int i = 1; i <n; i++) {
                mySum = mySum + (double)1/(1+3*i);
            }

        return String.format("%.2f", mySum);
    }
}
