public class Employee<workHour> {
    public static final int WAGE_PER_HOUR = 20;

    public int isPresent() {
        int empCheck = (int) (Math.random() * 3);
        return empCheck;
    }

    public int empDailyWage() {
        int workHour = 0;
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
        int empDailyWage = workHour * WAGE_PER_HOUR;
        return empDailyWage;
    }
}
