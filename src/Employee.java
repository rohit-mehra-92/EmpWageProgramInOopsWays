public class Employee<workHour> {
    public static final int WAGE_PER_HOUR = 20;

    public int isPresent() {
        int empCheck = (int) (Math.random() * 3);
        return empCheck;
    }

    public int empDailyWage() {
        int workHour = 0;
        if (isPresent() == 2) {
            System.out.println("Employee worked full day");
            workHour = 8;
        } else if (isPresent() == 1) {
            System.out.println("Employee worked half day");
            workHour = 4;
        } else {
            System.out.println("Employee is absent");
            workHour = 0;
        }
        int empDailyWage = workHour * WAGE_PER_HOUR;
        return empDailyWage;
    }
}
