package unit8.task1;

import unit6.task2.Instrument;
import unit6.task2.MusicalShop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class PrintShop implements ConstantsPrintShop {


    public static final int FIRST_SYMBOL = 0;
    public static final int APOSTROPHE = 1;
    public static int WIDTH_TABLE;

    public static final int WIDE_BORDER_COLUMN = 1;

    static {
        WIDTHS_COLUMNS[0] = WIDTH_COLUMN_NAME;
        WIDTHS_COLUMNS[1] = WIDTH_COLUMN_PRICE;
        WIDTHS_COLUMNS[2] = WIDTH_COLUMN_ARTICLE;
        WIDTHS_COLUMNS[3] = WIDTH_COLUMN_DESCRIPTION;
        WIDTHS_COLUMNS[4] = WIDTH_COLUMN_COLOR;
        int widthTable = WIDE_BORDER_COLUMN;
        for (int width_column:
             WIDTHS_COLUMNS) {
            widthTable += width_column + WIDE_BORDER_COLUMN;
        }
        WIDTH_TABLE = widthTable;
    }

    public static void printMusicalShop(MusicalShop musicalShop){

        LinkedList<Instrument> instruments = new LinkedList<Instrument>(musicalShop.getStorage());

        ArrayList<String> instrumentToString = prepareInstrumentToTable(instruments);

        System.out.println(lineTable(BORDER_TABLE));

        PrintRow(getRowNamesOrValue(instrumentToString.get(BEGIN_ARRAY), NUMBER_NAME_IN_FIELD));

        for (String instrument:
             instrumentToString) {

            PrintRow(getRowNamesOrValue(instrument, NUMBER_VALUE_IN_FIELD));

        }

    }

    private static void PrintRow(ArrayList<ArrayList<String>> rows){

        int maxHeightRow = getMaxHeightRow(rows);

        try {
            if (rows.size() > COUNT_COLUMN) {
                throw new BigArrayException();
            }
        }catch (BigArrayException e){
            return;
        }

        for (int numberLineInRow = BEGIN_LINE; numberLineInRow < maxHeightRow; numberLineInRow++) {

            String resultLine = "";

            for (int numberColumn = NUMBER_FIRST_COLUMN; numberColumn < COUNT_COLUMN; numberColumn++) {

                ArrayList<String> row = rows.get(numberColumn);

                if (row.size() > numberLineInRow){

                    resultLine = row.get(numberLineInRow) + lineTable(WIDTHS_COLUMNS[numberColumn] -
                            row.get(numberLineInRow).length());

                }else {

                    resultLine = lineTable(WIDTHS_COLUMNS[numberColumn]);

                }
                if (numberColumn == NUMBER_FIRST_COLUMN) resultLine = BORDER_VERTICAL + resultLine;
                System.out.print(resultLine + BORDER_VERTICAL);
            }
            System.out.println();
        }

        System.out.println(lineTable(BORDER_TABLE));
    }

    private static int getMaxHeightRow(ArrayList<ArrayList<String>> rows) {

        int maxHeightRow = INITIAL_HEIGHT_ROW;

        for (ArrayList<String> row:
             rows) {

            if (maxHeightRow < row.size()){
                maxHeightRow = row.size();
            }
        }

        return maxHeightRow;
    }


    private static ArrayList<ArrayList<String>> getRowNamesOrValue(String instrumentToString, int numberNameOrValue) {

        String stringForPrint = prepareToSplit(instrumentToString, BEGIN_INSTRUMENT_TO_STRING, END_INSTRUMENT_TO_STRING);

        String[] fields = stringForPrint.split(SEPARATOR_BETWEEN_FIELDS);

        ArrayList<ArrayList<String>> row = new ArrayList<ArrayList<String>>();

        for (int numberColumn = BEGIN_ARRAY; numberColumn < COUNT_COLUMN; numberColumn++) {
            row.add(prepareAccordingWidthColumn(fields[numberColumn].split(SEPARATOR_IN_FIELD)[numberNameOrValue],
                    numberColumn));
        }

        return row;
    }

    private static ArrayList<String> prepareAccordingWidthColumn(String row, int numberColumn){

        ArrayList<String> forHyphenation = new ArrayList<String>();

        String resultRow = row;
        int widthsColumn = WIDTHS_COLUMNS[numberColumn];
        resultRow = stringWhithoutApostrophe(resultRow);
        forHyphenation.add(resultRow);

        if (row.length() > widthsColumn){

            forHyphenation.clear();
            boolean eofRow = true;
            int iteratorRow = BEGIN_STRING;

            while (eofRow){

                resultRow = "";

                if ((iteratorRow + widthsColumn) < row.length()) {

                    resultRow = (row.substring(iteratorRow, iteratorRow + widthsColumn));

                    iteratorRow += widthsColumn;

                }else {
                    resultRow += row.substring(iteratorRow, row.length());

                    eofRow = EOF_LINE;
                }
                forHyphenation.add(stringWhithoutApostrophe(resultRow));
            }

        }

        return forHyphenation;
    }

    private static String stringWhithoutApostrophe(String row) {

        String resultRow = row;

        if ((resultRow.charAt(FIRST_SYMBOL) == '\'') && (resultRow.length() > APOSTROPHE)){

            resultRow = resultRow.substring(FIRST_SYMBOL + OFFESET_STRING);

        }else if(resultRow.equals("'")){

            resultRow = "";

        }
        if (resultRow.length() > OFFESET_STRING) {
            if ((resultRow.charAt(resultRow.length() - OFFESET_STRING) == '\'')) {
                resultRow = resultRow.substring(FIRST_SYMBOL, resultRow.length() - OFFESET_STRING);
            }
        }
        return resultRow;
    }


    private static String prepareToSplit(String string, char beginChar, char endChar) {
        String stringForPrint = string.substring(string.indexOf(beginChar)+ OFFESET_STRING, string.indexOf(endChar));
        return stringForPrint;
    }

    private static ArrayList<String> prepareInstrumentToTable(LinkedList<Instrument> instruments) {

        ArrayList<String> instrumentToString = new ArrayList<String>();

        for (Instrument instrument:
             instruments) {
            instrumentToString.add(instrument.toStringForTable());
        }
        return instrumentToString;
    }

    private static String lineTable(int numberColumn) throws ArrayIndexOutOfBoundsException {

        String line = "";

        if (numberColumn == -1) {
            for (int i = 0; i < WIDTH_TABLE; i++) {
                line += BORDER_HORISONTAL;
            }
        }else {
            for (int i = 0; i < numberColumn; i++) {
                line += SPACE;
            }
        }

        return line;
    }
}
