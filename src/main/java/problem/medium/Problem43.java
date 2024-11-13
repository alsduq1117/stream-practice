package problem.medium;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem43 {

    /**
     * 주어진 문자열 리스트와 정수 리스트를 결합하여,
     * 문자열의 길이가 해당 정수 이하인 문자열만 필터링하여 반환합니다.
     *
     * @param strings 문자열 리스트
     * @param lengths 정수 리스트 (각 문자열의 최대 길이를 나타냄)
     * @return 조건을 만족하는 문자열 리스트
     */
    public static List<String> filterStringsByLength(List<String> strings, List<Integer> lengths) {
        return IntStream.range(0, strings.size())
                .filter(i -> strings.get(i).length() < lengths.get(i))
                .mapToObj(strings::get) // 필터링된 인덱스를 사용하여 원래 리스트에서 해당 문자열을 가져오는 역할
                .collect(Collectors.toList());

    }
}
