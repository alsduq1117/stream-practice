package problem.easy;

import java.util.List;

public class Problem29 {

    /**
     * 주어진 문자열 리스트의 모든 문자열에서 문자 개수의 총합을 계산합니다.
     *
     * @param strings 문자열 리스트
     * @return 문자 개수의 총합
     */
    public static int totalCharacterCount(List<String> strings) {
        return strings.stream()
                .mapToInt(s -> s.length())
                .reduce(0, (a,b) -> a+b);
    }
}
