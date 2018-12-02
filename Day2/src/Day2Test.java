import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Day2Test {

    @Test
    public void oneEntry2and3Letters() {
        int checksum = Day2.checksum(new String[]{"aaabb"});
        Assertions.assertEquals(1, checksum);
    }

    @Test
    public void oneEntry2and2Letters() {
        int checksum = Day2.checksum(new String[]{"aabb"});
        Assertions.assertEquals(0, checksum);
    }

    @Test
    public void oneEntry3and3Letters() {
        int checksum = Day2.checksum(new String[]{"aaabbb"});
        Assertions.assertEquals(0, checksum);
    }

    @Test
    public void twoEntry2and3Letters() {
        int checksum = Day2.checksum(new String[]{"aabbb" , "ccbbb"});
        Assertions.assertEquals(4, checksum);
    }

    @Test
    public void twoEntryOne2and2LettersSecond2and3Letters() {
        int checksum = Day2.checksum(new String[]{"aabb" , "ccbbb"});
        Assertions.assertEquals(2, checksum);
    }

    @Test
    public void twoEntryOne2and2LettersSecond2and2Letters() {
        int checksum = Day2.checksum(new String[]{"aabb" , "ccbb"});
        Assertions.assertEquals(0, checksum);
    }

    @Test
    public void twoEntry2and2LettersSecond2and2Letters() {
        int checksum = Day2.checksum(new String[]{"aabbbccc" , "ccbbb"});
        Assertions.assertEquals(4, checksum);
    }



}