class Company {
    String companyName = "ABC Technologies";
}

class Department extends Company {
    String departmentName = "IT Department";
}

class Employee extends Department {
    String employeeName = "Soorya";

    void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Department Name: " + departmentName);
        System.out.println("Employee Name: " + employeeName);
    }
}

public class Companies{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayDetails();
    }
}
