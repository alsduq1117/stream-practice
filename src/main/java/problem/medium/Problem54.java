package problem.medium;

import java.util.Comparator;
import java.util.List;
import problem.medium.resources.Product;

public class Problem54 {

    /**
     * 주어진 제품(Product) 리스트에서 가장 높은 가격을 가진 제품의 이름을 반환합니다.
     * 리스트가 비어있다면 빈 문자열을 반환합니다.
     *
     * @param products 제품 리스트
     * @return 최대 가격을 가진 제품의 이름, 빈 리스트인 경우 빈 문자열
     */
    public static String getMostExpensiveProductName(List<Product> products) {
        return products.stream()
                .max(Comparator.comparing(Product::getPrice)) // 가격 기준으로 가장 비싼 제품 찾기
                .map(Product::getName) // 가장 비싼 제품의 이름 가져오기
                .orElse(""); // 만약 제품이 없다면 빈 문자열 반환
    }
}
