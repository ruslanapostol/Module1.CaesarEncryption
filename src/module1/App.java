package module1;

import java.io.*;

public class App {

     static final String  INPUT_NAME = "/Users/ruslanapostol/Downloads/Module1.CaesarEncryption/Karlsson-on-the-roof.txt";
     static final String OUTPUT_NAME = "/Users/ruslanapostol/Downloads/Module1.CaesarEncryption/Karlsson-on-the-roof_out.txt";
     static Caesar caesar;

    public static void main(String[] args) throws IOException {
        caesar = new Caesar();
        switch (args[0]) {
            case "1": encrypt(INPUT_NAME); break;
            case "2": decrypt(INPUT_NAME); break;
            case "3": bruteForce(INPUT_NAME); break;
        }

    }

   static  void encrypt(String fileName) throws IOException {
       System.out.println("Encrypt INPUT_NAME: " + fileName);
       String content = "abc";
       readFile(INPUT_NAME);
       String output = caesar.encrypt(content, 3);
       System.out.println("output = " + output);
       writeFile(OUTPUT_NAME);

    }

   static void decrypt(String fileName) throws IOException {
       System.out.println("Decrypt INPUT_NAME: " + fileName);
       String content = "abc";
       readFile(INPUT_NAME);
       String output = caesar.decrypt(content, 3);
       System.out.println("output = " + output);
       writeFile(OUTPUT_NAME);
       // use BufferedWriter to write value of output var into OUTPUT_NAME file
    }

   static void bruteForce(String fileName) {
       System.out.println("bruteForce INPUT_NAME: " + fileName);

       //in a for call caesar.decrypt(content, i);
       // and test the result at each iteration
    }

    static void readFile(String name) throws IOException {
        try (FileReader file = new FileReader(name);
             BufferedReader reader  = new BufferedReader(file)) {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        }
    }

    static void writeFile(String name) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(name))) {
            bufferedWriter.write(name);
            bufferedWriter.flush();
        }
    }

}
