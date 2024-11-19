package problem.medium;

import problem.medium.resources.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Problem56 {

    /**
     * 주어진 직원(Employee) 리스트에서 'Sales' 부서에 속한 직원들의 이름을 반환합니다.
     *
     * @param employees 직원 리스트
     * @return 'Sales' 부서에 속한 직원들의 이름 리스트
     */
    public static List<String> getNamesOfSalesDepartmentEmployees(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.getDepartment().equalsIgnoreCase("Sales"))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
    }
}
