package problem.medium;

import problem.medium.resources.Customer2;
import problem.medium.resources.Order;

import java.util.List;
import java.util.stream.Collectors;

public class Problem53 {

    /**
     * 주어진 고객(Customer2) 리스트에서 각 고객별로 주문한 'Milk' 제품의 총 수량을 계산합니다.
     *
     * @param customers 고객 리스트
     * @return 각 고객별 'Milk' 제품의 총 주문 수량을 나타내는 리스트
     */
    public static List<String> getTotalMilkOrdersForEachCustomer(List<Customer2> customers) {
        return customers.stream()
                .map(customer -> {
                    // 'Milk' 제품의 총 수량 계산
                    int totalMilkQuantity = customer.getOrders().stream()
                            .filter(order -> order.getProduct().equalsIgnoreCase("Milk")) // 대소문자 구분 없이 'Milk' 필터링
                            .mapToInt(Order::getQuantity) // 수량을 int로 변환
                            .sum(); // 총합 계산
                    // 고객 이름과 총 수량을 문자열로 반환
                    return customer.getName() + ": " + totalMilkQuantity;
                })
                .collect(Collectors.toList()); // 결과를 리스트로 수집
    }
}
