package problem.easy;

import java.util.List;
import java.util.OptionalInt;

public class Problem4 {

    /**
     * 주어진 정수 리스트에서 최대값을 반환합니다.
     * 최소값을 찾는 것도 비슷한 방법으로 할 수 있습니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 리스트의 최대값
     */
    public static OptionalInt findMax(List<Integer> numbers) {
        return null;
    }

    //numbers.stream()은 Stream<Integer>를 반환합니다. max() 메서드는 IntStream, LongStream, 또는 DoubleStream에서만 사용할 수 있습니다.
    // 따라서 Stream<Integer>에서 직접 max()를 호출할 수 없습니다.
    // mapToInt를 사용하여 Integer를 int로 변환한 후, max()를 호출하면 IntStream에서 최대값을 찾을 수 있습니다.
}