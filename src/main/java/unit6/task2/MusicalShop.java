package unit6.task2;

import java.util.*;

public class MusicalShop {

    private static final String MESSAGE_ILLEGAL_STATE_EXCEPTION = "This instrument is not in storage or You enter the name the instrument not right";
    private static final int COUNT_STORAGE_PIANO = 20;
    private static final int COUNT_STORAGE_GUITAR = 20;
    private static final int COUNT_STORAGE_TRUMPET = 20;

    public MusicalShop(LinkedList<Instrument> storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        String s = "";
        int j = 0;

        for (Instrument instrument:
             this.getStorage()) {
            s += instrument.getName() + ";";
            j++;
            if (j == 10){
                s += "\n";
                j = 0;
            }
        }
        return s;
    }

    public MusicalShop() {

        storage = new LinkedList<>();

        for (int i = 0; i < COUNT_STORAGE_PIANO; i++) {
            storage.add(new Piano());
        }

        for (int i = 0; i < COUNT_STORAGE_GUITAR; i++) {
            storage.add(new Guitar());
        }

        for (int i = 0; i < COUNT_STORAGE_TRUMPET; i++) {
            storage.add(new Trumpet());
        }
    }

    LinkedList<Instrument> storage;

    public LinkedList<Instrument> getStorage() {
        return storage;
    }

    public void setStorage(LinkedList<Instrument> storage) {
        this.storage = storage;
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order) throws IllegalStateException, BigOrderException{
        LinkedList<Instrument> result = new LinkedList<>();
        int countInstruments;

        for (Map.Entry<String, Integer> pair: order.entrySet()) {
            countInstruments = 0;
            for (Instrument instrument: this.getStorage()) {
                if (pair.getKey().equals(instrument.getName())) {
                    countInstruments++;
                    result.add(instrument);
                }
            }
            if (countInstruments < pair.getValue()) {
                throw new BigOrderException();
            }
            if (countInstruments == 0) {
                throw new IllegalStateException(MESSAGE_ILLEGAL_STATE_EXCEPTION);
            }
        }
        return result;
    }

    public void removeInstrumentsFromTheShop(Map<String, Integer> order){
        LinkedList<Instrument> instruments;
        instruments = (LinkedList<Instrument>) this.getStorage().clone();

        for (Map.Entry<String, Integer> orderEntry :
                order.entrySet()) {

            int numberInstrumentToRemove = orderEntry.getValue();

            Iterator<Instrument> iterator = instruments.iterator();

            while (iterator.hasNext()){
                if (iterator.next().getName().equals(orderEntry.getKey()) && numberInstrumentToRemove>0){
                    iterator.remove();
                    numberInstrumentToRemove--;
                }
            }

        }
        this.setStorage(instruments);

    }
    public void AddInstrumet(Instrument instrument, Integer i){
        for (int j = 0; j < i; j++) {
            this.storage.add(instrument);
        }
    }
}
