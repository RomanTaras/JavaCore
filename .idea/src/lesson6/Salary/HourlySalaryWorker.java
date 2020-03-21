package lesson6.Salary;

public class HourlySalaryWorker implements Salary {
    @Override
    public void getSalary() {
        System.out.println("Hourly salary of worker = "+(80000/22/8)+" UAN per hour");
    }

    public static void main(String[] args) {
        HourlySalaryWorker w1 = new HourlySalaryWorker();
        w1.getSalary();
    }
}



