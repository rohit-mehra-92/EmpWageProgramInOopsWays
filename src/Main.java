public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage computation program");
        System.out.println();
        Employee emp = new Employee();

        int value = emp.isPresent();
        if (value == 1) {
            System.out.println("Employee is Present");
        } else
            System.out.println("Employee is Absent");
    }
}
