
public class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        percent = percent/100;
        int count = 0;
        double populationIncrease;
        while(p>=p0){
            populationIncrease = (double)p0 * percent;
            p0 = p0 + (int)populationIncrease + aug;
            count+=1;
        }
        return count;
    }
}

