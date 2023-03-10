package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class FizzBuzzTest {
  private static final String LINE_BREAK = System.getProperty("line.separator");
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
  private static final String FIZZ = "Fizz";
  private static final String BUZZ = "Buzz";
  private static final String FIZZ_BUZZ = "FizzBuzz";


  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }
  @Test
  public void countTo15() {
    //GIVEN
    FizzBuzz fizzBuzz = new FizzBuzz();
    String printExpected = "1"+LINE_BREAK+
            "2"+LINE_BREAK+
            FIZZ +LINE_BREAK+
            "4"+LINE_BREAK+
            BUZZ +LINE_BREAK+
            FIZZ +LINE_BREAK+
            "7"+LINE_BREAK+
            "8"+LINE_BREAK+
            FIZZ +LINE_BREAK+
            BUZZ +LINE_BREAK+
            "11"+LINE_BREAK+
            FIZZ +LINE_BREAK+
            "13"+LINE_BREAK+
            "14"+LINE_BREAK+
            FIZZ_BUZZ +LINE_BREAK;
    //WHEN
    fizzBuzz.execute(15);

    //THEN
    String lineSystemOutPrintln = outputStreamCaptor.toString();
    assertEquals(printExpected, lineSystemOutPrintln);
  }
  @Test
  public void countTo100() {
    //GIVEN
    FizzBuzz fizzBuzz = new FizzBuzz();
    String printExpected="1"+LINE_BREAK+
            "2"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "4"+LINE_BREAK+
            BUZZ+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "7"+LINE_BREAK+
            "8"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            BUZZ+LINE_BREAK+
            "11"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "13"+LINE_BREAK+
            "14"+LINE_BREAK+
            FIZZ_BUZZ+LINE_BREAK+
            "16"+LINE_BREAK+
            "17"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "19"+LINE_BREAK+
            BUZZ+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "22"+LINE_BREAK+
            "23"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            BUZZ+LINE_BREAK+
            "26"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "28"+LINE_BREAK+
            "29"+LINE_BREAK+
            FIZZ_BUZZ+LINE_BREAK+
            "31"+LINE_BREAK+
            "32"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "34"+LINE_BREAK+
            BUZZ+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "37"+LINE_BREAK+
            "38"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            BUZZ+LINE_BREAK+
            "41"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "43"+LINE_BREAK+
            "44"+LINE_BREAK+
            FIZZ_BUZZ+LINE_BREAK+
            "46"+LINE_BREAK+
            "47"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            49+LINE_BREAK+
            BUZZ+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "52"+LINE_BREAK+
            "53"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            BUZZ+LINE_BREAK+
            "56"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "58"+LINE_BREAK+
            "59"+LINE_BREAK+
            FIZZ_BUZZ+LINE_BREAK+
            "61"+LINE_BREAK+
            "62"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "64"+LINE_BREAK+
            BUZZ+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "67"+LINE_BREAK+
            "68"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            BUZZ+LINE_BREAK+
            "71"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "73"+LINE_BREAK+
            "74"+LINE_BREAK+
            FIZZ_BUZZ+LINE_BREAK+
            "76"+LINE_BREAK+
            "77"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "79"+LINE_BREAK+
            BUZZ+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "82"+LINE_BREAK+
            "83"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            BUZZ+LINE_BREAK+
            "86"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "88"+LINE_BREAK+
            "89"+LINE_BREAK+
            FIZZ_BUZZ+LINE_BREAK+
            "91"+LINE_BREAK+
            "92"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "94"+LINE_BREAK+
            BUZZ+LINE_BREAK+
            FIZZ+LINE_BREAK+
            "97"+LINE_BREAK+
            "98"+LINE_BREAK+
            FIZZ+LINE_BREAK+
            BUZZ+LINE_BREAK;


    //WHEN
    fizzBuzz.execute(100);

    //THEN
    String lineSystemOutPrintln = outputStreamCaptor.toString();
    assertEquals(printExpected, lineSystemOutPrintln);
  }

}