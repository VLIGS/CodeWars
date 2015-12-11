
public class JadenCase {

    // capitalize every word in phrase
    public String toJadenCase(String phrase) {
        if ((phrase == null)||(phrase.isEmpty())){
            return null;
        }
        StringBuilder newPhrase = new StringBuilder(phrase);
        char capital = phrase.charAt(0);
        if(!Character.isDigit(capital) && !Character.isWhitespace(capital)){
            newPhrase.setCharAt(0, Character.toUpperCase(capital));
        }
        for(int i = 1; i<phrase.length();i++){


        }
        return newPhrase.toString();
    }
}
