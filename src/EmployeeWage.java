public class EmployeeWage {
    public static final int FULL_DAY = 2;
    public static final int HALF_DAY = 1;

    private String company;
    private final int ratePerHour;
    private final int maxWorkingDays;
    private final int maxHourPerMonth;

    public EmployeeWage(String company, int ratePerHour, int maxWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.ratePerHour = ratePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }

    public int empWageCompute() {
        int workHour = 0;
        int totalWorkHour = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < maxWorkingDays && workHour <= maxHourPerMonth) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 3);
            switch (empCheck) {
                case FULL_DAY:
                    System.out.println("Employee worked full day");
                    workHour = 8;
                    break;
                case HALF_DAY:
                    System.out.println("Employee worked half day");
                    workHour = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    workHour = 0;
                    break;
            }
            totalWorkHour = totalWorkHour + workHour;
            System.out.println("Day#:" + totalWorkingDays + " workHour:" + workHour);
            System.out.println();
        }
        int totalEmpWage = totalWorkHour * ratePerHour * totalWorkingDays;
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage dMart = new EmployeeWage("dMart", 20, 20, 100);
        System.out.println("Total Wage Emp for " + dMart.company + " is : $" + dMart.empWageCompute());

        EmployeeWage bigBasket = new EmployeeWage("bigBasket", 10, 25, 130);
        System.out.println("Total Wage Emp for " + bigBasket.company + " is : $" + bigBasket.empWageCompute());
    }
}
