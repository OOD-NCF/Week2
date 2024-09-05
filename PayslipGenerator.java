public class PayslipGenerator {
    public void generatePayslip(Employee employee) {
        System.out.println("Payslip for " + employee.getName() + ": $" + employee.getSalary());
    }
}
