package unit8.task1;

public interface ConstantsPrintShop {
    int BEGIN_STRING = 0;
    char BEGIN_INSTRUMENT_TO_STRING = '{';
    char END_INSTRUMENT_TO_STRING = '}';
    String SEPARATOR_BETWEEN_FIELDS = ",, ";
    int BEGIN_ARRAY = 0;
    int NUMBER_NAME_IN_FIELD = 0;
    String SEPARATOR_IN_FIELD = "=";
    int BEGIN_LINE = 0;
    int WIDTH_COLUMN_NAME = 20;
    int WIDTH_COLUMN_PRICE = 10;
    int WIDTH_COLUMN_ARTICLE = 10;
    int WIDTH_COLUMN_DESCRIPTION = 50;
    int WIDTH_COLUMN_COLOR = 10;
    int COUNT_COLUMN = 5;
    int[] WIDTHS_COLUMNS = new int[COUNT_COLUMN];
    boolean EOF_LINE = false;
    int NUMBER_VALUE_IN_FIELD = 1;
    int BORDER_TABLE = -1;
    int NUMBER_FIRST_COLUMN = 0;
    int INITIAL_HEIGHT_ROW = 1;
    String BORDER_VERTICAL = "|";
    int OFFESET_STRING = 1;
    String BORDER_HORISONTAL = "-";
    String SPACE = " ";
}
