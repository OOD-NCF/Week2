public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", "Software Engineer", 80000);

        // Create separate objects for processing payroll and generating payslip
        PayrollProcessor payrollProcessor = new PayrollProcessor();
        PayslipGenerator payslipGenerator = new PayslipGenerator();

        // Generate the employee's payslip
        System.out.println("Generating Payslip:");
        payslipGenerator.generatePayslip(employee);

        // Process payroll for the employee
        System.out.println("\nProcessing Payroll:");
        payrollProcessor.processPayroll(employee);
    }
}
