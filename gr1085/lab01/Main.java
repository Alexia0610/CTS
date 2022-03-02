package gr1085.lab01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

class LowerCaseException extends Exception {
    @Override
    public String getMessage() {
        return "Ati introdus doar litere mici!";
    }
}

class UpperCaseException extends Exception {
    @Override
    public String getMessage() {
        return "Ati introdus doar litere mari!";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code
        System.out.println("tastati ceva: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String text = br.readLine();
            //System.out.println(text);
            if (text.toLowerCase(Locale.ROOT).equals(text)) throw new LowerCaseException();
            if (text.toUpperCase(Locale.ROOT).equals(text)) throw new UpperCaseException();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
