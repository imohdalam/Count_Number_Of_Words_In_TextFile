import java.io.File;
import java.util.Scanner;

public class WordCount{
    public static void main(String... args) throws Exception {
        File file = new File("The_life_of_the_Grasshopper.txt");
        Scanner input = new Scanner(file);
        long count = 0;
        while (input.hasNextLine())
        {
            String line = input.nextLine();
            count += line.split(" ").length;
        }
        System.out.println("The Life Of The Grasshopper has "+count+" words.");
    }
}
