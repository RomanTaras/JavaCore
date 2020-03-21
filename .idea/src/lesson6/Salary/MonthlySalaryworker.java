package lesson6.Salary;

public class MonthlySalaryworker implements Salary {
    @Override
    public void getSalary() {
        System.out.println("Monthly salary of worker = " + (2 * 20 * 2000) + " UAN per month");
    }

    public static void main(String[] args) {
        MonthlySalaryworker w2 = new MonthlySalaryworker();
        w2.getSalary();
    }
}
