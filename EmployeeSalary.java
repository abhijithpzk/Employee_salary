
 
import java.util.ArrayList;
import java.util.List;
 
import Employee;
 
public class EmployeeSalary{
 
    public static void main(String a[]) {
 
        List<Employee> empList = new ArrayList<>();
        
        empList.add(new Employee("John", 30, 1500));
        empList.add(new Employee("Robert", 36, 1200));
        empList.add(new Employee("Michael", 40, 3000));
        empList.add(new Employee("William	", 45, 5000));
        empList.add(new Employee("David", 50, 1500));
        empList.add(new Employee("Richard", 38, 5000));
        empList.add(new Employee("Joseph", 40, 2500));
        empList.add(new Employee("Thomas", 58, 5000));
        empList.add(new Employee("Charles", 37, 1800));
        empList.add(new Employee("Christopher	", 48, 5000));
        empList.add(new Employee("Daniel", 56, 15000));
        empList.add(new Employee("Matthew", 54, 10500));
        empList.add(new Employee("Anthony", 53, 2500));
        empList.add(new Employee("Donald", 53, 7500));
		empList.add(new Employee("Nataraja G", 32, 8000));
        empList.add(new Employee("Nagesh Y", 22, 15000));
        empList.add(new Employee("Vasu V", 25, 2500));
        empList.add(new Employee("Amar", 30, 12500));
        empList.add(new Employee("James", 33, 2500));
		empList.add(new Employee("Mark", 49, 8500));
        empList.add(new Employee("Paul",41 , 3000));
        empList.add(new Employee("Steven", 52, 6400));
        empList.add(new Employee("Andrew", 28, 5000));
        empList.add(new Employee("Kenneth", 39, 11500));
        empList.add(new Employee("Joshua", 40, 1500));
        empList.add(new Employee("George", 39, 4500));
        empList.add(new Employee("Kevin", 41, 6500));
        empList.add(new Employee("Brian", 43, 8500));
        empList.add(new Employee("Edward", 45, 2500));
        empList.add(new Employee("Ronald", 56, 1800));
        empList.add(new Employee("Timothy", 55, 8500));
        empList.add(new Employee("Jason", 38, 5700));
        empList.add(new Employee("Jeffrey", 29, 6500));
        empList.add(new Employee("Ryan", 46, 8600));
        empList.add(new Employee("Jacob", 38, 7500));
        empList.add(new Employee("Gary", 36, 5000));
        empList.add(new Employee("Nicholas", 54, 1400));
        empList.add(new Employee("Eric", 30, 1453));
        empList.add(new Employee("Stephen	", 42, 6300));
        empList.add(new Employee("Jonathan", 33, 6300));
        empList.add(new Employee("Larry", 46, 8900));
        empList.add(new Employee("Justin", 34, 500));
        empList.add(new Employee("Scott	", 39, 6500));
        empList.add(new Employee("Brandon", 50, 6000));
        empList.add(new Employee("Frank", 48, 1300));
        empList.add(new Employee("Benjamin",56 , 700));
        empList.add(new Employee("Gregory", 46, 5000));
        empList.add(new Employee("Samuel", 36, 2500));
        empList.add(new Employee("Raymond", 46, 3500));
        empList.add(new Employee("Patrick", 47, 1500));
        empList.add(new Employee("Alexander", 38, 3500));
        empList.add(new Employee("Jack	", 48, 5000));
        empList.add(new Employee("Dennis", 54, 4700));
        empList.add(new Employee("Jerry", 56, 5000));
        empList.add(new Employee("Tyler", 45, 4500));
        empList.add(new Employee("Aaron", 45, 6500));
        empList.add(new Employee("Jose", 56, 4560));
        empList.add(new Employee("Henry", 22, 4500));
        empList.add(new Employee("Douglas	", 45, 5500));
        empList.add(new Employee("Adam", 55, 5500));
        empList.add(new Employee("Peter", 32, 5400));
        empList.add(new Employee("Nathan", 34, 17500));
        empList.add(new Employee("Zachary", 23, 2500));
        empList.add(new Employee("Walter", 45, 6500));
        empList.add(new Employee("Kyle", 43, 5500));
        empList.add(new Employee("Harold", 40, 5500));
        empList.add(new Employee("Carl", 56, 300));
        empList.add(new Employee("Jeremy", 40, 400));
        empList.add(new Employee("Keith", 46, 6500));
        empList.add(new Employee("Roger", 36, 5500));
        empList.add(new Employee("Gerald", 56, 5500));
        empList.add(new Employee("Ethan", 36, 5500));
        empList.add(new Employee("Arthur", 35, 7500));
        empList.add(new Employee("Terry", 56, 5500));
        empList.add(new Employee("Christian	", 52, 500));
        empList.add(new Employee("Sean", 45, 5600));
        empList.add(new Employee("Lawrence", 56, 15500));
        empList.add(new Employee("Austin", 23, 1500));
        empList.add(new Employee("Joe", 46, 2500));
        empList.add(new Employee("Noah", 46, 5500));
        empList.add(new Employee("Jesse", 53, 5500));
        empList.add(new Employee("Albert", 31, 5500));
        empList.add(new Employee("Bryan", 32, 2500));
        empList.add(new Employee("Billy", 22, 500));
        empList.add(new Employee("Bruce", 36, 500));
        empList.add(new Employee("Willie", 37, 6500));
        empList.add(new Employee("Jordan", 23, 5500));
        empList.add(new Employee("Dylan", 33, 5500));
        empList.add(new Employee("Alan", 49, 6500));
        empList.add(new Employee("Ralph", 50, 7500));
        empList.add(new Employee("Gabriel", 55, 9500));
        empList.add(new Employee("Roy", 27, 500));
        empList.add(new Employee("Juan", 42, 12500));
        empList.add(new Employee("Wayne	", 23, 1300));
        empList.add(new Employee("Eugene", 45, 8000));
        empList.add(new Employee("Logan", 50, 10000));
        empList.add(new Employee("Randy	", 51, 15000));
        empList.add(new Employee("Louis", 56, 700));
        empList.add(new Employee("Russell", 42, 500));
        empList.add(new Employee("Vincent", 46, 7500));
        empList.add(new Employee("Philip", 48, 8500));
        empList.add(new Employee("Bobby", 53, 1500));


 
        empList.stream().filter(emp->emp.getSalary() > 3000).forEach(System.out::println);
    }
}


 
public class Employee {
 
    private String name;
    private  Integer age;
    private Integer salary;
 
    public Employee(String name, Integer age, Integer salary) {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
 
    
    public String toString() {
 
        return "name: "+ this.name +" | age: "+ this.age +" | salary: "+this.salary;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}