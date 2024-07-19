import java.util.Objects;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int transgression, int magicPower, int hardworking, int loyal, int honest) {
        super(name, transgression, magicPower);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }


    public void compareHufflepuffStudents(Hufflepuff students) {
        if (getPower() > students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s ", this, students));
        } else if (getPower() < students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s", students, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int getPower() {
        return hardworking + loyal + honest;
    }

    public int getHardworking() {
        return hardworking;
    }


    public int getLoyal() {
        return loyal;
    }


    public int getHonest() {
        return honest;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Hufflepuff that = (Hufflepuff) object;
        return hardworking == that.hardworking && loyal == that.loyal && honest == that.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hardworking, loyal, honest);
    }


    public String fullInfo() {
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                "} " + super.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
