package module1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caesar {

    static final List<Character>  ALPHABET = new ArrayList<>();

    static final Map<Character, Integer> ALPHABET2POS = new HashMap<>();
    static {
        ALPHABET.add('A');
        ALPHABET.add('B');
        ALPHABET.add('C');
        ALPHABET.add('D');

        for (int i = 0; i < ALPHABET.size(); i++) {
            ALPHABET2POS.put(ALPHABET.get(i), i+1);
        }
    }

    String encrypt(String text, int key) {
        System.out.println("CaesarEncrypt(): key = " + key);
        String result = "";
        for (int i = 0; i <text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println("ch = " + ch);
            int position = ALPHABET2POS.get(Character.toUpperCase(ch));
            System.out.println("position = " + position);
            int newPosition = position + key;
            if(newPosition > ALPHABET2POS.size()) {
                newPosition = newPosition - ALPHABET2POS.size();
            }
            System.out.println("newPosition = " + newPosition);

            char newChar = ALPHABET.get(newPosition - 1);
            result += newChar;

        }

        return result;
    }

    String decrypt(String text, int key) {
        System.out.println("CaesarDecrypt(): key = " + key);
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            System.out.println("ch = " + ch);

        }
        return text;
    }
}
