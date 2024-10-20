//вариант 4 Власова Елизавета

import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<DepartmentExt> departments = new ArrayList<>(); //для 3.4
    private static List<EmployeeExt> employees = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1.2
        out.println("------------------ЗАДАНИЕ 1.2------------------");
        Human cleo = new Human("Клеопатра", 152);
        Human push = new Human("Пушкин", 167);
        Human vlad = new Human("Владимир", 189);

        out.println(cleo);
        out.println(push);
        out.println(vlad);

        out.print("Хотите создать своего человека(да/нет)? ");
         while (true) {
             String choise;
             while (true) {
                 choise = in.nextLine().trim().toLowerCase();
                 if (choise.equals("да") || choise.equals("нет")) {
                     break;
                 } else {
                     out.println("Некорректный ввод, введите 'да' или 'нет'");
                 }
             }
             if (choise.equals("нет")) {
                 out.println("Переход к следующему заданию");
                 break;
             }
             String name;
             while (true) {
                 out.print("Введите имя: ");
                 name = in.nextLine().trim();
                 if (!name.isEmpty()) {
                     break;
                 } else {
                     out.println("Имя не может быть пустым, повторите попытку");
                 }
             }
             int height;
             while (true) {
                 out.print("Введите рост: ");
                 if (in.hasNextInt()) {
                     height = in.nextInt();
                     in.nextLine();
                     if (height >= 40 && height <= 300) {
                         break;
                     } else {
                         out.println("Людей с таким ростом не существует, повторите попытку");
                     }
                 } else {
                     out.println("Некорректный ввод, должно быть целое число, повторите попытку");
                     in.next();
                 }
             }
             Human newHuman = new Human(name, height);
             out.println("Новый человек : " + newHuman);
             out.print("Хотите добавить еще одного человека (да/нет)? ");
         }

         //1.3
        out.println("------------------ЗАДАНИЕ 1.3------------------");
        Name cleo1 = new Name("", "Клеопатра", "");
        Name push1 = new Name("Пушкин", "Александр", "Сергеевич");
        Name vlad1 = new Name("Маяковский", "Владимир", "");

        System.out.println(cleo1);
        System.out.println(push1);
        System.out.println(vlad1);

        out.print("Хотите добавить новое имя (да/нет)? ");
        while (true) {
            String choise1;
            while (true) {
                choise1 = in.nextLine().trim().toLowerCase();
                if (choise1.equals("да") || choise1.equals("нет")) {
                    break;
                } else {
                    out.println("Некорректный ввод, введите 'да' или 'нет'");
                }
            }
            if (choise1.equals("нет")) {
                out.println("Переход к следующему заданию");
                break;
            }
            out.print("Введите фамилию: ");
            String surname = in.nextLine().trim();
            out.print("Введите имя: ");
            String firstName = in.nextLine().trim();;
            out.print("Введите отчество: ");
            String patronymic = in.nextLine().trim();

            Name newName = new Name(surname, firstName, patronymic);
            out.println("Новое имя: " + newName);
            out.print("Хотите добавить еще одно новое имя (да/нет)? ");
        }

        //2.4
        out.println("------------------ЗАДАНИЕ 2.4------------------");
        Department itDep = new Department("IT");  //создаем отдел

        Employee pet = new Employee("Петров", itDep);  //создаем сотрудников
        Employee koz = new Employee("Козлов", itDep);
        Employee sid = new Employee("Сидоров", itDep);
        pet.setDepartment(itDep);  //устанавливаем отдел сотрудников
        koz.setDepartment(itDep);
        sid.setDepartment(itDep);

        itDep.setHead(koz); //козлов - начальник

        out.println(pet);
        out.println(koz);
        out.println(sid);

        out.print("Хотите добавить нового сотрудника (да/нет)? ");
        while (true) {
            String choise2 = in.nextLine().trim().toLowerCase();
            if (choise2.equals("да")) {

                out.print("Введите имя нового сотрудника: ");
                String name12 = in.nextLine().trim();
                out.print("Введите название отдела для нового сотрудника: ");
                String departmentName = in.nextLine().trim();


                Department department;
                if (itDep.getName().equalsIgnoreCase(departmentName)) {
                    department = itDep;
                } else {
                    department = new Department(departmentName);
                    out.println("Отдел " + departmentName + " создан");
                }

                Employee newEmployee = new Employee(name12, department);

                out.print("Хотите назначить " + name12 + " начальником отдела " + departmentName + " (да/нет)? ");
                while (true) {
                    String choise3 = in.nextLine().trim().toLowerCase();
                    if (choise3.equals("да")) {
                        department.setHead(newEmployee);
                        out.println("Новый сотрудник: " + name12 + " назначен начальником отдела " + departmentName);
                        out.print("Хотите добавить еще одного сотрудника (да/нет)? ");
                        break;
                    } else if (choise3.equals("нет")){
                        out.println("Новый сотрудник: " + newEmployee);
                        out.print("Хотите добавить еще одного сотрудника (да/нет)? ");
                        break;
                    } else {
                        out.println("Некорректный ввод, введите 'да' или 'нет'");
                    }
                }

            } else if (choise2.equals("нет")) {
                out.println("Переход к следующему заданию");
                break;
            } else {
                out.println("Некорректный ввод, введите 'да' или 'нет'");
            }
        }

        //3.4
        out.println("------------------ЗАДАНИЕ 3.4------------------");
        DepartmentExt itDepartment = new DepartmentExt("IT");
        departments.add(itDepartment);

        EmployeeExt petrov = new EmployeeExt("Петров", itDepartment);
        EmployeeExt kozlov = new EmployeeExt("Козлов", itDepartment);
        EmployeeExt sidorov = new EmployeeExt("Сидоров", itDepartment);
        itDepartment.addEmployee(petrov);
        itDepartment.addEmployee(kozlov);
        itDepartment.addEmployee(sidorov);
        employees.add(petrov);
        employees.add(kozlov);
        employees.add(sidorov);

        itDepartment.setHead(kozlov);

        out.println(petrov);
        out.println(kozlov);
        out.println(sidorov);

        out.println("Список сотрудников отдела " + itDepartment.getName() + ":");
        for (EmployeeExt emp : itDepartment.getEmployees()) {
            out.println(emp.getName());
        }

        boolean exit = false;
        while (!exit) {
            out.println("Выберите цифру действия, которое хотите сделать:");
            out.println("1. Добавить новый отдел");
            out.println("2. Добавить нового сотрудника");
            out.println("3. Показать список сотрудников отдела");
            out.println("4. Выйти");
            out.print("Ваш выбор: ");
            int choice9 = in.nextInt();
            in.nextLine();

            switch (choice9) {
                case 1:
                    addNewDepartment();
                    break;
                case 2:
                    addNewEmployee();
                    break;
                case 3:
                    showEmployeesByDepartment();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    out.println("Такого действия нет, повторите попытку");
            }
        }

        //4.5
        out.println("------------------ЗАДАНИЕ 4.5------------------");
        NameExt cleo2 = new NameExt("","Клеопатра");
        NameExt push2 = new NameExt("Пушкин", "Александр", "Сергеевич");
        NameExt vlad2 = new NameExt("Маяковский", "Владимир");
        NameExt christopher = new NameExt("Бонифатьевич", "Христофор");

        out.println(cleo2);
        out.println(push2);
        out.println(vlad2);
        out.println(christopher);

        out.print("Хотите добавить новое имя (да/нет)? ");
        while (true) {
            String choice4;
            while (true) {
                choice4 = in.nextLine().trim().toLowerCase();
                if (choice4.equals("да") || choice4.equals("нет")) {
                    break;
                } else {
                    out.println("Некорректный ввод, введите 'да' или 'нет'");
                }
            }
            if (choice4.equals("нет")) {
                out.println("Переход к следующему заданию");
                break;
            }

            out.print("Введите фамилию: ");
            String surname = in.nextLine().trim();
            out.print("Введите имя: ");
            String firstName = in.next().trim();
            in.nextLine();
            out.print("Введите отчество: ");
            String patronymic = in.nextLine().trim();

            NameExt newName;
            if (!surname.isEmpty() && !patronymic.isEmpty()) {
                newName = new NameExt(surname, firstName, patronymic);
            } else if (!surname.isEmpty()) {
                newName = new NameExt(surname, firstName);
            } else {
                newName = new NameExt(firstName);
            }

            out.println("Новое имя: " + newName);
            out.print("Хотите добавить еще одно новое имя (да/нет)? ");
        }

        //5.1
        out.println("------------------ЗАДАНИЕ 5.1------------------");

        Gun gun1 = new Gun(3);
        out.println("Создан пистолет: " + gun1);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Выстрел " + i + ": ");
            gun1.shoot();
        }

        out.print("Хотите добавить новый пистолет (да/нет)? ");
        while (true) {
            String choice5;
            while (true) {
                choice5 = in.nextLine().trim().toLowerCase();
                if (choice5.equals("да") || choice5.equals("нет")) {
                    break;
                } else {
                    out.println("Некорректный ввод, введите 'да' или 'нет'");
                }
            }
            if (choice5.equals("нет")) {
                out.println("Окончание программы");
                break;
            }

            Gun userGun;

            out.print("Хотите ввести количество пуль (да/нет)? ");
            while (true) {
                String choice6;
                while (true) {
                    choice6 = in.nextLine().trim().toLowerCase();
                    if (choice6.equals("да") || choice6.equals("нет")) {
                        break;
                    } else {
                        out.println("Некорректный ввод, введите 'да' или 'нет'");
                    }
                }
                if (choice6.equals("нет")) {
                    userGun = new Gun();
                    break;
                }

                int bullets;
                while (true) {
                    out.print("Введите количество пуль в новом пистолете: ");
                    if (in.hasNextInt()) {
                        bullets = in.nextInt();
                        if (bullets >= 0) {
                            break;
                        } else {
                            out.println("Количество пуль не может быть отрицательным, повторите попытку");
                        }
                    } else {
                        out.println("Некорректный ввод, должно быть целое число, повторите попытку");
                        in.next();
                    }
                }
                in.nextLine();
                userGun = new Gun(bullets);
                break;
            }

            out.println("Создан новый пистолет: " + userGun);
            out.print("Вы хотите выстрелить из нового пистолета (да/нет)? : ");
            while (true) {
                String choice7;
                while (true) {
                    choice7 = in.nextLine().trim().toLowerCase();
                    if (choice7.equals("да") || choice7.equals("нет")) {
                        break;
                    } else {
                        out.println("Некорректный ввод, введите 'да' или 'нет'");
                    }
                }
                if (choice7.equals("нет")) {
                    out.println("Выстрелы отменены");
                    break;
                }

                int shots;
                while (true) {
                    out.print("Сколько вы хотите сделать выстрелов? ");
                    if (in.hasNextInt()) {
                        shots = in.nextInt();
                        if (shots >= 0) {
                            break;
                        } else {
                            out.println("Количество выстрелов не может быть отрицательным, повторите попытку");
                        }
                    } else {
                        out.println("Некорректный ввод, должно быть целое число, повторите попытку");
                        in.next();
                    }
                }
                in.nextLine();
                for (int i = 1; i <= shots; i++) {
                    out.print("Выстрел " + i + ": ");
                    userGun.shoot();
                }
                break;

            }

            out.print("Хотите добавить еще однит пистолет (да/нет)? ");
        }

        in.close();
    }


    //для 3.4
    private static void addNewDepartment() {
        out.print("Введите название отдела: ");
        String deptName = scanner.nextLine();
        DepartmentExt department = new DepartmentExt(deptName);
        departments.add(department);
        out.println("Отдел " + deptName + " успешно добавлен");
    }

    private static void addNewEmployee() {
        out.print("Введите имя сотрудника: ");
        String empName = scanner.nextLine();

        DepartmentExt department = null;

        while (department == null) {
            out.print("Введите название отдела для сотрудника: ");
            String deptName = scanner.nextLine();

            department = findDepartmentByName(deptName); //проверка на существование отдела
            if (department == null) {
                out.println("Ошибка: отдел с названием \"" + deptName + "\" не найден. Пожалуйста, введите существующий отдел");
            }
        }

        EmployeeExt employee = new EmployeeExt(empName, department);
        employees.add(employee);
        department.addEmployee(employee);

        out.println("Сотрудник " + empName + " успешно добавлен в отдел " + department.getName());
    }

    private static void showEmployeesByDepartment() {
        out.print("Введите имя сотрудника для получения списка коллег: ");
        String empName = scanner.nextLine();

        EmployeeExt employee = findEmployeeByName(empName);
        if (employee != null) {
            DepartmentExt department = employee.getDepartment();
            out.println("Список сотрудников отдела " + department.getName() + ":");
            for (EmployeeExt emp : department.getEmployees()) {
                out.println(emp.getName());
            }
        } else {
            out.println("Сотрудник с таким именем не найден.");
        }
    }

    private static DepartmentExt findDepartmentByName(String name) {
        for (DepartmentExt department : departments) {
            if (department.getName().equalsIgnoreCase(name)) {
                return department;
            }
        }
        return null;
    }

    private static EmployeeExt findEmployeeByName(String name) {
        for (EmployeeExt employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                return employee;
            }
        }
        return null;
    }

}