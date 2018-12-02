import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        int result = 0;
        boolean[] alreadyVisited = new boolean[200000];
        boolean[] alreadyVisitedNegative = new boolean[200000];
        alreadyVisited[result] = true;
        Scanner scanner = new Scanner(new File("input"));
        boolean found = false;
        while (!found) {
            String s = scanner.next();
            String op = s.substring(0, 1);
            int num = Integer.valueOf(s.substring(1));
            result = op.equals("-") ? result - num : result + num;
            boolean negative = result < 0;
            int absResult = Math.abs(result);
            if ((negative && alreadyVisitedNegative[absResult]) ||
                    (!negative && alreadyVisited[result])) {
                System.out.println(result);
                found = true;
                continue;
            }
            if (negative) {
                alreadyVisitedNegative[absResult] = true;
            } else {
                alreadyVisited[result] = true;
            }
            if (!scanner.hasNext()) {
                scanner = new Scanner(new File("input"));
            }
        }
    }
}