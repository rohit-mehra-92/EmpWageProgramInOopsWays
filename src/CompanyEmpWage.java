public class CompanyEmpWage {
    public final int empRatePerHour;
    public final int maxWorkingDays;
    public final int maxHourPerMonth;
    public final String company;

    public CompanyEmpWage(String company, int empRatePerHour, int maxWorkingDays, int maxHourPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxHourPerMonth = maxHourPerMonth;
    }
}
