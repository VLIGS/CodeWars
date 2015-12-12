public class EANValidator {
    public static boolean validate(final String eanCode) {
        int runningSum = 0;
        int checkSum = 0;

        for(int i = 0; i<eanCode.length()-1; i++){
            if((i%2)==0){
                runningSum = runningSum + eanCode.charAt(i) * 3;
            }
            else {
                runningSum = runningSum + eanCode.charAt(i);
            }
        }

        if((runningSum%10) != 0){
            checkSum = 10 - runningSum%10;
        }

        if(checkSum == eanCode.charAt(eanCode.length()-1)){
            return true;
        }
        else{
            return false;
        }
    }
}
