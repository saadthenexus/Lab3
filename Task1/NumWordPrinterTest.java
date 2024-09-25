
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
    
    @Test
    public void testNonDivisible() {
        NumWordPrinter printer = new NumWordPrinter();
        String result = printer.printWord(7, false);
        assertEquals("OddOneOut", result);
    }
   
    @Test
    public void testUpperCaseOutput() {
        NumWordPrinter printer = new NumWordPrinter();
        String result = printer.printWord(26, true); 
        assertEquals("EVEN", result);
    }
    
    @Test
    public void testDivisibleByAllThree() {
        NumWordPrinter printer = new NumWordPrinter();
        String result = printer.printWord(286, false); // Divisible by 2, 11, and 13
        assertEquals("EvenPrimeLucky", result);
    }

}

