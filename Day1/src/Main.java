import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("input"));
        int result = 0;
        while (scanner.hasNext()) {
            String s = scanner.next();
            String op = s.substring(0, 1);
            int num = Integer.valueOf(s.substring(1));
            result = op.equals("-") ? result - num : result + num;
            System.out.println(result);
        }
    }
}
