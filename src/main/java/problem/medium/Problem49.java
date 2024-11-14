package problem.medium;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem49 {

    //다시 풀어보기
    /**
     * 주어진 문자열 리스트에서 각 문자열의 첫 글자를 대문자로 변환하고,
     * 나머지 글자는 소문자로 변환한 새로운 리스트를 반환합니다.
     *
     * @param strings 문자열 리스트
     * @return 변환된 문자열 리스트
     */
    public static List<String> capitalizeFirstLetter(List<String> strings) {
        return strings.stream()
                .map(s -> s.isEmpty() ? s : Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase())
                .collect(Collectors.toList());
    }
}
