import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Day1Test {
    @Test
    void solveExampleA() {
        long output = new Day1().solveA(readInput("day1-example.txt"));
        Assertions.assertEquals(3, output);
    }

    @Test
    void solveInputA() {
        long output = new Day1().solveA(readInput("day1-input.txt"));
        Assertions.assertEquals(1089, output);
    }

    @Test
    void solveExampleB() {
        long output = new Day1().solveB(readInput("day1-example.txt"));
        Assertions.assertEquals(6, output);
    }

    @Test
    void solveInputB() {
        long output = new Day1().solveB(readInput("day1-input.txt"));
        Assertions.assertEquals(6530, output);
    }

    List<Day1.Data> readInput(String filename) {
        return TestUtil.readInput(filename).stream().map(str -> {
            char direction = str.charAt(0);
            int value = Integer.parseInt(str.substring(1));
            return new Day1.Data(direction, value);
        }).toList();
    }
}
