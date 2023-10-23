package practice.sentencies;

//Count words in Sentence
public class Sentence {

    public  int countWords(String str) {
        String[] words = str.split(" ");
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–")|| words[i].equals("-") || words[i].equals(",")){
                n++;
            }
        }
//        System.out.println(n);
        return words.length - n;
    }


    //Count symbols in Sentence
    public  int countSymbols(String str) {
        String[] symbols = str.split("");
        int n = 0;
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i].equals("'") || symbols[i].equals("=") || symbols[i].equals("$")){
                n++;
            }

        }
        return symbols.length -n;
        //TODO исключить пробелы из результата
    }

}

