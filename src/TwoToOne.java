import java.util.Arrays;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String noDuplicatesString = removeDuplicates(removeDuplicates(s1)+removeDuplicates(s2));
        char[] chars = noDuplicatesString.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        return sortedString;
    }
    public static String removeDuplicates(String rawString){
        StringBuilder myString = new StringBuilder();
        char myChar = rawString.charAt(0);
        myString.append(myChar);
        for( int i=1; i<rawString.length(); i++){
            myChar = rawString.charAt(i);
            if(myString.toString().indexOf(myChar)==-1)
            {
                myString.append(myChar);
            }
        }
        return myString.toString();
    }
}
