import javax.xml.namespace.QName;
import java.lang.invoke.StringConcatFactory;

public class Employee {

    String name ;
    int age;
    double salary;
    String location ;

        public Employee(String name, int age, double salary, String location) {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.location = location;
        }


        void raiseSalary(){

           this.salary = this.salary * 1.2;

            //System.out.println("My name is: " + name + " i am : " + age + " my age is: " + "my salary is: " +Raisesalary + "€" + " i live in " + location);

        }


     /* void ShowInformation(){
        System.out.println("My name is: " + name + " i am : " + age + " my age is: " + "my salary is: " +salary + "€" + " i live in " + location);
    */
}

