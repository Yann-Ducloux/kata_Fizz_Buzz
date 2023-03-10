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

    //WHEN
    fizzBuzz.execute(15);

    //THEN
    String lineSystemOutPrintln = outputStreamCaptor.toString();
    assertEquals("1"+LINE_BREAK+
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
            FIZZ_BUZZ +LINE_BREAK, lineSystemOutPrintln);
  }
}