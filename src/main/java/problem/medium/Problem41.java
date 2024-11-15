package problem.medium;

import java.util.AbstractMap.SimpleEntry;
import java.util.List;
import java.util.stream.Collectors;

public class Problem41 {

    /**
     * 주어진 문자열 리스트에서 'c'로 시작하는 문자열의 개수와 이들 문자열의 평균 길이를 계산합니다.
     * 만약 'c'로 시작하는 문자열이 없으면 개수는 0, 평균 길이는 0.0을 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 'c'로 시작하는 문자열의 개수와 평균 길이를 포함하는 SimpleEntry (개수, 평균 길이)
     */
    public static SimpleEntry<Long, Double> countAndAverageLengthOfStringsStartingWithC(List<String> strings) {
        long count = strings.stream()
                .filter(s -> s.startsWith("c"))
                .count(); // 'c'로 시작하는 문자열의 개수

        double averageLength = strings.stream()
                .filter(s -> s.startsWith("c"))
                .mapToInt(String::length) // 문자열 길이로 변환
                .average() // 평균 계산
                .orElse(0.0); // 값이 없을 경우 0.0 반환

        return new SimpleEntry<>(count, averageLength);
    }
}
