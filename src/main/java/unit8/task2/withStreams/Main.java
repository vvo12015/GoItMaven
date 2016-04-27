package unit8.task2.withStreams;

import unit6.task2.*;
import unit8.task1.PrintShop;


import java.util.LinkedList;
import java.util.stream.Collectors;

import static unit8.task1.Main.createInstruments;

public class Main {

    public static void main(String[] args) {

        MusicalShop musicalShop = new MusicalShop(createInstruments());

        PrintShop.printMusicalShop(musicalShop);

        LinkedList<Instrument> instruments = new LinkedList<>(musicalShop.getStorage()
                .stream()
                .sorted((i1, i2) -> i1.getName().compareTo(i2.getName()))
                .collect(Collectors.toList()));

        musicalShop.setStorage(instruments);

        PrintShop.printMusicalShop(musicalShop);
    }
}
