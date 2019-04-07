import java.util.ArrayList;


public class Search {
   private int lengcht;
   private String textOn;
  private ArrayList<String>polondroms= new ArrayList<String>();



    public ArrayList<String> getPolondroms() {
        return polondroms;
    }

    public String getTextOn() {
        return textOn;
    }


    public void setTextOn(String textOn) {
        this.textOn = textOn;
    }


    //method splits a string into an array of words
        public String[] breakTheTextIntoWords(String textOn) {
            String[] arrayStrings;
            arrayStrings = textOn.split("\\s*(\\s|,|!|\\.)\\s*");
            return arrayStrings;
    }
  //method breaks a word into an array of letters
    public String[] breakTheWorldIntoChars (String string){
        String[] chars ;
        chars =string.split("\\s*");
        return chars;
    }
//if the word length is odd, is the word palindrome
    public boolean notEvenPalindrome(String[]chars) {
        boolean flag=false;
        lengcht =0;
        int indexEnd = chars.length - 1;
        int index = (chars.length-1) / 2;
        for (int i = 0; i < index; i++) {
            if (chars[i].equalsIgnoreCase(chars[indexEnd])) {
                lengcht=lengcht+2;
                indexEnd--;
            }
        }
        lengcht++;
        if(lengcht==chars.length){
            flag=true;
        }
        return flag;
    }
//if the word length is even, is the word palindrome
    public boolean evenPalindrome(String[]chars) {
        boolean flag=false;
        lengcht =0;
        int indexEnd = chars.length - 1;
        int index = chars.length / 2;
        for (int i = 0; i < index; i++) {
            if (chars[i].equalsIgnoreCase(chars[indexEnd])) {
                lengcht=lengcht+2;
                indexEnd--;
            }
        }
        if(lengcht==chars.length){
            flag=true;
        }
        return flag;
    }
}
