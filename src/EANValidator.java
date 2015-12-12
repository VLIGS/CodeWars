public class EANValidator {
    public static boolean validate(final String eanCode) {
        int runningSum = 0;
        int checkSum = 0;

        for(int i = 0; i<eanCode.length()-1; i++){
            String myCharacter = String.valueOf(eanCode.charAt(i));
            if(((i+1)%2)==0){
                runningSum = runningSum + Integer.parseInt(myCharacter) * 3;
            }
            else {
                runningSum = runningSum + Integer.parseInt(myCharacter);
            }
        }
        if((runningSum%10) != 0){
            checkSum = 10 - runningSum%10;
        }

        if(checkSum == Integer.parseInt(String.valueOf(eanCode.charAt(eanCode.length()-1)))){
            return true;
        }
        else{
            return false;
        }
    }
}
