public class MVCPatternDemo {
    public static void main(String[] args) {

        Employee employeeModel = retriveEmployeeFromDatabase();

        EmployeeView employeeView = new EmployeeView();

        EmployeeController employeeController = new EmployeeController(employeeModel, employeeView);

        employeeModel.setFirstName("Ayesha");
        employeeModel.setSalary((float) 9000.00);
        employeeController.updateView();


    }

        private static Employee retriveEmployeeFromDatabase(){
            Employee employee = new Employee();
            employee.setEmployeeID(001);
            employee.setFirstName("Esha Jawed");
            employee.setLastName("Parekh");
            employee.setGender("Female");
            employee.setHiredDate("9/August/2020");
            employee.setSalary((float) 20000.00);
            return employee;
        }
}
