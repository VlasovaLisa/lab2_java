import static java.lang.System.out;

public class Gun {

    private int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    public Gun() {
        this.bullets = 5;
    }

    public void shoot() {
        if (bullets > 0) {
            out.println("Бах!");
            bullets--;
        } else {
            out.println("Клац!");
        }
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public String toString() {
        return "Пистолет с " + bullets + " патронами";
    }

}

