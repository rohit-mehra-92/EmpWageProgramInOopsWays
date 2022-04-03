public class EmployeeWage {
    public static final int FULL_DAY = 2;
    public static final int HALF_DAY = 1;

    private int numOfCompany = 0;
    CompanyEmpWage[] companyEmpWages = new CompanyEmpWage[3];

    private void addCompanyWage(String company, int ratePerHour, int maxWorkingDays, int maxHourPerMonth) {
        companyEmpWages[numOfCompany] = new CompanyEmpWage(company, ratePerHour, maxWorkingDays, maxHourPerMonth);
        numOfCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            int totalEmpWage = this.empWageCompute(companyEmpWages[i]);
            System.out.println("Total emp wage for company for " + companyEmpWages[i].company + " is : $" + totalEmpWage);
            System.out.println();
        }
    }

    public int empWageCompute(CompanyEmpWage companyEmpWage) {
        int workHour = 0;
        int totalWorkHour = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < companyEmpWage.maxWorkingDays && workHour <= companyEmpWage.maxHourPerMonth) {
            totalWorkingDays++;
            int empCheck = (int) (Math.random() * 3);
            switch (empCheck) {
                case FULL_DAY:
                    workHour = 8;
                    break;
                case HALF_DAY:
                    workHour = 4;
                    break;
                default:
                    workHour = 0;
                    break;
            }
            totalWorkHour = totalWorkHour + workHour;
            System.out.println("day#: " + totalWorkingDays + "WageHour: " + workHour);
        }
        int totalEmpWage = totalWorkHour * companyEmpWage.empRatePerHour * totalWorkingDays;
        return totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyWage("Dmart", 20, 20, 100);
        employeeWage.addCompanyWage("bigbasket", 30, 25, 120);
        employeeWage.computeEmpWage();
    }
}