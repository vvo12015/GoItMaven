package unit4;

import java.util.Scanner;

class Reader {

    private static final String WRONG_INT = "Wrong enter. Please repeat enter number of type int";
    public static final String WRONG_DOUBLE = "Wrong enter. Please repeat enter number of type double";

    Scanner scanner;

    public Scanner getScanner() {
        return scanner;
    }

    public Reader() {
        this.scanner = new Scanner(System.in);
    }

    public int getInt(String message){

        while (true) {
            try {
                System.out.println(message);
                return scanner.nextInt();
            }catch (Exception e){
                System.err.print(WRONG_INT);
                scanner = new Scanner(System.in);
            }
        }
    }

    public double getDouble(String message){

        while (true) {
            try {
                System.out.println(message);
                return scanner.nextDouble();
            }catch (Exception e){
                System.err.print(WRONG_DOUBLE);
                scanner = new Scanner(System.in);
            }
        }
    }

    public String getString(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}
