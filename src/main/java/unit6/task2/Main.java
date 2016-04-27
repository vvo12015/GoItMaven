package unit6.task2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final String MESSAGE_OF_RESULT = "The result of removing is: ";
    private static final int COUNT_PIANO = 15;
    private static final int COUNT_GUITAR = 15;
    private static final int COUNT_TRUMPET = 15;
    private static final int COUNT_INSTRUMENT_IN_LINE = 10;

    public static void main(String[] args) {

        MusicalShop musicalShop = new MusicalShop();

        PrintShop(musicalShop);

        Map<String, Integer> order = initOrderMap();

        int countLine = 0;

        try {
            for (Instrument result :
                    musicalShop.prepareInstruments(order)) {
                System.out.print(result.getName());
                countLine++;
                if (countLine > COUNT_INSTRUMENT_IN_LINE) {
                    countLine = 0;
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println(MESSAGE_OF_RESULT);
            musicalShop.removeInstrumentsFromTheShop(order);
        }catch (BigOrderException | IllegalStateException e) {
                System.out.println(e.getMessage());
        }

        System.out.println(musicalShop);
    }

    private static void PrintShop(MusicalShop musicalShop) {
        System.out.println(musicalShop);
        System.out.println();
    }

    private static Map<String, Integer> initOrderMap() {
        Map<String, Integer> order = new HashMap<>();
        order.put(Piano.PIANO, COUNT_PIANO);
        order.put(Guitar.GUITAR, COUNT_GUITAR);
        order.put(Trumpet.TRUMPET, COUNT_TRUMPET);
        return order;
    }
}
