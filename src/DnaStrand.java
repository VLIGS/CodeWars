
public class DnaStrand {
    public static String makeComplement(String dna) {
        String myReturnString = "";
        for (int i = 0; i<dna.length(); i++){
            switch (dna.charAt(i)){
                case 'A': myReturnString = myReturnString + 'T';
                    break;
                case 'T': myReturnString = myReturnString + 'A';
                    break;
                case 'C': myReturnString = myReturnString + 'G';
                    break;
                case 'G': myReturnString = myReturnString + 'C';
                    break;
                default: myReturnString = myReturnString + "";
            }
        }
        return myReturnString;
    }
}

