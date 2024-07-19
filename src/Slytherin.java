import java.util.Objects;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, int transgression, int magicPower, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, transgression, magicPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public void compareSlytherinStudents(Slytherin students) {
        if (getPower() > students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s ", this, students));
        } else if (getPower() < students.getPower()) {
            System.out.println(String.format("%s лучше, чем %s", students, this));
        } else {
            System.out.println("Студенты равны");
        }
    }

    public int getPower() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }


    public int getDetermination() {
        return determination;
    }


    public int getAmbition() {
        return ambition;
    }


    public int getResourcefulness() {
        return resourcefulness;
    }


    public int getThirstForPower() {
        return thirstForPower;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Slytherin slytherin = (Slytherin) object;
        return cunning == slytherin.cunning && determination == slytherin.determination && ambition == slytherin.ambition && resourcefulness == slytherin.resourcefulness && thirstForPower == slytherin.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cunning, determination, ambition, resourcefulness, thirstForPower);
    }


    public String fullInfo() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
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
