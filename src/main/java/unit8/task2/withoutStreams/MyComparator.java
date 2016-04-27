package unit8.task2.withoutStreams;

import unit6.task2.Instrument;

import java.util.Comparator;

public class MyComparator implements Comparator<Instrument> {
    public int compare(Instrument i1, Instrument i2) {
        return i1.getName().compareTo(i2.getName());
    }
}
