package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

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
  void countToFifteen() {
    //GIVEN
    FizzBuzz fizzBuzz = new FizzBuzz();

    //WHEN
    fizzBuzz.execute(15);

    //THEN
    String[] lineSystemOutPrintln = outputStreamCaptor.toString().split(LINE_BREAK);
    assertThat(oneToFifteen(), is(lineSystemOutPrintln));
  }

  @Test
  void countToHundred() {
    //GIVEN
    FizzBuzz fizzBuzz = new FizzBuzz();

    //WHEN
    fizzBuzz.execute(100);

    //THEN
    String[] lineSystemOutPrintln = outputStreamCaptor.toString().split(LINE_BREAK);
    assertThat(oneToHundred(), is(lineSystemOutPrintln));
  }

  @Test
  void multipleOfThree() {
    //GIVEN
    FizzBuzz fizzBuzz = new FizzBuzz();

    //WHEN
    String result = fizzBuzz.convert(2379423);

    //THEN
    assertThat(FIZZ, is(result));
  }

  @Test
  void multipleOfFive() {
    //GIVEN
    FizzBuzz fizzBuzz = new FizzBuzz();

    //WHEN
    String result = fizzBuzz.convert(5795345);

    //THEN
    assertThat(BUZZ, is(result));
  }

  @Test
  void multipleOfThreeAndFive() {
    //GIVEN
    FizzBuzz fizzBuzz = new FizzBuzz();

    //WHEN
    String result = fizzBuzz.convert(324942735);

    //THEN
    assertThat(FIZZ_BUZZ, is(result));
  }
  private static String[] oneToFifteen() {
    return new String[]{"1", "2", FIZZ, "4", BUZZ, FIZZ, "7", "8", FIZZ, BUZZ,
            "11", FIZZ, "13", "14", FIZZ_BUZZ};
  }


  private static String[] oneToHundred() {
    return new String[]{"1", "2", FIZZ, "4", BUZZ, FIZZ, "7", "8", FIZZ, BUZZ,
            "11", FIZZ, "13", "14", FIZZ_BUZZ, "16", "17", FIZZ, "19", BUZZ,
            FIZZ, "22", "23", FIZZ, BUZZ, "26", FIZZ, "28", "29", FIZZ_BUZZ,
            "31", "32", FIZZ, "34", BUZZ, FIZZ, "37", "38", FIZZ, BUZZ,
            "41", FIZZ, "43", "44", FIZZ_BUZZ, "46", "47", FIZZ, "49", BUZZ,
            FIZZ, "52", "53", FIZZ, BUZZ, "56", FIZZ, "58", "59", FIZZ_BUZZ,
            "61", "62", FIZZ, "64", BUZZ, FIZZ, "67", "68", FIZZ, BUZZ,
            "71", FIZZ, "73", "74", FIZZ_BUZZ, "76", "77", FIZZ, "79", BUZZ,
            FIZZ, "82", "83", FIZZ, BUZZ, "86", FIZZ, "88", "89", FIZZ_BUZZ,
            "91", "92", FIZZ, "94", BUZZ, FIZZ, "97", "98", FIZZ, BUZZ};
  }
}