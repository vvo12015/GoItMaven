package unit8.task2.withoutStreams;

import unit6.task2.*;
import unit8.task1.PrintShop;


import java.util.LinkedList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        MusicalShop musicalShop = new MusicalShop(createInstruments());
        PrintShop.printMusicalShop(musicalShop);

        TreeSet<Instrument> sortedMusicalSet = new TreeSet<Instrument>(new MyComparator());

        for (Instrument instrument: musicalShop.getStorage()) {
            sortedMusicalSet.add(instrument);
        }

        LinkedList<Instrument> sortedInstruments = new LinkedList<Instrument>();

        for (Instrument instrument: sortedMusicalSet) {
            sortedInstruments.add(instrument);
        }

        MusicalShop sortedMusicalShop = new MusicalShop(sortedInstruments);

        PrintShop.printMusicalShop(sortedMusicalShop);
    }

    private static LinkedList<Instrument> createInstruments() {

        LinkedList<Instrument> instruments = new LinkedList<Instrument>();

        instruments.add(new Piano("Dexibell VIVO H3 WH", 62877,
                "DX-0007", "цифрове піаніно", "blue"));
        instruments.add(new Piano("Dexibell VIVO H7 PRDM", 72109,
                "DX-0003", "цифрове піаніно для дому", "red"));
        instruments.add(new Piano("ROLAND FP-30-WH", 23426,
                "RO2101", "(без стойки) цифрове піаніно", "green"));


        instruments.add(new Guitar("Ample LF-4121 N", 2701,
                "10903", "акустична гітара, червоне дерево", "red"));
        instruments.add(new Guitar("Cort AD810 Nat", 3359,
                "3048", "акустична, дредноут, колір натуральний", "white"));
        instruments.add(new Guitar("Godin A5 Ultra Fretless EN SA with Bag",
                40728, "9535", "бас-гітара, 5 струн, серія А", "blue"));

        instruments.add(new Trumpet("Maxtone TTC23L", 4160,
                "43220", "бюджетна труба тайваньского виробництва", "silver"));
        instruments.add(new Trumpet("Jupiter JTR308S", 15830,
                "60674", "високоякісний студентський інструмент", "gold"));
        instruments.add(new Trumpet("SCHILKE G1L-4", 115770,
                "117704", "Труба Строй: Соль; Мензура: 11.42мм;" +
                " Раструб: 111,13 мм; Корпус: срібний", "yellow"));

        return instruments;
    }


}
