package unit10;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import static unit9.CoderDecoder.coderString;
import static unit9.CoderDecoder.decoderString;

public class Main {

    private static String[] arrayData = {"In today\'s competitive and rapidly evolving market landscape\n",
            "many organizations are leveraging business process services to streamline operations\n",
            "and increase productivity.\n",
            "By transferring responsibility for non-core business processes to an Oracle partner,\n",
                    "companies are able to remain agile, be responsive to changing conditions and effectively\n",
                    "manage costs. Customers of Oracle BPS providers get access to world-leading software\n ",
                    "technology that delivers best-in-class business value. Below you'll find an extensive list\n ",
                    "of Oracle BPS providers from across the globe\n",
            "Modern HR empowers the individual by leveraging easy to use tools that are personalized, social,\n ",
                    "deliver insights and cover the full employee lifecycle. With Oracle HCM Cloud, you can find,\n ",
                    "grow, and retain the best talent, enable collaboration, provide complete workforce insights,\n ",
                    "increase operational efficiency and make it easy for everyone to connect on any device.\n",
            "The current economy is service-driven. To win, your\n" +
                    "organization must focus on two things: taking care\n" +
                    "of customers and taking care of employees. But in\n" +
                    "a landscape that is shaped by competitive pressures,\n" +
                    "talent scarcity, and workforce demographic changes,\n" +
                    "keeping top-notch employees who are engaged\n" +
                    "and productive can be a challenge. Modern human\n" +
                    "resources (HR) applications can help by giving employees\n" +
                    "a way to interact with you that’s rewarding and\n" +
                    "even fun. "};

    public static final String DATA_FILE = "data";

    public static void main(String[] args) {

        try(FileWriter out = new FileWriter(DATA_FILE)){

            for (String elArray: arrayData) {
                out.write(coderString(elArray));
            }
        }catch (IOException e){
            System.err.println("I can\'t create file name is " + DATA_FILE);
        }

        try(Stream<String> streamFromFile = Files.lines(Paths.get(DATA_FILE))) {
            streamFromFile.forEachOrdered((p) -> System.out.println(decoderString(p) + "\n"));
        } catch (IOException e) {
            System.err.println("This file name isn\'t");
        }


    }
}
