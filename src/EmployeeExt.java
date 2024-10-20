public class EmployeeExt {
    private String name;
    private DepartmentExt department;

    public EmployeeExt(String name, DepartmentExt department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentExt getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentExt department) {
        this.department = department;
    }

    public String toString() {
        if (this == department.getHead()) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getHead().getName();
        }
    }
}
