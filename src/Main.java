public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        System.out.println();

        Employee employee = new Employee();

       int totalWage = employee.empMonthlyWage();
       System.out.println("Employee monthly wage : $" + totalWage);
    }
}
