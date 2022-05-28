package module1;

public class App {

     static final String  INPUT_NAME = "/Users/ruslanapostol/Downloads/Module1.CaesarEncryption/Karlsson-on-the-roof.txt";
     static final String OUTPUT_NAME = "/Users/ruslanapostol/Downloads/Module1.CaesarEncryption/Karlsson-on-the-roof_out.txt";
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
       String content = "abc";
       // use BufferedReader to read the content of file into content var
       String output = caesar.encrypt(content, 3);
       System.out.println("output = " + output);
       // use BufferedWriter to write value of output var into OUTPUT_NAME file

    }

   static void decrypt(String fileName) {
       System.out.println("Decrypt INPUT_NAME: " + fileName);
       String content = "abc";
       // use BufferedReader to read the content of file into content var
       String output = caesar.decrypt(content, 3);
       System.out.println("output = " + output);
       // use BufferedWriter to write value of output var into OUTPUT_NAME file
    }

   static void bruteForce(String fileName) {
       System.out.println("bruteForce INPUT_NAME: " + fileName);
       //in a for call caesar.decrypt(content, i);
       // and test the result at each iteration
    }

}
