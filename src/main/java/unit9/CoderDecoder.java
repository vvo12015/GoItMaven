package unit9;

import unit6.task2.MusicalShop;

import static unit8.task1.Main.createInstruments;


public class CoderDecoder {

    public static final int BEGIN_BIG_LATIN = 65;
    public static final int END_BIG_LATIN = 91;
    public static final int OFFSET_FOR_CODING = 10;
    public static final int END_LITTLE_LATIN = 122;
    public static final int BEGIN_LITTLE_LATIN = 97;
    public static final int COUNT_LETTERS = 26;
    public static final int BEGIN_ARRAY = 0;
    public static final int NOT_INIT = 0;

    public static void main(String[] args) {

        MusicalShop musicalShop = new MusicalShop(createInstruments());

        String codingMusicalShop = coderString(musicalShop.toString());
        String decodingMusicalShop = decoderString(codingMusicalShop);

        System.out.println(musicalShop);
        System.out.println(codingMusicalShop);
        System.out.println(decodingMusicalShop);

    }

    public static String coderString(String forCoding){

        char[] chars = forCoding.toCharArray();

        for (int i = BEGIN_ARRAY; i < chars.length; i++) {
            chars[i] = coderChar(chars[i]);
        }

        String resultString = new String(chars);

        return resultString;
    }

    public static String decoderString(String forCoding){

        char[] chars = forCoding.toCharArray();

        for (int i = BEGIN_ARRAY; i < chars.length; i++) {
            chars[i] = decoderChar(chars[i]);
        }

        String resultString = new String(chars);

        return resultString;
    }

    private static char coderChar(int forCoding){

        int code = forCoding;
        int offsetASCII= getOffsetASCII(code);

        if (offsetASCII != NOT_INIT) {
            code = (char) (((forCoding - offsetASCII) + OFFSET_FOR_CODING) % COUNT_LETTERS + offsetASCII);
        }
        return (char) code;
    }

    private static int getOffsetASCII(int code) {

        int offsetASCII = NOT_INIT;

        if (code >= BEGIN_BIG_LATIN && code <= END_BIG_LATIN){

            offsetASCII = BEGIN_BIG_LATIN;

        }else if (code >= BEGIN_LITTLE_LATIN && code <= END_LITTLE_LATIN){

            offsetASCII = BEGIN_LITTLE_LATIN;

        }

        return offsetASCII;
    }

    private static char decoderChar(int forDecoding){

        int decode = forDecoding;
        int offsetASCII= getOffsetASCII(decode);

        if (offsetASCII != NOT_INIT) {

            decode = forDecoding - offsetASCII;

            decode = COUNT_LETTERS + decode - OFFSET_FOR_CODING;
            decode = decode % COUNT_LETTERS;

            decode = (char) (decode + offsetASCII);
        }

        return (char) decode;
    }

}
