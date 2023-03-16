package model;

import java.util.stream.IntStream;

public class FizzBuzz {
    private static final int MULTIPLIER_THREE = 3;
    private static final int MULTIPLIER_FIVE = 5;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    public void execute(Integer count) {
        IntStream.rangeClosed(1, count).mapToObj(this::convert).forEach(this::print);
    }

    private void print(String result) {
        System.out.println(result);
    }
    public String convert(Integer count) {
        if(multipleOf(count, MULTIPLIER_THREE) && multipleOf(count, MULTIPLIER_FIVE)) {
            return FIZZ_BUZZ;
        } else if(multipleOf(count, MULTIPLIER_THREE)) {
            return FIZZ;
        } else if(multipleOf(count, MULTIPLIER_FIVE)) {
            return BUZZ;
        } else {
            return count.toString();
        }
    }
    private boolean multipleOf(int number, int multiplier) {
        return number%multiplier == 0;
    }
}
