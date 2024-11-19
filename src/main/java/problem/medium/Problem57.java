package problem.medium;

import problem.medium.resources.Order;

import java.util.List;
import java.util.stream.Collectors;

public class Problem57 {

    /**
     * 주어진 주문(Order) 리스트에서 'Coffee' 제품을 포함하는 주문들을 찾아 반환합니다.
     *
     * @param orders 주문 리스트
     * @return 'Coffee' 제품을 포함하는 주문 리스트
     */
    public static List<Order> findOrdersWithCoffee(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProduct().equalsIgnoreCase("Coffee"))
                .collect(Collectors.toList());
    }
}
