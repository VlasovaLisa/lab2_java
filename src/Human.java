public class Human {

    private String Name;
    private int Height;

    public Human(String Name, int Height) {  //конструктор
        this.Name = Name;
        this.Height = Height;
    }

    //свойства
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return this.Name;
    }

    public void setHeihgt(int Height) {
        this.Height = Height;
    }

    public int getHeight() {
        return this.Height;
    }

    //метод toString
    public String toString() {
        return "Человек с именем \"" + this.Name + "\" и ростом " + this.Height;
    }

}
