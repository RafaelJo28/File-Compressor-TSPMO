public class MainApp {
    public static void main(String[] args) {

        Huffman huffman = new Huffman("aaaaaaaabbbbbbbccccdd");

        String encodedText = huffman.encode();
        System.out.println("Encoded text: " + encodedText);

        huffman.printCodes();

        String originalText = huffman.decode(encodedText);
        System.out.println("Decoded text: " + originalText);
    }
}
