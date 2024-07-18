import java.util.Objects;

public class Ravenclaw extends hogwarts {
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, int transgression, int magicPower, int wise, int witty, int creative) {
        super(name, transgression, magicPower);
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }


    public void compareRavenclawStudents(Ravenclaw students) {
        if (getPower() > students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s ", this, students));
        } else if (getPower() < students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s", students, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int getPower() {
        return  wise + witty + creative;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Ravenclaw ravenclaw = (Ravenclaw) object;
        return wise == ravenclaw.wise && witty == ravenclaw.witty && creative == ravenclaw.creative;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wise, witty, creative);
    }


    public String fullInfo() {
        return "Ravenclaw{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creative=" + creative +
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
