package unit6.task1;

import java.util.Scanner;

public class Reader {

    public static final String WORNG_ENTER_NUMBER = "Wrong type from number enter";
    public Scanner scanner;

    private void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    private Scanner getScanner() {
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
                System.err.print(WORNG_ENTER_NUMBER);
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
                System.err.print(WORNG_ENTER_NUMBER);
                scanner = new Scanner(System.in);
            }
        }
    }

    public String getString(String message){
        String s;
        System.out.println(message);
        s = scanner.nextLine();
        return s;
    }
}
