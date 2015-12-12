class WordSearch {
    static String[] findWord(String x, String[] y){
        int count=0;
        for (int i = 0; i<y.length; i++)
        {

            if (y[i].toLowerCase().contains(x.toLowerCase())) {
                count+=1;
            }
        }
        String [] myReturnString = new String[count];
        count=0;
        for (int i = 0; i<y.length; i++)
        {
            if (y[i].toLowerCase().contains(x.toLowerCase())) {
                myReturnString[count] = y[i];
                count+=1;
            }
        }
        if(myReturnString.length==0){
            String [] myEmptyString = new String[1];
            myEmptyString[0] = "Empty";
            return myEmptyString;
        }
        return myReturnString;
    }
}

