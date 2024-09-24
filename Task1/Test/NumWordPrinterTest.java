package Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumWordPrinterTest {

    
    @Test
    public void testDivisibleBy2And11() {
        NumWordPrinter printer = new NumWordPrinter();
        String result = printer.printWord(22, false);
        assertEquals("EvenPrimeEleven", result);
    }

    @Test
    public void testDivisibleBy13() {
        NumWordPrinter printer = new NumWordPrinter();
        String result = printer.printWord(13, false);
        assertEquals("LuckyThirteen", result);
    }

    
}

