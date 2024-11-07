package problem.easy;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Problem19 {

    // 다시 풀어보기

    /**
     * 스트림을 사용하여 문자열 배열에서 TreeMap을 생성합니다.
     * 배열의 각 요소를 key로 하고, 해당 요소의 길이를 value로 하는 TreeMap을 반환합니다.
     *
     * @param strings 문자열 배열
     * @return 생성된 TreeMap
     */
    public static Map<String, Integer> createTreeMapFromStream(String[] strings) {
        return Arrays.stream(strings)
                .collect(Collectors.toMap(
                        string -> string,
                        string -> string.length(),
                        (existing, replacement) -> existing,  //만약 동일한 키가 있을 경우, 기존 값을 유지하도록 설정
                        TreeMap::new
                ));
    }
}
