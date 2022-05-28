package module1;

public class App {

     static final String  INPUT_NAME = "/Users/ruslanapostol/Downloads/cryptanalyzer/src/crypt/Karlsson-on-the-Roof.txt";
     static final String OUTPUT_NAME = "/Users/ruslanapostol/Downloads/cryptanalyzer/src/crypt/Karlsson-on-the-Roof_out.txt";
     static Caesar caesar;

    public static void main(String[] args) {
        caesar = new Caesar();
        switch (args[0]) {
            case "1": encrypt(INPUT_NAME); break;
            case "2": decrypt(INPUT_NAME); break;
            case "3": bruteForce(INPUT_NAME); break;
        }

    }

   static  void encrypt(String fileName) {
       System.out.println("Encrypt INPUT_NAME: " + fileName);
       String output = caesar.encrypt("abc", 3);
       System.out.println("output = " + output);

    }

   static void decrypt(String fileName) {
       System.out.println("Decrypt INPUT_NAME: " + fileName);
       String output = caesar.decrypt("abc", 3);
       System.out.println("output = " + output);

    }

   static void bruteForce(String fileName) {
       System.out.println("bruteForce INPUT_NAME: " + fileName);

    }

}
