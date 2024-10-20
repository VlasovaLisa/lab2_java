public class Employee {

    private String name;
    private Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String toString() {
        if (department.getHead() == null) {
            return name + " работает в отделе " + department.getName() + ", начальник которого пока не назначен";
        } else if (this == department.getHead()) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getHead().getName();
        }
    }
}
