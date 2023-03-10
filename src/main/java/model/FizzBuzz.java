package model;

import java.util.stream.IntStream;

public class FizzBuzz {
    private static final int MULTIPLIER_THREE = 3;
    private static final int MULTIPLIER_FIVE = 5;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";
    public void execute(Integer count) {
        IntStream iterate = IntStream.iterate(1, i -> i+1).limit(count);
        iterate.forEach(this::print);
    }
    private void print(Integer count) {
        if(multipleOf(count, MULTIPLIER_THREE) && multipleOf(count, MULTIPLIER_FIVE)) {
            System.out.println(FIZZ_BUZZ);
        } else if(multipleOf(count, MULTIPLIER_THREE)) {
            System.out.println(FIZZ);
        } else if(multipleOf(count, MULTIPLIER_FIVE)) {
            System.out.println(BUZZ);
        } else {
            System.out.println(count);
        }
    }
    private boolean multipleOf(int number, int multiplier) {
        return number%multiplier == 0;
    }
}
