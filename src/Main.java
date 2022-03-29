public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        System.out.println();
        Employee emp = new Employee();

        int wage = emp.empDailyWage();
        System.out.println("Employee daily Wage : $" + wage);

    }
}
