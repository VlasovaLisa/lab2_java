public class NameExt {

    private String surname;
    private String firstName;
    private String patronymic;

    public NameExt(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public NameExt(String surname, String firstName) {
        this(surname, firstName, "");
    }

    public NameExt(String firstName) {
        this("", firstName, "");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String toString() {
        StringBuilder fullName = new StringBuilder();

        if (surname != null && !surname.isEmpty()) {
            fullName.append(surname);
        }
        if (firstName != null && !firstName.isEmpty()) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(firstName);
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            if (fullName.length() > 0) {
                fullName.append(" ");
            }
            fullName.append(patronymic);
        }

        if (fullName.toString().isEmpty()) {
            return "Имя не задано";
        } else {
            return fullName.toString();
        }
    }
}
