package src.unit3.task3;

import java.util.HashMap;

public class MusicalShop {
    MusicalInstruments topGood;

    public MusicalInstruments getTopGood() {
        return topGood;
    }

    public void setTopGood(MusicalInstruments topGood) {
        this.topGood = topGood;
    }

    HashMap<MusicalInstruments, Integer> storage;

    public void AddMusicalInstrumet(MusicalInstruments musicalInstruments, Integer i){
        storage.put(musicalInstruments, i);
    }
}
