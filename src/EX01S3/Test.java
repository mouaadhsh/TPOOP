package EX01S3;

public class Test {
    public static void main(String[] args) {
        employee employees = new employee();
        EmployeeCommission emp1 = new EmployeeCommission("youcef",200,20,100);
        EmployerHourly emp2 = new EmployerHourly("mouhad",15,8);
        FixedEmploy emp3 = new FixedEmploy("akali",1500);
        System.out.println(employees.average(employees.listofemployee));
    }




}
