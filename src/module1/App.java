package module1;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class App {

     static final String  INPUT_NAME = "/Users/ruslanapostol/Downloads/Module1.CaesarEncryption/Karlsson-on-the-roof.txt";
     static final String OUTPUT_NAME = "/Users/ruslanapostol/Downloads/Module1.CaesarEncryption/Karlsson-on-the-roof_out.txt";
     static Caesar caesar;

    public static void main(String[] args) throws IOException {
        caesar = new Caesar();
        switch (args[0]) {
            case "1": encrypt(INPUT_NAME); break;
            case "2": decrypt(OUTPUT_NAME); break;
            case "3": bruteForce(OUTPUT_NAME); break;
        }

    }

   static  void encrypt(String fileName) throws IOException {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the key to encrypt: ");
       int key = scanner.nextInt();
       System.out.println("Encrypt INPUT_NAME: " + fileName);
       String content = readFile(fileName);
       String output = caesar.encrypt(content, key);
       System.out.println("The encrypted output is: \n" + output);
       writeFile(OUTPUT_NAME,output);

    }

   static void decrypt(String fileName) throws IOException {
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the key to decrypt: ");
       int key = scanner.nextInt();
       System.out.println("Decrypt INPUT_NAME: " + fileName);
       String content = readFile(fileName);
       String output = caesar.decrypt(content, key);
       System.out.println("The decrypted output is: \n " + output);
       writeFile(OUTPUT_NAME,output);

    }

   static void bruteForce(String fileName) throws IOException {
       System.out.println("bruteForce INPUT_NAME: " + fileName);
       String content = readFile(fileName);
       for (int key = 1; key < 41; key++) {
           String output = caesar.decrypt(content, key);
           if( output.indexOf("КАРЛСОН") > 0) {
               System.out.println("The brute force attacked output:\n" + output);
               System.out.println("key = " + key);
               break;
           }
       }
    }
    
    static String readFile(String name) throws IOException {
            String result = "";
        try (FileReader file = new FileReader(name);
             BufferedReader reader  = new BufferedReader(file)) {
            while (reader.ready()) {
                String line = reader.readLine();
                result += line +"\n";
            }
        }
        return result;
    }

    static void writeFile(String name, String content) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name))) {
            bufferedWriter.write(content);
            bufferedWriter.flush();
        }
    }
}
