class WordSearch {
    static String[] findWord(String x, String[] y){
        int count=0;
        for (int i = 0; i<y.length; i++)
        {
            if (y[i].contains(x)) {
                count+=1;
            }
        }
        String [] myReturnString = new String[count];
        count=0;
        for (int i = 0; i<y.length; i++)
        {
            if (y[i].contains(x)) {
                myReturnString[count] = y[i];
                count+=1;
            }
        }
        return myReturnString;
    }
}

