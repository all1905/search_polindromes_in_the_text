import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();
        System.out.println("Enter text");
        Scanner in = new Scanner(System.in);
        search.setTextOn(in.nextLine());

        String[] strings = search.breakTheTextIntoWords(search.getTextOn());
        addPolindromInArray(search, strings);
        System.out.println(search.getPolondroms());
    }

    public static void addPolindromInArray(Search search, String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            String[] chars = search.breakTheWorldIntoChars(strings[i]);
            addEvenPolindrom(search, strings, i, chars);
            addNotEvenPolindrom(search, strings, i, chars);
        }
    }

    public static void addNotEvenPolindrom(Search search, String[] strings, int i, String[] chars) {
        if (chars.length % 2 != 0) {
            boolean flag = search.notEvenPalindrome(chars);
            if (flag == true) {
                search.getPolondroms().add(strings[i]);
            }


        }
    }

    public static void addEvenPolindrom(Search search, String[] strings, int i, String[] chars) {
        if (chars.length % 2 == 0) {
            boolean flag = search.evenPalindrome(chars);
            if (flag == true) {
                search.getPolondroms().add(strings[i]);
            }
        }
    }
}
