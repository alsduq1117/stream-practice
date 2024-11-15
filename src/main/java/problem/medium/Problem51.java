package problem.medium;

import problem.medium.resources.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class Problem51 {

    /**
     * 주어진 직원(Employee) 리스트에서 'IT' 부서에 속하고,
     * 나이가 30 이상인 직원들의 이름을 알파벳 순으로 정렬하여 반환합니다.
     *
     * @param employees 직원 리스트
     * @return 조건을 만족하는 직원들의 이름 리스트
     */
    public static List<String> getNamesOfITDepartmentEmployeesOver30(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> employee.getDepartment() == "IT")
                .filter(employee -> employee.getAge() > 30)
                .map(Employee::getName)
                .sorted()
                .collect(Collectors.toList());
    }
}