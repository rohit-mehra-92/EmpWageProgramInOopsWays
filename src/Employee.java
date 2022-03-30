public class Employee {
    public static final int WAGE_PER_HOUR = 20;
    public static final int MAX_WORKING_DAY_PER_MONTH = 20;
    public static final int MAX_WORKING_HOUR_PER_MONTH = 100;

    public int isPresent() {
        int empCheck = (int) (Math.random() * 3);
        return empCheck;
    }

    public int empMonthlyWage() {
        int workHour = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < MAX_WORKING_DAY_PER_MONTH && workHour <= MAX_WORKING_HOUR_PER_MONTH) {
            totalWorkingDays++;
            switch (isPresent()) {
                case 1:
                    System.out.println("Employee worked full day");
                    workHour = 8;
                    break;
                case 2:
                    System.out.println("Employee worked half day");
                    workHour = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    workHour = 0;
                    break;
            }
            System.out.println("Day#:" + totalWorkingDays + " workHour:" + workHour);
            System.out.println();
        }
        int totalWage = workHour * WAGE_PER_HOUR * totalWorkingDays;
        return totalWage;
    }
}