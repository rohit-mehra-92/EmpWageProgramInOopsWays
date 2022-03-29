public class Employee {
    public static final int FULL_DAY_HOUR=8;
    public static final int WAGE_PER_HOUR=20;

    public int isPresent() {
        int empCheck = (int) (Math.random() * 2);
        return empCheck;
    }

    public int empDailyWage(){
        int dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
        return dailyWage;
    }
}
