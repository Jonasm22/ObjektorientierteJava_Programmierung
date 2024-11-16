public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Jonas", 32, 3000.00, "Germany");

        Employee employee2 = new Employee("Sarah", 30, 3200.00, "Germany");

        employee2.raiseSalary();

        System.out.println(employee1.salary);
        System.out.println(employee2.salary);




    }


}
