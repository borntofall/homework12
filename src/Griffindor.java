import java.util.Objects;

public class Griffindor extends hogwarts {

    private int nobility;

    private int honor;

    private int bravery;


    public Griffindor(String name, int transgression, int magicPower, int nobility, int honor, int bravery) {
        super(name, transgression, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void compareGriffindorsStudents(Griffindor students) {
        if (getPower() > students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s ", this, students));
        } else if (getPower() < students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s", students, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int getPower() {
        return nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Griffindor that = (Griffindor) object;
        return nobility == that.nobility && honor == that.honor && bravery == that.bravery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nobility, honor, bravery);
    }


    public String fullInfo() {
        return "Griffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
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


