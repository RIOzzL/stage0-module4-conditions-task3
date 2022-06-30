package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary > 0) {
            if (salary <= 10_000) {
                System.out.println(salary * 0.85);
            }
            if (salary > 10_000 & salary <= 20_000) {
                System.out.println(salary * 0.82);
            }
            if (salary > 20_000) {
                System.out.println(salary * 0.80);
            }
        } else {
            System.out.println("wrong input!");
        }
    }
}
