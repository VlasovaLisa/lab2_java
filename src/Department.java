public class Department {

    private String name;
    private Employee head;

    public Department(String name) {
        this.name = name;
        this.head = head = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getHead() {
        return head;
    }

    public void setHead(Employee head) {
        this.head = head;
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
