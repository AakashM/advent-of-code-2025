import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Day1 {
    public record Data(char direction, int value) {}
    public long solveA(List<Data> input) {
        int current = 50;
        int result = 0;
        for(Data data: input) {
            current += data.direction == 'R' ? data.value : -data.value;

            current = current % 100;
            if(current < 0) current += 100;

            if(current == 0) result++;
        }
        return result;
    }

    public long solveB(List<Data> input) {
        int current = 50;
        int result = 0;
        for(Data data: input) {
            int newcurrent = data.direction == 'R' ? current + data.value : current - data.value;

            if(newcurrent == 0) result++;
            result += Math.abs(newcurrent / 100);
            if(current > 0 && newcurrent < 0) result++;

            current = newcurrent;
            current = current % 100;

            if(current < 0) current += 100;

        }
        return result;
    }
}
