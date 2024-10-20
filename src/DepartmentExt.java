import java.util.ArrayList;
import java.util.List;

public class DepartmentExt {
    private String name;
    private EmployeeExt head;
    private List<EmployeeExt> employees;

    // Конструктор
    public DepartmentExt(String name) {
        this.name = name;
        this.head = null;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeExt getHead() {
        return head;
    }

    public void setHead(EmployeeExt head) {
        this.head = head;
    }

    public List<EmployeeExt> getEmployees() {
        return employees; //возврат списка сотрудников
    }

    //метод добавления сотрудника в отдел
    public void addEmployee(EmployeeExt employee) {
        employees.add(employee);
        employee.setDepartment(this); //установить отдел для сотрудника
    }

    public String toString() {
        String result = "Отдел: " + name;
        if (head != null) {
            result += ", начальник: " + head.getName();
        } else {
            result += ", начальник пока не назначен";
        }
        return result;
    }
}
