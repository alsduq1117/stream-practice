package problem.medium;

import java.util.List;

public class Problem44 {

    /**
     * 주어진 정수 리스트에서 5 이상 10 이하의 숫자를 제외하고 나머지 숫자들의 합을 계산합니다.
     *
     * @param numbers 정수 리스트
     * @return 5 이상 10 이하를 제외한 숫자들의 합
     */
    public static int sumExcludingRange(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number < 5 || number > 10)
                .reduce(0, (a, b) -> a + b);
    }
}
